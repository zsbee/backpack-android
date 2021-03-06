package net.skyscanner.backpack.panel

import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4
import net.skyscanner.backpack.R
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class BpkPanelTest {

  @Test
  fun test_with_padding() {
    val context = InstrumentationRegistry.getInstrumentation().targetContext
    val panel = BpkPanel(context)
    panel.padding = true
    Assert.assertEquals(context.resources.getDimensionPixelOffset(R.dimen.bpkSpacingSm), panel.paddingBottom)
    Assert.assertEquals(context.resources.getDimensionPixelOffset(R.dimen.bpkSpacingSm), panel.paddingLeft)
    Assert.assertEquals(context.resources.getDimensionPixelOffset(R.dimen.bpkSpacingSm), panel.paddingTop)
    Assert.assertEquals(context.resources.getDimensionPixelOffset(R.dimen.bpkSpacingSm), panel.paddingRight)
  }

  @Test
  fun test_without_padding() {
    val context = InstrumentationRegistry.getInstrumentation().targetContext
    val panel = BpkPanel(context)
    panel.padding = false
    Assert.assertEquals(0, panel.paddingBottom)
    Assert.assertEquals(0, panel.paddingLeft)
    Assert.assertEquals(0, panel.paddingTop)
    Assert.assertEquals(0, panel.paddingRight)
  }
}
