package ru.noties.jlatexmath.awt.font;

import android.graphics.Paint;
import android.graphics.Rect;
import ru.noties.jlatexmath.awt.Font;
import ru.noties.jlatexmath.awt.Graphics2D;
import ru.noties.jlatexmath.awt.geom.Rectangle2D;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public class TextLayout {
    private final Rectangle2D bounds;
    private final char[] chars;
    private final Font font;

    public TextLayout(String str, Font font, FontRenderContext fontRenderContext) {
        this.chars = str.toCharArray();
        this.font = font;
        Paint paint = new Paint(1);
        paint.setTypeface(font.typeface());
        paint.setTextSize(font.size());
        paint.getTextBounds(str, 0, str.length(), new Rect());
        this.bounds = new Rectangle2D.Float(r4.left, r4.top, r4.width(), r4.height());
    }

    public void draw(Graphics2D graphics2D, int i10, int i11) {
        Font font = graphics2D.getFont();
        Font font2 = this.font;
        boolean z10 = font2 != font;
        if (z10) {
            graphics2D.setFont(font2);
        }
        char[] cArr = this.chars;
        graphics2D.drawChars(cArr, 0, cArr.length, i10, i11);
        if (z10) {
            graphics2D.setFont(font);
        }
    }

    public Rectangle2D getBounds() {
        return this.bounds;
    }
}
