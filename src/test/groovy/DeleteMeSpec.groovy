import spock.lang.Specification

/**
 * Created by Frank on 23-Apr-16.
 */
class DeleteMeSpec extends Specification {
    def "GetString"() {
        expect:
            new DeleteMe().string == 'a string'
    }

    def "ok-Asd"() {
        expect:
            new DeleteMe().asd(true) == 'ok-asd'

    }
    def "Asd"() {
        expect:
            new DeleteMe().asd(false) == 'asd'

    }
}
