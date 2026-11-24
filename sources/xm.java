// default package

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.StateSet;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class xm extends Drawable implements Drawable.Callback {
    public static final /* synthetic */ int K = 0;
    public boolean E;
    public um F;
    public wld G;
    public boolean J;
    public um a;
    public Rect b;
    public Drawable c;
    public Drawable d;
    public boolean f;
    public boolean n;
    public o1 r;
    public long s;
    public long w;
    public in x;
    public um y;
    public int e = kk7.d4;
    public int h = -1;
    public int H = -1;
    public int I = -1;

    public xm(um umVar, Resources resources) {
        i(new um(umVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0249, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r26.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0269, code lost:
    
        r5.onStateChange(r5.getState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0270, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static xm c(Context context, Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int next;
        int next2;
        Context context2 = context;
        Resources resources2 = resources;
        String name = xmlResourceParser.getName();
        if (!name.equals("animated-selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid animated-selector tag " + name);
        }
        xm xmVar = new xm(null, null);
        TypedArray d = bwe.d(resources2, theme, attributeSet, fy8.a);
        int i = 1;
        xmVar.setVisible(d.getBoolean(1, true), true);
        um umVar = xmVar.F;
        umVar.d |= ap2.b(d);
        int i2 = 2;
        umVar.i = d.getBoolean(2, umVar.i);
        int i3 = 3;
        umVar.l = d.getBoolean(3, umVar.l);
        umVar.y = d.getInt(4, umVar.y);
        umVar.z = d.getInt(5, umVar.z);
        boolean z = false;
        xmVar.setDither(d.getBoolean(0, umVar.w));
        um umVar2 = xmVar.a;
        if (resources2 != null) {
            umVar2.b = resources2;
            int i4 = resources2.getDisplayMetrics().densityDpi;
            if (i4 == 0) {
                i4 = kk7.p2;
            }
            int i5 = umVar2.c;
            umVar2.c = i4;
            if (i5 != i4) {
                umVar2.m = false;
                umVar2.j = false;
            }
        } else {
            umVar2.getClass();
        }
        d.recycle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next3 = xmlResourceParser.next();
            if (next3 == i || ((depth = xmlResourceParser.getDepth()) < depth2 && next3 == i3)) {
                break;
            }
            if (next3 == i2 && depth <= depth2) {
                if (xmlResourceParser.getName().equals("item")) {
                    TypedArray d2 = bwe.d(resources2, theme, attributeSet, fy8.b);
                    int resourceId = d2.getResourceId(z ? 1 : 0, z ? 1 : 0);
                    int resourceId2 = d2.getResourceId(i, -1);
                    Drawable g = resourceId2 > 0 ? ha9.d().g(context2, resourceId2) : null;
                    d2.recycle();
                    int attributeCount = attributeSet.getAttributeCount();
                    int[] iArr = new int[attributeCount];
                    int i6 = z ? 1 : 0;
                    for (int i7 = i6; i7 < attributeCount; i7++) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i7);
                        if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                            int i8 = i6 + 1;
                            if (!attributeSet.getAttributeBooleanValue(i7, z)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr[i6] = attributeNameResource;
                            i6 = i8;
                        }
                    }
                    int[] trimStateSet = StateSet.trimStateSet(iArr, i6);
                    if (g == null) {
                        do {
                            next2 = xmlResourceParser.next();
                        } while (next2 == 4);
                        if (next2 != 2) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        if (xmlResourceParser.getName().equals("vector")) {
                            g = new r9c();
                            g.inflate(resources2, xmlResourceParser, attributeSet, theme);
                        } else {
                            g = ap2.a(resources, xmlResourceParser, attributeSet, theme);
                        }
                    }
                    if (g == null) {
                        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                    }
                    um umVar3 = xmVar.F;
                    int a = umVar3.a(g);
                    umVar3.H[a] = trimStateSet;
                    umVar3.J.c(a, Integer.valueOf(resourceId));
                } else if (xmlResourceParser.getName().equals("transition")) {
                    TypedArray d3 = bwe.d(resources2, theme, attributeSet, fy8.c);
                    int resourceId3 = d3.getResourceId(2, -1);
                    int resourceId4 = d3.getResourceId(1, -1);
                    int resourceId5 = d3.getResourceId(z ? 1 : 0, -1);
                    Drawable g2 = resourceId5 > 0 ? ha9.d().g(context2, resourceId5) : null;
                    boolean z2 = d3.getBoolean(3, z);
                    d3.recycle();
                    if (g2 == null) {
                        do {
                            next = xmlResourceParser.next();
                        } while (next == 4);
                        if (next != 2) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        if (xmlResourceParser.getName().equals("animated-vector")) {
                            g2 = new ln(context2);
                            g2.inflate(resources2, xmlResourceParser, attributeSet, theme);
                        } else {
                            g2 = ap2.a(resources, xmlResourceParser, attributeSet, theme);
                        }
                    }
                    if (g2 == null) {
                        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                    }
                    if (resourceId3 == -1 || resourceId4 == -1) {
                        break;
                    }
                    um umVar4 = xmVar.F;
                    int a2 = umVar4.a(g2);
                    long j = resourceId3;
                    long j2 = resourceId4;
                    long j3 = (j << 32) | j2;
                    long j4 = z2 ? 8589934592L : 0L;
                    long j5 = a2;
                    umVar4.I.a(j3, Long.valueOf(j5 | j4));
                    if (z2) {
                        umVar4.I.a((j2 << 32) | j, Long.valueOf(j5 | 4294967296L | j4));
                    }
                    context2 = context;
                    resources2 = resources;
                    i = 1;
                    z = false;
                    i2 = 2;
                    i3 = 3;
                } else {
                    context2 = context;
                    resources2 = resources;
                }
                i = 1;
                i2 = 2;
                i3 = 3;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z) {
        boolean z2;
        Drawable drawable;
        boolean z3 = true;
        this.f = true;
        long uptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            long j = this.s;
            if (j != 0) {
                if (j > uptimeMillis) {
                    drawable2.setAlpha(((255 - (((int) ((j - uptimeMillis) * 255)) / this.a.y)) * this.e) / kk7.d4);
                    z2 = true;
                    drawable = this.d;
                    if (drawable == null) {
                        long j2 = this.w;
                        if (j2 != 0) {
                            if (j2 > uptimeMillis) {
                                drawable.setAlpha(((((int) ((j2 - uptimeMillis) * 255)) / this.a.z) * this.e) / kk7.d4);
                                if (z && z3) {
                                    scheduleSelf(this.r, uptimeMillis + 16);
                                    return;
                                }
                                return;
                            }
                            drawable.setVisible(false, false);
                            this.d = null;
                            this.w = 0L;
                        }
                    } else {
                        this.w = 0L;
                    }
                    z3 = z2;
                    if (z) {
                        return;
                    } else {
                        return;
                    }
                }
                drawable2.setAlpha(this.e);
                this.s = 0L;
            }
        } else {
            this.s = 0L;
        }
        z2 = false;
        drawable = this.d;
        if (drawable == null) {
        }
        z3 = z2;
        if (z) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        b(theme);
        onStateChange(getState());
    }

    public final void b(Resources.Theme theme) {
        um umVar = this.a;
        if (theme == null) {
            umVar.getClass();
            return;
        }
        umVar.c();
        int i = umVar.h;
        Drawable[] drawableArr = umVar.g;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable != null && drawable.canApplyTheme()) {
                drawableArr[i2].applyTheme(theme);
                umVar.e |= drawableArr[i2].getChangingConfigurations();
            }
        }
        Resources resources = theme.getResources();
        if (resources != null) {
            umVar.b = resources;
            int i3 = resources.getDisplayMetrics().densityDpi;
            if (i3 == 0) {
                i3 = kk7.p2;
            }
            int i4 = umVar.c;
            umVar.c = i3;
            if (i4 != i3) {
                umVar.m = false;
                umVar.j = false;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    public final void d(Drawable drawable) {
        in inVar = this.x;
        if (inVar == null) {
            inVar = new in();
            this.x = inVar;
        }
        inVar.b = drawable.getCallback();
        drawable.setCallback(inVar);
        try {
            if (this.a.y <= 0 && this.f) {
                drawable.setAlpha(this.e);
            }
            um umVar = this.a;
            if (umVar.C) {
                drawable.setColorFilter(umVar.B);
            } else {
                if (umVar.F) {
                    drawable.setTintList(umVar.D);
                }
                um umVar2 = this.a;
                if (umVar2.G) {
                    drawable.setTintMode(umVar2.E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.a.w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setAutoMirrored(this.a.A);
            Rect rect = this.b;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            in inVar2 = this.x;
            Drawable.Callback callback = (Drawable.Callback) inVar2.b;
            inVar2.b = null;
            drawable.setCallback(callback);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public final void e() {
        boolean z;
        Drawable drawable = this.d;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.d = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f) {
                this.c.setAlpha(this.e);
            }
        }
        if (this.w != 0) {
            this.w = 0L;
            z = true;
        }
        if (this.s != 0) {
            this.s = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    public final Drawable f() {
        if (!this.n && super.mutate() == this) {
            um umVar = new um(this.F, this, null);
            umVar.I = umVar.I.clone();
            umVar.J = umVar.J.clone();
            i(umVar);
            this.n = true;
        }
        return this;
    }

    public final Drawable g() {
        if (!this.E) {
            f();
            um umVar = this.y;
            umVar.I = umVar.I.clone();
            umVar.J = umVar.J.clone();
            this.E = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z;
        um umVar = this.a;
        if (!umVar.u) {
            umVar.c();
            umVar.u = true;
            int i = umVar.h;
            Drawable[] drawableArr = umVar.g;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    umVar.v = true;
                    z = true;
                    break;
                }
                if (drawableArr[i2].getConstantState() == null) {
                    umVar.v = false;
                    z = false;
                    break;
                }
                i2++;
            }
        } else {
            z = umVar.v;
        }
        if (!z) {
            return null;
        }
        this.a.d = getChangingConfigurations();
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        um umVar = this.a;
        if (umVar.l) {
            if (!umVar.m) {
                umVar.b();
            }
            return umVar.o;
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        um umVar = this.a;
        if (umVar.l) {
            if (!umVar.m) {
                umVar.b();
            }
            return umVar.n;
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        um umVar = this.a;
        if (umVar.l) {
            if (!umVar.m) {
                umVar.b();
            }
            return umVar.q;
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        um umVar = this.a;
        if (umVar.l) {
            if (!umVar.m) {
                umVar.b();
            }
            return umVar.p;
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.c;
        if (drawable != null && drawable.isVisible()) {
            um umVar = this.a;
            if (umVar.r) {
                return umVar.s;
            }
            umVar.c();
            int i = umVar.h;
            Drawable[] drawableArr = umVar.g;
            r1 = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                r1 = Drawable.resolveOpacity(r1, drawableArr[i2].getOpacity());
            }
            umVar.s = r1;
            umVar.r = true;
        }
        return r1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        um umVar = this.a;
        Rect rect2 = null;
        boolean z = false;
        if (!umVar.i) {
            Rect rect3 = umVar.k;
            if (rect3 != null || umVar.j) {
                rect2 = rect3;
            } else {
                umVar.c();
                Rect rect4 = new Rect();
                int i = umVar.h;
                Drawable[] drawableArr = umVar.g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i3 = rect4.left;
                        if (i3 > rect2.left) {
                            rect2.left = i3;
                        }
                        int i4 = rect4.top;
                        if (i4 > rect2.top) {
                            rect2.top = i4;
                        }
                        int i5 = rect4.right;
                        if (i5 > rect2.right) {
                            rect2.right = i5;
                        }
                        int i6 = rect4.bottom;
                        if (i6 > rect2.bottom) {
                            rect2.bottom = i6;
                        }
                    }
                }
                umVar.j = true;
                umVar.k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                z = true;
            }
        } else {
            Drawable drawable = this.c;
            z = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.a.A && getLayoutDirection() == 1) {
            int i7 = rect.left;
            rect.left = rect.right;
            rect.right = i7;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(int i) {
        o1 o1Var;
        if (i == this.h) {
            return false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.a.z > 0) {
            Drawable drawable = this.d;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.c;
            if (drawable2 != null) {
                this.d = drawable2;
                this.w = this.a.z + uptimeMillis;
            } else {
                this.d = null;
                this.w = 0L;
            }
        } else {
            Drawable drawable3 = this.c;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i >= 0) {
            um umVar = this.a;
            if (i < umVar.h) {
                Drawable d = umVar.d(i);
                this.c = d;
                this.h = i;
                if (d != null) {
                    int i2 = this.a.y;
                    if (i2 > 0) {
                        this.s = uptimeMillis + i2;
                    }
                    d(d);
                }
                if (this.s == 0 || this.w != 0) {
                    o1Var = this.r;
                    if (o1Var != null) {
                        this.r = new o1(this, (byte) 26);
                    } else {
                        unscheduleSelf(o1Var);
                    }
                    a(true);
                }
                invalidateSelf();
                return true;
            }
        }
        this.c = null;
        this.h = -1;
        if (this.s == 0) {
        }
        o1Var = this.r;
        if (o1Var != null) {
        }
        a(true);
        invalidateSelf();
        return true;
    }

    public final void i(um umVar) {
        this.a = umVar;
        int i = this.h;
        if (i >= 0) {
            Drawable d = umVar.d(i);
            this.c = d;
            if (d != null) {
                d(d);
            }
        }
        this.d = null;
        this.y = umVar;
        this.F = umVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        um umVar = this.a;
        if (umVar != null) {
            umVar.r = false;
            umVar.t = false;
        }
        if (drawable != this.c || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.a.A;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    public final boolean j(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        e();
        wld wldVar = this.G;
        if (wldVar != null) {
            wldVar.d();
            this.G = null;
            h(this.H);
            this.H = -1;
            this.I = -1;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.J) {
            g();
            um umVar = this.F;
            umVar.I = umVar.I.clone();
            umVar.J = umVar.J.clone();
            this.J = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        um umVar = this.a;
        int i2 = this.h;
        int i3 = umVar.h;
        Drawable[] drawableArr = umVar.g;
        boolean z = false;
        for (int i4 = 0; i4 < i3; i4++) {
            Drawable drawable = drawableArr[i4];
            if (drawable != null) {
                boolean layoutDirection = drawable.setLayoutDirection(i);
                if (i4 == i2) {
                    z = layoutDirection;
                }
            }
        }
        umVar.x = i;
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d2, code lost:
    
        if (h(r1) != false) goto L42;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onStateChange(int[] iArr) {
        int i;
        wld tmVar;
        um umVar = this.F;
        int f = umVar.f(iArr);
        if (f < 0) {
            f = umVar.f(StateSet.WILD_CARD);
        }
        if (f != this.h) {
            wld wldVar = this.G;
            if (wldVar != null) {
                if (f != this.H) {
                    if (f == this.I && wldVar.a()) {
                        wldVar.b();
                        this.H = this.I;
                        this.I = f;
                    } else {
                        i = this.H;
                        wldVar.d();
                    }
                }
                r2 = true;
            } else {
                i = this.h;
            }
            this.G = null;
            this.I = -1;
            this.H = -1;
            um umVar2 = this.F;
            int e = umVar2.e(i);
            int e2 = umVar2.e(f);
            if (e2 != 0 && e != 0) {
                long j = (e << 32) | e2;
                int longValue = (int) ((Long) umVar2.I.g(-1L, j)).longValue();
                if (longValue >= 0) {
                    boolean z = (((Long) umVar2.I.g(-1L, j)).longValue() & 8589934592L) != 0;
                    h(longValue);
                    Object obj = this.c;
                    if (obj instanceof AnimationDrawable) {
                        tmVar = new vm((AnimationDrawable) obj, (((Long) umVar2.I.g(-1L, j)).longValue() & 4294967296L) != 0, z);
                    } else if (obj instanceof ln) {
                        tmVar = new tm((ln) obj, (byte) 1);
                    } else if (obj instanceof Animatable) {
                        tmVar = new tm((Animatable) obj, (byte) 0);
                    }
                    tmVar.c();
                    this.G = tmVar;
                    this.I = i;
                    this.H = f;
                    r2 = true;
                }
            }
        }
        Drawable drawable = this.c;
        return drawable != null ? r2 | drawable.setState(iArr) : r2;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable != this.c || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f && this.e == i) {
            return;
        }
        this.f = true;
        this.e = i;
        Drawable drawable = this.c;
        if (drawable != null) {
            if (this.s == 0) {
                drawable.setAlpha(i);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        um umVar = this.a;
        if (umVar.A != z) {
            umVar.A = z;
            Drawable drawable = this.c;
            if (drawable != null) {
                drawable.setAutoMirrored(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        um umVar = this.a;
        umVar.C = true;
        if (umVar.B != colorFilter) {
            umVar.B = colorFilter;
            Drawable drawable = this.c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        um umVar = this.a;
        if (umVar.w != z) {
            umVar.w = z;
            Drawable drawable = this.c;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.b;
        if (rect == null) {
            this.b = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        um umVar = this.a;
        umVar.F = true;
        if (umVar.D != colorStateList) {
            umVar.D = colorStateList;
            this.c.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        um umVar = this.a;
        umVar.G = true;
        if (umVar.E != mode) {
            umVar.E = mode;
            this.c.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean j = j(z, z2);
        wld wldVar = this.G;
        if (wldVar != null && (j || z2)) {
            if (z) {
                wldVar.c();
                return j;
            }
            jumpToCurrentState();
        }
        return j;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.c || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
