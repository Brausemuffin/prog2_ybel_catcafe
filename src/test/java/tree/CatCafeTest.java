package tree;

import org.junit.jupiter.api.Test;

public class CatCafeTest {

  @Test
  void givenEmptyCafe_whenAddingCat_thenCafeContainsCat() {}

  @Test
  void givenTwoCats_whenAdded_thenCafeContainsBothCats() {}

  @Test
  void givenExistingCat_whenRemoved_thenCafeDoesNotContainCat() {}

  @Test
  void givenEmptyCafe_thenCafeSizeIsZero() {}

  @Test
  void givenThreeCats_whenAdded_thenSizeIsThree() {}

  @Test
  void givenDuplicateCat_whenAdded_thenCatExistsOnlyOnce() {}

  @Test
  void givenNullName_whenAddingCat_thenExceptionIsThrown() {}

  @Test
  void givenMissingCat_whenRemoving_thenNothingChanges() {}

  @Test
  void givenExistingCat_whenSearching_thenResultIsTrue() {}

  @Test
  void givenCatNameWithUppercase_whenSearchingLowercase_thenCatFound() {}
}
