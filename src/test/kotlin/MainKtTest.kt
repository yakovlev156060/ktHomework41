import org.junit.Test

import org.junit.Assert.*


class MainKtTest {
    @Test
    fun transfer_normalMastercard() {
        val testTypeCard = "Mastercard"
        val testLastTransfers=8000000
        val testCurrentTransfer=2000000

        val rezult=transfer(
            typeCard=testTypeCard,
            lastTransfers=testLastTransfers,
            currentTransfer=testCurrentTransfer)
        assertEquals(15000,rezult)
    }

    @Test
    fun transfer_normalVK() {
        val testTypeCard = "VK"
        val testLastTransfers=8000000
        val testCurrentTransfer=2000000

        val rezult=transfer(
            typeCard=testTypeCard,
            lastTransfers=testLastTransfers,
            currentTransfer=testCurrentTransfer)
        assertEquals(0,rezult)
    }

    @Test
    fun transfer_normalVisa() {
        val testTypeCard = "Visa"
        val testLastTransfers=80000
        val testCurrentTransfer=20000

        val rezult=transfer(
            typeCard=testTypeCard,
            lastTransfers=testLastTransfers,
            currentTransfer=testCurrentTransfer)
        assertEquals(3500,rezult)
    }



    @Test
    fun transfer_badMastercard() {
        val testTypeCard = "Mastercard"
        val testLastTransfers=8000
        val testCurrentTransfer=2000

        val rezult=transfer(
            typeCard=testTypeCard,
            lastTransfers=testLastTransfers,
            currentTransfer=testCurrentTransfer)
        assertEquals(10,rezult)
    }


    @Test
    fun transfer_badVK() {
        val testTypeCard = "VK"
        val testLastTransfers=8000000
        val testCurrentTransfer=2000000

        val rezult=transfer(
            typeCard=testTypeCard,
            lastTransfers=testLastTransfers,
            currentTransfer=testCurrentTransfer)
        assertEquals(10,rezult)
    }


    @Test
    fun transfer_badVisa() {
        val testTypeCard = "Visa"
        val testLastTransfers=80000
        val testCurrentTransfer=20000

        val rezult=transfer(
            typeCard=testTypeCard,
            lastTransfers=testLastTransfers,
            currentTransfer=testCurrentTransfer)
        assertEquals(10,rezult)
    }
}