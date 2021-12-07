import br.com.brenofarias.bytebank.model.Analist
import br.com.brenofarias.bytebank.model.BonusCalculator
import br.com.brenofarias.bytebank.model.Director
import br.com.brenofarias.bytebank.model.Manager

fun testEmployees() {
    val breno = Analist(
        name = "Breno Farias",
        cpf = "1337.1337.1337-35",
        salary = 1000.00
    )

    println("Breno Name: ${breno.name}")
    println("Breno CPF: ${breno.cpf}")
    println("Breno Salary: ${breno.salary}")
    println("Breno Bonus: ${breno.bonus}")

    val manoel = Manager(
        name = "Manoel Campos",
        cpf = "135.713.571-35",
        salary = 15000.00,
        password = 1357
    )

    println("Manoel Name: ${manoel.name}")
    println("Manoel CPF: ${manoel.cpf}")
    println("Manoel Salary: ${manoel.salary}")
    println("Manoel Bonus: ${manoel.bonus}")
    if (manoel.authenticate(password = 1357)) {
        println("Welcome, ${manoel.name}")
    } else {
        println("You aren't administrator, ${manoel.name}")
    }

    val amanda = Director(
        name = "Amanda Farias",
        cpf = "731.123.111-69",
        salary = 30000.00,
        password = 4202,
        plr = 1000.00
    )

    val raysa = Analist(
        name = "Raysa Campos",
        cpf = "123.123.321-91",
        salary = 5000.00,
    )

    println("Amanda Name: ${amanda.name}")
    println("Amanda CPF: ${amanda.cpf}")
    println("Amanda Salary: ${amanda.salary}")
    println("Amanda Bonus: ${amanda.bonus}")
    println("Amanda PLR: ${amanda.plr}")
    if (amanda.authenticate(password = 4202)) {
        println("Welcome, ${amanda.name}")
    } else {
        println("You aren't administrator, ${amanda.name}")
    }

    println("Raysa Name: ${raysa.name}")
    println("Raysa CPF: ${raysa.cpf}")
    println("Raysa Salary: ${raysa.salary}")
    println("Raysa Bonus: ${raysa.bonus}")

    val calculator = BonusCalculator()
    calculator.register(breno)
    calculator.register(manoel)
    calculator.register(amanda)
    calculator.register(raysa)

    println("Bonus Total: ${calculator.total}")
}