// default package

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class sbc extends jq2 {
    public static final PorterDuff.Mode w = PorterDuff.Mode.SRC_IN;
    public qbc c;
    public PorterDuffColorFilter d;
    public ColorFilter e;
    public boolean f;
    public boolean h;
    public final float[] n;
    public final Matrix r;
    public final Rect s;

    public sbc() {
        this.h = true;
        this.n = new float[9];
        this.r = new Matrix();
        this.s = new Rect();
        qbc qbcVar = new qbc();
        qbcVar.c = null;
        qbcVar.d = w;
        qbcVar.b = new pbc();
        this.c = qbcVar;
    }

    public static sbc c(Resources resources, int i, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            sbc sbcVar = new sbc();
            ThreadLocal threadLocal = kc9.a;
            sbcVar.b = resources.getDrawable(i, theme);
            new rbc(((Drawable) sbcVar.b).getConstantState());
            return sbcVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    sbc sbcVar2 = new sbc();
                    sbcVar2.inflate(resources, xml, asAttributeSet, theme);
                    return sbcVar2;
                }
            } while (next != 1);
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e) {
            Log.e("VectorDrawableCompat", "parser error", e);
            return null;
        } catch (XmlPullParserException e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = (Drawable) this.b;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    public final PorterDuffColorFilter d(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.s;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.e;
        if (colorFilter == null) {
            colorFilter = this.d;
        }
        Matrix matrix = this.r;
        canvas.getMatrix(matrix);
        float[] fArr = this.n;
        matrix.getValues(fArr);
        float abs = Math.abs(fArr[0]);
        float abs2 = Math.abs(fArr[4]);
        float abs3 = Math.abs(fArr[1]);
        float abs4 = Math.abs(fArr[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int width = (int) (rect.width() * abs);
        int min = Math.min(2048, width);
        int min2 = Math.min(2048, (int) (rect.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        qbc qbcVar = this.c;
        Bitmap bitmap = qbcVar.f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != qbcVar.f.getHeight()) {
            qbcVar.f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            qbcVar.k = true;
        }
        boolean z = this.h;
        qbc qbcVar2 = this.c;
        if (!z) {
            qbcVar2.f.eraseColor(0);
            Canvas canvas2 = new Canvas(qbcVar2.f);
            pbc pbcVar = qbcVar2.b;
            pbcVar.a(pbcVar.g, pbc.p, canvas2, min, min2);
        } else if (qbcVar2.k || qbcVar2.g != qbcVar2.c || qbcVar2.h != qbcVar2.d || qbcVar2.j != qbcVar2.e || qbcVar2.i != qbcVar2.b.getRootAlpha()) {
            qbc qbcVar3 = this.c;
            qbcVar3.f.eraseColor(0);
            Canvas canvas3 = new Canvas(qbcVar3.f);
            pbc pbcVar2 = qbcVar3.b;
            pbcVar2.a(pbcVar2.g, pbc.p, canvas3, min, min2);
            qbc qbcVar4 = this.c;
            qbcVar4.g = qbcVar4.c;
            qbcVar4.h = qbcVar4.d;
            qbcVar4.i = qbcVar4.b.getRootAlpha();
            qbcVar4.j = qbcVar4.e;
            qbcVar4.k = false;
        }
        qbc qbcVar5 = this.c;
        if (qbcVar5.b.getRootAlpha() < 255 || colorFilter != null) {
            if (qbcVar5.l == null) {
                Paint paint2 = new Paint();
                qbcVar5.l = paint2;
                paint2.setFilterBitmap(true);
            }
            qbcVar5.l.setAlpha(qbcVar5.b.getRootAlpha());
            qbcVar5.l.setColorFilter(colorFilter);
            paint = qbcVar5.l;
        } else {
            paint = null;
        }
        canvas.drawBitmap(qbcVar5.f, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = (Drawable) this.b;
        return drawable != null ? drawable.getAlpha() : this.c.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = (Drawable) this.b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = (Drawable) this.b;
        return drawable != null ? drawable.getColorFilter() : this.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (((Drawable) this.b) != null && Build.VERSION.SDK_INT >= 24) {
            return new rbc(((Drawable) this.b).getConstantState());
        }
        this.c.a = getChangingConfigurations();
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = (Drawable) this.b;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.c.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = (Drawable) this.b;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.c.b.h;
    }

    @Override // jq2, android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i;
        int i2;
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        qbc qbcVar = this.c;
        qbcVar.b = new pbc();
        TypedArray d = dye.d(resources, theme, attributeSet, pe0.b);
        qbc qbcVar2 = this.c;
        pbc pbcVar = qbcVar2.b;
        int i3 = !dye.c(xmlPullParser, "tintMode") ? -1 : d.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i3 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i3 != 5) {
            if (i3 != 9) {
                switch (i3) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        qbcVar2.d = mode;
        ColorStateList colorStateList = null;
        int i4 = 1;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            d.getValue(1, typedValue);
            int i5 = typedValue.type;
            if (i5 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i5 < 28 || i5 > 31) {
                Resources resources2 = d.getResources();
                int resourceId = d.getResourceId(1, 0);
                ThreadLocal threadLocal = nn2.a;
                try {
                    colorStateList = nn2.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                }
            } else {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            qbcVar2.c = colorStateList2;
        }
        boolean z = qbcVar2.e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z = d.getBoolean(5, z);
        }
        qbcVar2.e = z;
        float f = pbcVar.j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = d.getFloat(7, f);
        }
        pbcVar.j = f;
        float f2 = pbcVar.k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = d.getFloat(8, f2);
        }
        pbcVar.k = f2;
        if (pbcVar.j <= 0.0f) {
            throw new XmlPullParserException(d.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 <= 0.0f) {
            throw new XmlPullParserException(d.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        pbcVar.h = d.getDimension(3, pbcVar.h);
        float dimension = d.getDimension(2, pbcVar.i);
        pbcVar.i = dimension;
        if (pbcVar.h <= 0.0f) {
            throw new XmlPullParserException(d.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(d.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alpha = pbcVar.getAlpha();
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
            alpha = d.getFloat(4, alpha);
        }
        pbcVar.setAlpha(alpha);
        String string = d.getString(0);
        if (string != null) {
            pbcVar.m = string;
            pbcVar.o.put(string, pbcVar);
        }
        d.recycle();
        qbcVar.a = getChangingConfigurations();
        qbcVar.k = true;
        qbc qbcVar3 = this.c;
        pbc pbcVar2 = qbcVar3.b;
        ArrayDeque arrayDeque = new ArrayDeque();
        mbc mbcVar = pbcVar2.g;
        qt qtVar = pbcVar2.o;
        arrayDeque.push(mbcVar);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        while (eventType != i4 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                mbc mbcVar2 = (mbc) arrayDeque.peek();
                i = depth;
                if ("path".equals(name)) {
                    lbc lbcVar = new lbc();
                    lbcVar.e = 0.0f;
                    lbcVar.g = 1.0f;
                    lbcVar.h = 1.0f;
                    lbcVar.i = 0.0f;
                    lbcVar.j = 1.0f;
                    lbcVar.k = 0.0f;
                    Paint.Cap cap = Paint.Cap.BUTT;
                    lbcVar.l = cap;
                    Paint.Join join = Paint.Join.MITER;
                    lbcVar.m = join;
                    lbcVar.n = 4.0f;
                    TypedArray d2 = dye.d(resources, theme, attributeSet, pe0.d);
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                        String string2 = d2.getString(0);
                        if (string2 != null) {
                            lbcVar.b = string2;
                        }
                        String string3 = d2.getString(2);
                        if (string3 != null) {
                            lbcVar.a = pse.c(string3);
                        }
                        lbcVar.f = dye.a(d2, xmlPullParser, theme, "fillColor", 1);
                        float f3 = lbcVar.h;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                            f3 = d2.getFloat(12, f3);
                        }
                        lbcVar.h = f3;
                        int i6 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? d2.getInt(8, -1) : -1;
                        lbcVar.l = i6 != 0 ? i6 != 1 ? i6 != 2 ? lbcVar.l : Paint.Cap.SQUARE : Paint.Cap.ROUND : cap;
                        int i7 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? d2.getInt(9, -1) : -1;
                        lbcVar.m = i7 != 0 ? i7 != 1 ? i7 != 2 ? lbcVar.m : Paint.Join.BEVEL : Paint.Join.ROUND : join;
                        float f4 = lbcVar.n;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                            f4 = d2.getFloat(10, f4);
                        }
                        lbcVar.n = f4;
                        lbcVar.d = dye.a(d2, xmlPullParser, theme, "strokeColor", 3);
                        float f5 = lbcVar.g;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                            f5 = d2.getFloat(11, f5);
                        }
                        lbcVar.g = f5;
                        float f6 = lbcVar.e;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                            f6 = d2.getFloat(4, f6);
                        }
                        lbcVar.e = f6;
                        float f7 = lbcVar.j;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                            f7 = d2.getFloat(6, f7);
                        }
                        lbcVar.j = f7;
                        float f8 = lbcVar.k;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                            f8 = d2.getFloat(7, f8);
                        }
                        lbcVar.k = f8;
                        float f9 = lbcVar.i;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                            f9 = d2.getFloat(5, f9);
                        }
                        lbcVar.i = f9;
                        int i8 = lbcVar.c;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                            i8 = d2.getInt(13, i8);
                        }
                        lbcVar.c = i8;
                    }
                    d2.recycle();
                    mbcVar2.b.add(lbcVar);
                    if (lbcVar.getPathName() != null) {
                        qtVar.put(lbcVar.getPathName(), lbcVar);
                    }
                    qbcVar3.a = qbcVar3.a;
                    z2 = false;
                } else if ("clip-path".equals(name)) {
                    kbc kbcVar = new kbc();
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                        TypedArray d3 = dye.d(resources, theme, attributeSet, pe0.e);
                        String string4 = d3.getString(0);
                        if (string4 != null) {
                            kbcVar.b = string4;
                        }
                        String string5 = d3.getString(1);
                        if (string5 != null) {
                            kbcVar.a = pse.c(string5);
                        }
                        kbcVar.c = !dye.c(xmlPullParser, "fillType") ? 0 : d3.getInt(2, 0);
                        d3.recycle();
                    }
                    mbcVar2.b.add(kbcVar);
                    if (kbcVar.getPathName() != null) {
                        qtVar.put(kbcVar.getPathName(), kbcVar);
                    }
                    qbcVar3.a = qbcVar3.a;
                } else if ("group".equals(name)) {
                    mbc mbcVar3 = new mbc();
                    TypedArray d4 = dye.d(resources, theme, attributeSet, pe0.c);
                    float f10 = mbcVar3.c;
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "rotation") != null) {
                        f10 = d4.getFloat(5, f10);
                    }
                    mbcVar3.c = f10;
                    mbcVar3.d = d4.getFloat(1, mbcVar3.d);
                    mbcVar3.e = d4.getFloat(2, mbcVar3.e);
                    float f11 = mbcVar3.f;
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                        f11 = d4.getFloat(3, f11);
                    }
                    mbcVar3.f = f11;
                    float f12 = mbcVar3.g;
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                        f12 = d4.getFloat(4, f12);
                    }
                    mbcVar3.g = f12;
                    float f13 = mbcVar3.h;
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                        f13 = d4.getFloat(6, f13);
                    }
                    mbcVar3.h = f13;
                    float f14 = mbcVar3.i;
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                        f14 = d4.getFloat(7, f14);
                    }
                    mbcVar3.i = f14;
                    String string6 = d4.getString(0);
                    if (string6 != null) {
                        mbcVar3.k = string6;
                    }
                    mbcVar3.c();
                    d4.recycle();
                    mbcVar2.b.add(mbcVar3);
                    arrayDeque.push(mbcVar3);
                    if (mbcVar3.getGroupName() != null) {
                        qtVar.put(mbcVar3.getGroupName(), mbcVar3);
                    }
                    qbcVar3.a = qbcVar3.a;
                }
                i2 = 1;
            } else {
                i = depth;
                i2 = 1;
                if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            i4 = i2;
            depth = i;
        }
        if (z2) {
            throw new XmlPullParserException("no path defined");
        }
        this.d = d(qbcVar.c, qbcVar.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = (Drawable) this.b;
        return drawable != null ? drawable.isAutoMirrored() : this.c.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        qbc qbcVar = this.c;
        if (qbcVar == null) {
            return false;
        }
        pbc pbcVar = qbcVar.b;
        Boolean bool = pbcVar.n;
        if (bool == null) {
            bool = Boolean.valueOf(pbcVar.g.a());
            pbcVar.n = bool;
        }
        if (bool.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.c.c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f && super.mutate() == this) {
            qbc qbcVar = this.c;
            qbc qbcVar2 = new qbc();
            qbcVar2.c = null;
            qbcVar2.d = w;
            if (qbcVar != null) {
                qbcVar2.a = qbcVar.a;
                pbc pbcVar = new pbc(qbcVar.b);
                qbcVar2.b = pbcVar;
                if (qbcVar.b.e != null) {
                    pbcVar.e = new Paint(qbcVar.b.e);
                }
                if (qbcVar.b.d != null) {
                    qbcVar2.b.d = new Paint(qbcVar.b.d);
                }
                qbcVar2.c = qbcVar.c;
                qbcVar2.d = qbcVar.d;
                qbcVar2.e = qbcVar.e;
            }
            this.c = qbcVar2;
            this.f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        qbc qbcVar = this.c;
        ColorStateList colorStateList = qbcVar.c;
        if (colorStateList == null || (mode = qbcVar.d) == null) {
            z = false;
        } else {
            this.d = d(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        pbc pbcVar = qbcVar.b;
        Boolean bool = pbcVar.n;
        if (bool == null) {
            bool = Boolean.valueOf(pbcVar.g.a());
            pbcVar.n = bool;
        }
        if (bool.booleanValue()) {
            boolean b = qbcVar.b.g.b(iArr);
            qbcVar.k |= b;
            if (b) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // jq2, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.c.b.getRootAlpha() != i) {
            this.c.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.c.e = z;
        }
    }

    @Override // jq2, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.e = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        qbc qbcVar = this.c;
        if (qbcVar.c != colorStateList) {
            qbcVar.c = colorStateList;
            this.d = d(colorStateList, qbcVar.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        qbc qbcVar = this.c;
        if (qbcVar.d != mode) {
            qbcVar.d = mode;
            this.d = d(qbcVar.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = (Drawable) this.b;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public sbc(qbc qbcVar) {
        this.h = true;
        this.n = new float[9];
        this.r = new Matrix();
        this.s = new Rect();
        this.c = qbcVar;
        this.d = d(qbcVar.c, qbcVar.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }
}
