package ru.noties.jlatexmath.awt;

import ru.noties.jlatexmath.awt.RenderingHints;
import ru.noties.jlatexmath.awt.font.FontRenderContext;
import ru.noties.jlatexmath.awt.geom.AffineTransform;
import ru.noties.jlatexmath.awt.geom.Line2D;
import ru.noties.jlatexmath.awt.geom.Rectangle2D;
import ru.noties.jlatexmath.awt.geom.RoundRectangle2D;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public interface Graphics2D extends Graphics {
    void draw(Line2D.Float r12);

    void draw(Rectangle2D.Float r12);

    void draw(RoundRectangle2D.Float r12);

    void drawArc(int i10, int i11, int i12, int i13, int i14, int i15);

    void drawChars(char[] cArr, int i10, int i11, int i12, int i13);

    void fill(Rectangle2D.Float r12);

    void fillArc(int i10, int i11, int i12, int i13, int i14, int i15);

    void fillRect(int i10, int i11, int i12, int i13);

    Color getColor();

    Font getFont();

    FontRenderContext getFontRenderContext();

    RenderingHints getRenderingHints();

    Stroke getStroke();

    AffineTransform getTransform();

    void rotate(double d);

    void rotate(double d, double d10, double d11);

    void scale(double d, double d10);

    void setColor(Color color);

    void setFont(Font font);

    void setRenderingHint(RenderingHints.Key key, Object obj);

    void setRenderingHints(RenderingHints renderingHints);

    void setStroke(Stroke stroke);

    void setTransform(AffineTransform affineTransform);

    void translate(double d, double d10);
}
