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

    @Retention(RetentionPolicy.CLASS)
    public @interface Align {
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public static Builder builder(String str) {
        return new Builder(str);
    }

    JLatexMathDrawable(Builder builder) {
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

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Drawable drawable = this.background;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004d A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0008, B:5:0x000c, B:6:0x0012, B:8:0x0020, B:12:0x0034, B:14:0x004d, B:17:0x005e, B:19:0x0064, B:20:0x0067, B:25:0x0059, B:27:0x0052, B:29:0x0028), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0008, B:5:0x000c, B:6:0x0012, B:8:0x0020, B:12:0x0034, B:14:0x004d, B:17:0x005e, B:19:0x0064, B:20:0x0067, B:25:0x0059, B:27:0x0052, B:29:0x0028), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas) {
        float min;
        int i;
        int i2;
        int i3;
        Rect bounds = getBounds();
        int save = canvas.save();
        try {
            Drawable drawable = this.background;
            if (drawable != null) {
                drawable.draw(canvas);
            }
            int width = bounds.width();
            int height = bounds.height();
            int i4 = this.iconWidth;
            if (i4 <= width && this.iconHeight <= height) {
                min = 1.0f;
                int i5 = (int) ((this.iconWidth * min) + 0.5f);
                i = (height - ((int) ((this.iconHeight * min) + 0.5f))) / 2;
                i2 = this.align;
                if (i2 != 1) {
                    i3 = (width - i5) / 2;
                } else {
                    i3 = i2 == 2 ? width - i5 : 0;
                }
                if (i == 0 || i3 != 0) {
                    canvas.translate(i3, i);
                }
                if (Float.compare(min, 1.0f) != 0) {
                    canvas.scale(min, min);
                }
                this.graphics2D.setCanvas(canvas);
                this.icon.paintIcon(null, this.graphics2D, 0, 0);
                canvas.restoreToCount(save);
            }
            min = Math.min(width / i4, height / this.iconHeight);
            int i52 = (int) ((this.iconWidth * min) + 0.5f);
            i = (height - ((int) ((this.iconHeight * min) + 0.5f))) / 2;
            i2 = this.align;
            if (i2 != 1) {
            }
            if (i == 0) {
            }
            canvas.translate(i3, i);
            if (Float.compare(min, 1.0f) != 0) {
            }
            this.graphics2D.setCanvas(canvas);
            this.icon.paintIcon(null, this.graphics2D, 0, 0);
            canvas.restoreToCount(save);
        } catch (Throwable th) {
            canvas.restoreToCount(save);
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.iconWidth;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.iconHeight;
    }

    public TeXIcon icon() {
        return this.icon;
    }

    public static class Builder {
        private int align;
        private Drawable background;
        private int color = -16777216;
        private Insets insets;
        private final String latex;
        private float textSize;

        @Deprecated
        public Builder fitCanvas(boolean z) {
            return this;
        }

        public Builder(String str) {
            this.latex = str;
        }

        public Builder textSize(float f) {
            this.textSize = f;
            return this;
        }

        public Builder color(int i) {
            this.color = i;
            return this;
        }

        public Builder align(int i) {
            this.align = i;
            return this;
        }

        public Builder background(Drawable drawable) {
            this.background = drawable;
            return this;
        }

        public Builder background(int i) {
            this.background = new ColorDrawable(i);
            return this;
        }

        public Builder padding(int i) {
            this.insets = new Insets(i, i, i, i);
            return this;
        }

        public Builder padding(int i, int i2, int i3, int i4) {
            this.insets = new Insets(i2, i, i4, i3);
            return this;
        }

        public JLatexMathDrawable build() {
            return new JLatexMathDrawable(this);
        }
    }
}
