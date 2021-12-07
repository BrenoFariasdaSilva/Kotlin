import br.com.brenofarias.bytebank.model.Client
import br.com.brenofarias.bytebank.model.Director
import br.com.brenofarias.bytebank.model.InternSystem
import br.com.brenofarias.bytebank.model.Manager

fun testAuthentication() {
    val manager = Manager(
        name = "Breno Farias",
        cpf = "135.135.135-69",
        salary = 15000.00,
        password = 1337
    )

    val director = Director(
        name = "Amanda Farias",
        cpf = "137.137.137-37",
        salary = 12000.00,
        password = 1357,
        plr = 500.0
    )

    val client = Client(
        name = "Marcia Farias",
        cpf = "135.135.135-35",
        password = 123456
    )

    val internSystem = InternSystem()
    internSystem.login(manager, 1337)
    internSystem.login(director, 1357)
    internSystem.login(client, 123456)
}