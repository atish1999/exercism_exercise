import java.io.FileNotFoundException;
import java.util.Optional;

class ErrorHandling {

    void handleErrorByThrowingIllegalArgumentException() {
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        throw new IllegalArgumentException();
    }

    void handleErrorByThrowingIllegalArgumentExceptionWithDetailMessage(String message) {
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        throw new IllegalArgumentException(message);
    }

    void handleErrorByThrowingAnyCheckedException() throws FileNotFoundException {
        throw new FileNotFoundException();
    }

    void handleErrorByThrowingAnyCheckedExceptionWithDetailMessage(String message) throws  FileNotFoundException{
        throw new FileNotFoundException(message);
    }

    void handleErrorByThrowingAnyUncheckedException() {
        throw new ArithmeticException();
    }

    void handleErrorByThrowingAnyUncheckedExceptionWithDetailMessage(String message) {
        throw new ArithmeticException(message);
    }

    void handleErrorByThrowingCustomCheckedException() throws CustomCheckedException {
        throw new CustomCheckedException();
    }

    void handleErrorByThrowingCustomCheckedExceptionWithDetailMessage(String message) throws CustomCheckedException {
        throw new CustomCheckedException(message);
    }

    void handleErrorByThrowingCustomUncheckedException() {
        throw new CustomUncheckedException();
    }

    void handleErrorByThrowingCustomUncheckedExceptionWithDetailMessage(String message) {
        throw new CustomUncheckedException(message);
    }

    Optional<Integer> handleErrorByReturningOptionalInstance(String integer) {
        Optional<Integer> optionalResult = null;
        Integer result = null;
        try {
            result = Integer.valueOf(integer);
            optionalResult = Optional.ofNullable(result);
        }catch (NumberFormatException exception) {
            optionalResult = Optional.empty();
        }

        return optionalResult;
    }

}
