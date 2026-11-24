package ru.noties.jlatexmath;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.scilab.forge.jlatexmath.TeXFormula;
import org.scilab.forge.jlatexmath.TeXFormula.TeXIconBuilder;
import org.scilab.forge.jlatexmath.TeXIcon;
import ru.noties.jlatexmath.awt.AndroidGraphics2D;
import ru.noties.jlatexmath.awt.Color;
import ru.noties.jlatexmath.awt.Insets;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public class JLatexMathDrawable extends Drawable {
    public static final int ALIGN_CENTER = 1;
    public static final int ALIGN_LEFT = 0;
    public static final int ALIGN_RIGHT = 2;
    private final int align;
    private final Drawable background;
    private final AndroidGraphics2D graphics2D;
    private final TeXIcon icon;
    private final int iconHeight;
    private final int iconWidth;

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    @Retention(RetentionPolicy.CLASS)
    public @interface Align {
    }

    public JLatexMathDrawable(Builder builder) {
        TeXIcon build = new TeXFormula(builder.latex).new TeXIconBuilder().setFGColor(new Color(builder.color)).setSize(builder.textSize).setStyle(0).build();
        this.icon = build;
        if (builder.insets != null) {
            build.setInsets(builder.insets);
        }
        this.align = builder.align;
        this.background = builder.background;
        this.graphics2D = new AndroidGraphics2D();
        int iconWidth = build.getIconWidth();
        this.iconWidth = iconWidth;
        int iconHeight = build.getIconHeight();
        this.iconHeight = iconHeight;
        setBounds(0, 0, iconWidth, iconHeight);
    }

    public static Builder builder(String str) {
        return new Builder(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int save = canvas.save();
        try {
            Drawable drawable = this.background;
            if (drawable != null) {
                drawable.draw(canvas);
            }
            int width = bounds.width();
            int height = bounds.height();
            int i = this.iconWidth;
            float min = (i > width || this.iconHeight > height) ? Math.min(width / i, height / this.iconHeight) : 1.0f;
            int i2 = (int) ((this.iconWidth * min) + 0.5f);
            int i3 = (height - ((int) ((this.iconHeight * min) + 0.5f))) / 2;
            int i4 = this.align;
            int i5 = i4 == 1 ? (width - i2) / 2 : i4 == 2 ? width - i2 : 0;
            if (i3 != 0 || i5 != 0) {
                canvas.translate(i5, i3);
            }
            if (Float.compare(min, 1.0f) != 0) {
                canvas.scale(min, min);
            }
            this.graphics2D.setCanvas(canvas);
            this.icon.paintIcon(null, this.graphics2D, 0, 0);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.iconHeight;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.iconWidth;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    public TeXIcon icon() {
        return this.icon;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Drawable drawable = this.background;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static class Builder {
        private int align;
        private Drawable background;
        private int color = -16777216;
        private Insets insets;
        private final String latex;
        private float textSize;

        public Builder(String str) {
            this.latex = str;
        }

        public Builder align(int i) {
            this.align = i;
            return this;
        }

        public Builder background(int i) {
            this.background = new ColorDrawable(i);
            return this;
        }

        public JLatexMathDrawable build() {
            return new JLatexMathDrawable(this);
        }

        public Builder color(int i) {
            this.color = i;
            return this;
        }

        public Builder padding(int i) {
            this.insets = new Insets(i, i, i, i);
            return this;
        }

        public Builder textSize(float f) {
            this.textSize = f;
            return this;
        }

        public Builder background(Drawable drawable) {
            this.background = drawable;
            return this;
        }

        public Builder padding(int i, int i2, int i3, int i4) {
            this.insets = new Insets(i2, i, i4, i3);
            return this;
        }

        @Deprecated
        public Builder fitCanvas(boolean z) {
            return this;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
