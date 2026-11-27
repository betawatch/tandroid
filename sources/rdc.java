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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class rdc extends rp2 {
    public static final PorterDuff.Mode w = PorterDuff.Mode.SRC_IN;
    public pdc c;
    public PorterDuffColorFilter d;
    public ColorFilter e;
    public boolean f;
    public boolean h;
    public final float[] n;
    public final Matrix r;
    public final Rect s;

    public rdc() {
        this.h = true;
        this.n = new float[9];
        this.r = new Matrix();
        this.s = new Rect();
        pdc pdcVar = new pdc();
        pdcVar.c = null;
        pdcVar.d = w;
        pdcVar.b = new odc();
        this.c = pdcVar;
    }

    public static rdc c(Resources resources, int i, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            rdc rdcVar = new rdc();
            ThreadLocal threadLocal = yd9.a;
            rdcVar.b = resources.getDrawable(i, theme);
            new qdc(((Drawable) rdcVar.b).getConstantState());
            return rdcVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    rdc rdcVar2 = new rdc();
                    rdcVar2.inflate(resources, xml, asAttributeSet, theme);
                    return rdcVar2;
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
        pdc pdcVar = this.c;
        Bitmap bitmap = pdcVar.f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != pdcVar.f.getHeight()) {
            pdcVar.f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            pdcVar.k = true;
        }
        boolean z = this.h;
        pdc pdcVar2 = this.c;
        if (!z) {
            pdcVar2.f.eraseColor(0);
            Canvas canvas2 = new Canvas(pdcVar2.f);
            odc odcVar = pdcVar2.b;
            odcVar.a(odcVar.g, odc.p, canvas2, min, min2);
        } else if (pdcVar2.k || pdcVar2.g != pdcVar2.c || pdcVar2.h != pdcVar2.d || pdcVar2.j != pdcVar2.e || pdcVar2.i != pdcVar2.b.getRootAlpha()) {
            pdc pdcVar3 = this.c;
            pdcVar3.f.eraseColor(0);
            Canvas canvas3 = new Canvas(pdcVar3.f);
            odc odcVar2 = pdcVar3.b;
            odcVar2.a(odcVar2.g, odc.p, canvas3, min, min2);
            pdc pdcVar4 = this.c;
            pdcVar4.g = pdcVar4.c;
            pdcVar4.h = pdcVar4.d;
            pdcVar4.i = pdcVar4.b.getRootAlpha();
            pdcVar4.j = pdcVar4.e;
            pdcVar4.k = false;
        }
        pdc pdcVar5 = this.c;
        if (pdcVar5.b.getRootAlpha() < 255 || colorFilter != null) {
            if (pdcVar5.l == null) {
                Paint paint2 = new Paint();
                pdcVar5.l = paint2;
                paint2.setFilterBitmap(true);
            }
            pdcVar5.l.setAlpha(pdcVar5.b.getRootAlpha());
            pdcVar5.l.setColorFilter(colorFilter);
            paint = pdcVar5.l;
        } else {
            paint = null;
        }
        canvas.drawBitmap(pdcVar5.f, (Rect) null, rect, paint);
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
            return new qdc(((Drawable) this.b).getConstantState());
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

    @Override // rp2, android.graphics.drawable.Drawable
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
        pdc pdcVar = this.c;
        pdcVar.b = new odc();
        TypedArray d = m1f.d(resources, theme, attributeSet, rd0.b);
        pdc pdcVar2 = this.c;
        odc odcVar = pdcVar2.b;
        int i3 = !m1f.c(xmlPullParser, "tintMode") ? -1 : d.getInt(6, -1);
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
        pdcVar2.d = mode;
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
                ThreadLocal threadLocal = um2.a;
                try {
                    colorStateList = um2.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                }
            } else {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            pdcVar2.c = colorStateList2;
        }
        boolean z = pdcVar2.e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z = d.getBoolean(5, z);
        }
        pdcVar2.e = z;
        float f = odcVar.j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = d.getFloat(7, f);
        }
        odcVar.j = f;
        float f2 = odcVar.k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = d.getFloat(8, f2);
        }
        odcVar.k = f2;
        if (odcVar.j <= 0.0f) {
            throw new XmlPullParserException(d.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 <= 0.0f) {
            throw new XmlPullParserException(d.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        odcVar.h = d.getDimension(3, odcVar.h);
        float dimension = d.getDimension(2, odcVar.i);
        odcVar.i = dimension;
        if (odcVar.h <= 0.0f) {
            throw new XmlPullParserException(d.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(d.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alpha = odcVar.getAlpha();
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
            alpha = d.getFloat(4, alpha);
        }
        odcVar.setAlpha(alpha);
        String string = d.getString(0);
        if (string != null) {
            odcVar.m = string;
            odcVar.o.put(string, odcVar);
        }
        d.recycle();
        pdcVar.a = getChangingConfigurations();
        pdcVar.k = true;
        pdc pdcVar3 = this.c;
        odc odcVar2 = pdcVar3.b;
        ArrayDeque arrayDeque = new ArrayDeque();
        ldc ldcVar = odcVar2.g;
        qs qsVar = odcVar2.o;
        arrayDeque.push(ldcVar);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        while (eventType != i4 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                ldc ldcVar2 = (ldc) arrayDeque.peek();
                i = depth;
                if ("path".equals(name)) {
                    kdc kdcVar = new kdc();
                    kdcVar.e = 0.0f;
                    kdcVar.g = 1.0f;
                    kdcVar.h = 1.0f;
                    kdcVar.i = 0.0f;
                    kdcVar.j = 1.0f;
                    kdcVar.k = 0.0f;
                    Paint.Cap cap = Paint.Cap.BUTT;
                    kdcVar.l = cap;
                    Paint.Join join = Paint.Join.MITER;
                    kdcVar.m = join;
                    kdcVar.n = 4.0f;
                    TypedArray d2 = m1f.d(resources, theme, attributeSet, rd0.d);
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                        String string2 = d2.getString(0);
                        if (string2 != null) {
                            kdcVar.b = string2;
                        }
                        String string3 = d2.getString(2);
                        if (string3 != null) {
                            kdcVar.a = hve.c(string3);
                        }
                        kdcVar.f = m1f.a(d2, xmlPullParser, theme, "fillColor", 1);
                        float f3 = kdcVar.h;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                            f3 = d2.getFloat(12, f3);
                        }
                        kdcVar.h = f3;
                        int i6 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? d2.getInt(8, -1) : -1;
                        kdcVar.l = i6 != 0 ? i6 != 1 ? i6 != 2 ? kdcVar.l : Paint.Cap.SQUARE : Paint.Cap.ROUND : cap;
                        int i7 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? d2.getInt(9, -1) : -1;
                        kdcVar.m = i7 != 0 ? i7 != 1 ? i7 != 2 ? kdcVar.m : Paint.Join.BEVEL : Paint.Join.ROUND : join;
                        float f4 = kdcVar.n;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                            f4 = d2.getFloat(10, f4);
                        }
                        kdcVar.n = f4;
                        kdcVar.d = m1f.a(d2, xmlPullParser, theme, "strokeColor", 3);
                        float f5 = kdcVar.g;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                            f5 = d2.getFloat(11, f5);
                        }
                        kdcVar.g = f5;
                        float f6 = kdcVar.e;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                            f6 = d2.getFloat(4, f6);
                        }
                        kdcVar.e = f6;
                        float f7 = kdcVar.j;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                            f7 = d2.getFloat(6, f7);
                        }
                        kdcVar.j = f7;
                        float f8 = kdcVar.k;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                            f8 = d2.getFloat(7, f8);
                        }
                        kdcVar.k = f8;
                        float f9 = kdcVar.i;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                            f9 = d2.getFloat(5, f9);
                        }
                        kdcVar.i = f9;
                        int i8 = kdcVar.c;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                            i8 = d2.getInt(13, i8);
                        }
                        kdcVar.c = i8;
                    }
                    d2.recycle();
                    ldcVar2.b.add(kdcVar);
                    if (kdcVar.getPathName() != null) {
                        qsVar.put(kdcVar.getPathName(), kdcVar);
                    }
                    pdcVar3.a = pdcVar3.a;
                    z2 = false;
                } else if ("clip-path".equals(name)) {
                    jdc jdcVar = new jdc();
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                        TypedArray d3 = m1f.d(resources, theme, attributeSet, rd0.e);
                        String string4 = d3.getString(0);
                        if (string4 != null) {
                            jdcVar.b = string4;
                        }
                        String string5 = d3.getString(1);
                        if (string5 != null) {
                            jdcVar.a = hve.c(string5);
                        }
                        jdcVar.c = !m1f.c(xmlPullParser, "fillType") ? 0 : d3.getInt(2, 0);
                        d3.recycle();
                    }
                    ldcVar2.b.add(jdcVar);
                    if (jdcVar.getPathName() != null) {
                        qsVar.put(jdcVar.getPathName(), jdcVar);
                    }
                    pdcVar3.a = pdcVar3.a;
                } else if ("group".equals(name)) {
                    ldc ldcVar3 = new ldc();
                    TypedArray d4 = m1f.d(resources, theme, attributeSet, rd0.c);
                    float f10 = ldcVar3.c;
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "rotation") != null) {
                        f10 = d4.getFloat(5, f10);
                    }
                    ldcVar3.c = f10;
                    ldcVar3.d = d4.getFloat(1, ldcVar3.d);
                    ldcVar3.e = d4.getFloat(2, ldcVar3.e);
                    float f11 = ldcVar3.f;
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                        f11 = d4.getFloat(3, f11);
                    }
                    ldcVar3.f = f11;
                    float f12 = ldcVar3.g;
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                        f12 = d4.getFloat(4, f12);
                    }
                    ldcVar3.g = f12;
                    float f13 = ldcVar3.h;
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                        f13 = d4.getFloat(6, f13);
                    }
                    ldcVar3.h = f13;
                    float f14 = ldcVar3.i;
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                        f14 = d4.getFloat(7, f14);
                    }
                    ldcVar3.i = f14;
                    String string6 = d4.getString(0);
                    if (string6 != null) {
                        ldcVar3.k = string6;
                    }
                    ldcVar3.c();
                    d4.recycle();
                    ldcVar2.b.add(ldcVar3);
                    arrayDeque.push(ldcVar3);
                    if (ldcVar3.getGroupName() != null) {
                        qsVar.put(ldcVar3.getGroupName(), ldcVar3);
                    }
                    pdcVar3.a = pdcVar3.a;
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
        this.d = d(pdcVar.c, pdcVar.d);
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
        pdc pdcVar = this.c;
        if (pdcVar == null) {
            return false;
        }
        odc odcVar = pdcVar.b;
        Boolean bool = odcVar.n;
        if (bool == null) {
            bool = Boolean.valueOf(odcVar.g.a());
            odcVar.n = bool;
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
            pdc pdcVar = this.c;
            pdc pdcVar2 = new pdc();
            pdcVar2.c = null;
            pdcVar2.d = w;
            if (pdcVar != null) {
                pdcVar2.a = pdcVar.a;
                odc odcVar = new odc(pdcVar.b);
                pdcVar2.b = odcVar;
                if (pdcVar.b.e != null) {
                    odcVar.e = new Paint(pdcVar.b.e);
                }
                if (pdcVar.b.d != null) {
                    pdcVar2.b.d = new Paint(pdcVar.b.d);
                }
                pdcVar2.c = pdcVar.c;
                pdcVar2.d = pdcVar.d;
                pdcVar2.e = pdcVar.e;
            }
            this.c = pdcVar2;
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
        pdc pdcVar = this.c;
        ColorStateList colorStateList = pdcVar.c;
        if (colorStateList == null || (mode = pdcVar.d) == null) {
            z = false;
        } else {
            this.d = d(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        odc odcVar = pdcVar.b;
        Boolean bool = odcVar.n;
        if (bool == null) {
            bool = Boolean.valueOf(odcVar.g.a());
            odcVar.n = bool;
        }
        if (bool.booleanValue()) {
            boolean b = pdcVar.b.g.b(iArr);
            pdcVar.k |= b;
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

    @Override // rp2, android.graphics.drawable.Drawable
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

    @Override // rp2, android.graphics.drawable.Drawable
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
        pdc pdcVar = this.c;
        if (pdcVar.c != colorStateList) {
            pdcVar.c = colorStateList;
            this.d = d(colorStateList, pdcVar.d);
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
        pdc pdcVar = this.c;
        if (pdcVar.d != mode) {
            pdcVar.d = mode;
            this.d = d(pdcVar.c, mode);
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

    public rdc(pdc pdcVar) {
        this.h = true;
        this.n = new float[9];
        this.r = new Matrix();
        this.s = new Rect();
        this.c = pdcVar;
        this.d = d(pdcVar.c, pdcVar.d);
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
