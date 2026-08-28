package ru.noties.jlatexmath.awt;

import ru.noties.jlatexmath.awt.RenderingHints;
import ru.noties.jlatexmath.awt.font.FontRenderContext;
import ru.noties.jlatexmath.awt.geom.AffineTransform;
import ru.noties.jlatexmath.awt.geom.Line2D;
import ru.noties.jlatexmath.awt.geom.Rectangle2D;
import ru.noties.jlatexmath.awt.geom.RoundRectangle2D;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public interface Graphics2D extends Graphics {
    void draw(Line2D.Float r12);

    void draw(Rectangle2D.Float r12);

    void draw(RoundRectangle2D.Float r12);

    void drawArc(int i9, int i10, int i11, int i12, int i13, int i14);

    void drawChars(char[] cArr, int i9, int i10, int i11, int i12);

    void fill(Rectangle2D.Float r12);

    void fillArc(int i9, int i10, int i11, int i12, int i13, int i14);

    void fillRect(int i9, int i10, int i11, int i12);

    Color getColor();

    Font getFont();

    FontRenderContext getFontRenderContext();

    RenderingHints getRenderingHints();

    Stroke getStroke();

    AffineTransform getTransform();

    void rotate(double d);

    void rotate(double d, double d9, double d10);

    void scale(double d, double d9);

    void setColor(Color color);

    void setFont(Font font);

    void setRenderingHint(RenderingHints.Key key, Object obj);

    void setRenderingHints(RenderingHints renderingHints);

    void setStroke(Stroke stroke);

    void setTransform(AffineTransform affineTransform);

    void translate(double d, double d9);
}
