package z4;

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
import b8.dd;
import b8.rc;
import java.io.IOException;
import java.util.ArrayDeque;
import org.telegram.ui.Components.yp;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class o extends yp {
    public static final PorterDuff.Mode w = PorterDuff.Mode.SRC_IN;
    public m c;
    public PorterDuffColorFilter d;
    public ColorFilter e;
    public boolean f;
    public boolean h;
    public final float[] n;
    public final Matrix r;
    public final Rect s;

    public o() {
        this.h = true;
        this.n = new float[9];
        this.r = new Matrix();
        this.s = new Rect();
        m mVar = new m();
        mVar.c = null;
        mVar.d = w;
        mVar.b = new l();
        this.c = mVar;
    }

    public static o c(Resources resources, int i3, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            o oVar = new o();
            ThreadLocal threadLocal = h0.j.a;
            oVar.b = resources.getDrawable(i3, theme);
            new n(((Drawable) oVar.b).getConstantState());
            return oVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i3);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            o oVar2 = new o();
            oVar2.inflate(resources, xml, asAttributeSet, theme);
            return oVar2;
        } catch (IOException e10) {
            Log.e("VectorDrawableCompat", "parser error", e10);
            return null;
        } catch (XmlPullParserException e11) {
            Log.e("VectorDrawableCompat", "parser error", e11);
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
        m mVar = this.c;
        Bitmap bitmap = mVar.f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != mVar.f.getHeight()) {
            mVar.f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            mVar.k = true;
        }
        if (this.h) {
            m mVar2 = this.c;
            if (mVar2.k || mVar2.g != mVar2.c || mVar2.h != mVar2.d || mVar2.j != mVar2.e || mVar2.i != mVar2.b.getRootAlpha()) {
                m mVar3 = this.c;
                mVar3.f.eraseColor(0);
                Canvas canvas2 = new Canvas(mVar3.f);
                l lVar = mVar3.b;
                lVar.a(lVar.g, l.p, canvas2, min, min2);
                m mVar4 = this.c;
                mVar4.g = mVar4.c;
                mVar4.h = mVar4.d;
                mVar4.i = mVar4.b.getRootAlpha();
                mVar4.j = mVar4.e;
                mVar4.k = false;
            }
        } else {
            m mVar5 = this.c;
            mVar5.f.eraseColor(0);
            Canvas canvas3 = new Canvas(mVar5.f);
            l lVar2 = mVar5.b;
            lVar2.a(lVar2.g, l.p, canvas3, min, min2);
        }
        m mVar6 = this.c;
        if (mVar6.b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (mVar6.l == null) {
                Paint paint2 = new Paint();
                mVar6.l = paint2;
                paint2.setFilterBitmap(true);
            }
            mVar6.l.setAlpha(mVar6.b.getRootAlpha());
            mVar6.l.setColorFilter(colorFilter);
            paint = mVar6.l;
        }
        canvas.drawBitmap(mVar6.f, (Rect) null, rect, paint);
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
            return new n(((Drawable) this.b).getConstantState());
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

    @Override // org.telegram.ui.Components.yp, android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
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
        m mVar = this.c;
        if (mVar == null) {
            return false;
        }
        l lVar = mVar.b;
        if (lVar.n == null) {
            lVar.n = Boolean.valueOf(lVar.g.a());
        }
        if (lVar.n.booleanValue()) {
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
            m mVar = this.c;
            m mVar2 = new m();
            mVar2.c = null;
            mVar2.d = w;
            if (mVar != null) {
                mVar2.a = mVar.a;
                l lVar = new l(mVar.b);
                mVar2.b = lVar;
                if (mVar.b.e != null) {
                    lVar.e = new Paint(mVar.b.e);
                }
                if (mVar.b.d != null) {
                    mVar2.b.d = new Paint(mVar.b.d);
                }
                mVar2.c = mVar.c;
                mVar2.d = mVar.d;
                mVar2.e = mVar.e;
            }
            this.c = mVar2;
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
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        m mVar = this.c;
        ColorStateList colorStateList = mVar.c;
        if (colorStateList == null || (mode = mVar.d) == null) {
            z10 = false;
        } else {
            this.d = d(colorStateList, mode);
            invalidateSelf();
            z10 = true;
        }
        l lVar = mVar.b;
        if (lVar.n == null) {
            lVar.n = Boolean.valueOf(lVar.g.a());
        }
        if (lVar.n.booleanValue()) {
            boolean b10 = mVar.b.g.b(iArr);
            mVar.k |= b10;
            if (b10) {
                invalidateSelf();
                return true;
            }
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override // org.telegram.ui.Components.yp, android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.setAlpha(i3);
        } else if (this.c.b.getRootAlpha() != i3) {
            this.c.b.setRootAlpha(i3);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.setAutoMirrored(z10);
        } else {
            this.c.e = z10;
        }
    }

    @Override // org.telegram.ui.Components.yp, android.graphics.drawable.Drawable
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
    public final void setTint(int i3) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            dd.a(i3, drawable);
        } else {
            setTintList(ColorStateList.valueOf(i3));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        m mVar = this.c;
        if (mVar.c != colorStateList) {
            mVar.c = colorStateList;
            this.d = d(colorStateList, mVar.d);
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
        m mVar = this.c;
        if (mVar.d != mode) {
            mVar.d = mode;
            this.d = d(mVar.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = (Drawable) this.b;
        return drawable != null ? drawable.setVisible(z10, z11) : super.setVisible(z10, z11);
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

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i3;
        char c2;
        int i10;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        m mVar = this.c;
        mVar.b = new l();
        TypedArray f10 = h0.b.f(resources, theme, attributeSet, a.a);
        m mVar2 = this.c;
        l lVar = mVar2.b;
        int i11 = !h0.b.c(xmlPullParser, "tintMode") ? -1 : f10.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i11 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i11 != 5) {
            if (i11 != 9) {
                switch (i11) {
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
        mVar2.d = mode;
        ColorStateList colorStateList = null;
        int i12 = 1;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            f10.getValue(1, typedValue);
            int i13 = typedValue.type;
            if (i13 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i13 >= 28 && i13 <= 31) {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = f10.getResources();
                int resourceId = f10.getResourceId(1, 0);
                ThreadLocal threadLocal = h0.c.a;
                try {
                    colorStateList = h0.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e10) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e10);
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            mVar2.c = colorStateList2;
        }
        boolean z10 = mVar2.e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z10 = f10.getBoolean(5, z10);
        }
        mVar2.e = z10;
        float f11 = lVar.j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f11 = f10.getFloat(7, f11);
        }
        lVar.j = f11;
        float f12 = lVar.k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f12 = f10.getFloat(8, f12);
        }
        lVar.k = f12;
        if (lVar.j <= 0.0f) {
            throw new XmlPullParserException(f10.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f12 > 0.0f) {
            lVar.h = f10.getDimension(3, lVar.h);
            float dimension = f10.getDimension(2, lVar.i);
            lVar.i = dimension;
            if (lVar.h <= 0.0f) {
                throw new XmlPullParserException(f10.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = lVar.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = f10.getFloat(4, alpha);
                }
                lVar.setAlpha(alpha);
                String string = f10.getString(0);
                if (string != null) {
                    lVar.m = string;
                    lVar.o.put(string, lVar);
                }
                f10.recycle();
                mVar.a = getChangingConfigurations();
                mVar.k = true;
                m mVar3 = this.c;
                l lVar2 = mVar3.b;
                ArrayDeque arrayDeque = new ArrayDeque();
                i iVar = lVar2.g;
                a0.f fVar = lVar2.o;
                arrayDeque.push(iVar);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z11 = true;
                while (eventType != i12 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        i iVar2 = (i) arrayDeque.peek();
                        i3 = depth;
                        if ("path".equals(name)) {
                            h hVar = new h();
                            hVar.e = 0.0f;
                            hVar.g = 1.0f;
                            hVar.h = 1.0f;
                            hVar.i = 0.0f;
                            hVar.j = 1.0f;
                            hVar.k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            hVar.l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            hVar.m = join2;
                            hVar.n = 4.0f;
                            TypedArray f13 = h0.b.f(resources, theme, attributeSet, a.c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = f13.getString(0);
                                if (string2 != null) {
                                    hVar.b = string2;
                                }
                                String string3 = f13.getString(2);
                                if (string3 != null) {
                                    hVar.a = rc.c(string3);
                                }
                                hVar.f = h0.b.a(f13, xmlPullParser, theme, "fillColor", 1);
                                float f14 = hVar.h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f14 = f13.getFloat(12, f14);
                                }
                                hVar.h = f14;
                                int i14 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? f13.getInt(8, -1) : -1;
                                Paint.Cap cap3 = hVar.l;
                                if (i14 == 0) {
                                    cap = cap2;
                                } else if (i14 != 1) {
                                    cap = i14 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                hVar.l = cap;
                                int i15 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? f13.getInt(9, -1) : -1;
                                Paint.Join join3 = hVar.m;
                                if (i15 == 0) {
                                    join = join2;
                                } else if (i15 != 1) {
                                    join = i15 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                hVar.m = join;
                                float f15 = hVar.n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f15 = f13.getFloat(10, f15);
                                }
                                hVar.n = f15;
                                hVar.d = h0.b.a(f13, xmlPullParser, theme, "strokeColor", 3);
                                float f16 = hVar.g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f16 = f13.getFloat(11, f16);
                                }
                                hVar.g = f16;
                                float f17 = hVar.e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f17 = f13.getFloat(4, f17);
                                }
                                hVar.e = f17;
                                float f18 = hVar.j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f18 = f13.getFloat(6, f18);
                                }
                                hVar.j = f18;
                                float f19 = hVar.k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f19 = f13.getFloat(7, f19);
                                }
                                hVar.k = f19;
                                float f20 = hVar.i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f20 = f13.getFloat(5, f20);
                                }
                                hVar.i = f20;
                                int i16 = hVar.c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i16 = f13.getInt(13, i16);
                                }
                                hVar.c = i16;
                            }
                            f13.recycle();
                            iVar2.b.add(hVar);
                            if (hVar.getPathName() != null) {
                                fVar.put(hVar.getPathName(), hVar);
                            }
                            mVar3.a = mVar3.a;
                            z11 = false;
                            c2 = '\b';
                        } else {
                            c2 = '\b';
                            if ("clip-path".equals(name)) {
                                g gVar = new g();
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    TypedArray f21 = h0.b.f(resources, theme, attributeSet, a.d);
                                    String string4 = f21.getString(0);
                                    if (string4 != null) {
                                        gVar.b = string4;
                                    }
                                    String string5 = f21.getString(1);
                                    if (string5 != null) {
                                        gVar.a = rc.c(string5);
                                    }
                                    gVar.c = !h0.b.c(xmlPullParser, "fillType") ? 0 : f21.getInt(2, 0);
                                    f21.recycle();
                                }
                                iVar2.b.add(gVar);
                                if (gVar.getPathName() != null) {
                                    fVar.put(gVar.getPathName(), gVar);
                                }
                                mVar3.a = mVar3.a;
                            } else if ("group".equals(name)) {
                                i iVar3 = new i();
                                TypedArray f22 = h0.b.f(resources, theme, attributeSet, a.b);
                                float f23 = iVar3.c;
                                if (h0.b.c(xmlPullParser, "rotation")) {
                                    f23 = f22.getFloat(5, f23);
                                }
                                iVar3.c = f23;
                                iVar3.d = f22.getFloat(1, iVar3.d);
                                iVar3.e = f22.getFloat(2, iVar3.e);
                                float f24 = iVar3.f;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f24 = f22.getFloat(3, f24);
                                }
                                iVar3.f = f24;
                                float f25 = iVar3.g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f25 = f22.getFloat(4, f25);
                                }
                                iVar3.g = f25;
                                float f26 = iVar3.h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f26 = f22.getFloat(6, f26);
                                }
                                iVar3.h = f26;
                                float f27 = iVar3.i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f27 = f22.getFloat(7, f27);
                                }
                                iVar3.i = f27;
                                String string6 = f22.getString(0);
                                if (string6 != null) {
                                    iVar3.k = string6;
                                }
                                iVar3.c();
                                f22.recycle();
                                iVar2.b.add(iVar3);
                                arrayDeque.push(iVar3);
                                if (iVar3.getGroupName() != null) {
                                    fVar.put(iVar3.getGroupName(), iVar3);
                                }
                                mVar3.a = mVar3.a;
                            }
                        }
                        i10 = 1;
                    } else {
                        i3 = depth;
                        c2 = '\b';
                        i10 = 1;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i12 = i10;
                    depth = i3;
                }
                if (!z11) {
                    this.d = d(mVar.c, mVar.d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(f10.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(f10.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public o(m mVar) {
        this.h = true;
        this.n = new float[9];
        this.r = new Matrix();
        this.s = new Rect();
        this.c = mVar;
        this.d = d(mVar.c, mVar.d);
    }
}
