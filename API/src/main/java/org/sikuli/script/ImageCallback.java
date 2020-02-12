/*
 * Copyright (c) 2010-2020, sikuli.org, sikulix.com - MIT license
 */

package org.sikuli.script;

import java.awt.image.BufferedImage;

public class ImageCallback {
  public BufferedImage callback(Image img) {
    return img.getBufferedImage();
  }
}
