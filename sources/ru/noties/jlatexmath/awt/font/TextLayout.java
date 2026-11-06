package ru.noties.jlatexmath.awt.font;

import android.graphics.Paint;
import android.graphics.Rect;
import ru.noties.jlatexmath.awt.Font;
import ru.noties.jlatexmath.awt.Graphics2D;
import ru.noties.jlatexmath.awt.geom.Rectangle2D;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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

    public void draw(Graphics2D graphics2D, int i7, int i10) {
        Font font = graphics2D.getFont();
        Font font2 = this.font;
        boolean z9 = font2 != font;
        if (z9) {
            graphics2D.setFont(font2);
        }
        char[] cArr = this.chars;
        graphics2D.drawChars(cArr, 0, cArr.length, i7, i10);
        if (z9) {
            graphics2D.setFont(font);
        }
    }

    public Rectangle2D getBounds() {
        return this.bounds;
    }
}
