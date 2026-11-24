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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class xn extends Drawable implements Drawable.Callback {
    public static final /* synthetic */ int K = 0;
    public boolean E;
    public un F;
    public ynd G;
    public boolean J;
    public un a;
    public Rect b;
    public Drawable c;
    public Drawable d;
    public boolean f;
    public boolean n;
    public o1 r;
    public long s;
    public long w;
    public jo x;
    public un y;
    public int e = nm7.d4;
    public int h = -1;
    public int H = -1;
    public int I = -1;

    public xn(un unVar, Resources resources) {
        i(new un(unVar, this, resources));
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
    public static xn c(Context context, Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int next;
        int next2;
        Context context2 = context;
        Resources resources2 = resources;
        String name = xmlResourceParser.getName();
        if (!name.equals("animated-selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid animated-selector tag " + name);
        }
        xn xnVar = new xn(null, null);
        TypedArray d = dye.d(resources2, theme, attributeSet, g09.a);
        int i = 1;
        xnVar.setVisible(d.getBoolean(1, true), true);
        un unVar = xnVar.F;
        unVar.d |= lq2.b(d);
        int i2 = 2;
        unVar.i = d.getBoolean(2, unVar.i);
        int i3 = 3;
        unVar.l = d.getBoolean(3, unVar.l);
        unVar.y = d.getInt(4, unVar.y);
        unVar.z = d.getInt(5, unVar.z);
        boolean z = false;
        xnVar.setDither(d.getBoolean(0, unVar.w));
        un unVar2 = xnVar.a;
        if (resources2 != null) {
            unVar2.b = resources2;
            int i4 = resources2.getDisplayMetrics().densityDpi;
            if (i4 == 0) {
                i4 = nm7.p2;
            }
            int i5 = unVar2.c;
            unVar2.c = i4;
            if (i5 != i4) {
                unVar2.m = false;
                unVar2.j = false;
            }
        } else {
            unVar2.getClass();
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
                    TypedArray d2 = dye.d(resources2, theme, attributeSet, g09.b);
                    int resourceId = d2.getResourceId(z ? 1 : 0, z ? 1 : 0);
                    int resourceId2 = d2.getResourceId(i, -1);
                    Drawable g = resourceId2 > 0 ? hc9.d().g(context2, resourceId2) : null;
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
                            g = new sbc();
                            g.inflate(resources2, xmlResourceParser, attributeSet, theme);
                        } else {
                            g = lq2.a(resources, xmlResourceParser, attributeSet, theme);
                        }
                    }
                    if (g == null) {
                        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                    }
                    un unVar3 = xnVar.F;
                    int a = unVar3.a(g);
                    unVar3.H[a] = trimStateSet;
                    unVar3.J.c(a, Integer.valueOf(resourceId));
                } else if (xmlResourceParser.getName().equals("transition")) {
                    TypedArray d3 = dye.d(resources2, theme, attributeSet, g09.c);
                    int resourceId3 = d3.getResourceId(2, -1);
                    int resourceId4 = d3.getResourceId(1, -1);
                    int resourceId5 = d3.getResourceId(z ? 1 : 0, -1);
                    Drawable g2 = resourceId5 > 0 ? hc9.d().g(context2, resourceId5) : null;
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
                            g2 = new mo(context2);
                            g2.inflate(resources2, xmlResourceParser, attributeSet, theme);
                        } else {
                            g2 = lq2.a(resources, xmlResourceParser, attributeSet, theme);
                        }
                    }
                    if (g2 == null) {
                        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                    }
                    if (resourceId3 == -1 || resourceId4 == -1) {
                        break;
                    }
                    un unVar4 = xnVar.F;
                    int a2 = unVar4.a(g2);
                    long j = resourceId3;
                    long j2 = resourceId4;
                    long j3 = (j << 32) | j2;
                    long j4 = z2 ? 8589934592L : 0L;
                    long j5 = a2;
                    unVar4.I.a(j3, Long.valueOf(j5 | j4));
                    if (z2) {
                        unVar4.I.a((j2 << 32) | j, Long.valueOf(j5 | 4294967296L | j4));
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
                    drawable2.setAlpha(((255 - (((int) ((j - uptimeMillis) * 255)) / this.a.y)) * this.e) / nm7.d4);
                    z2 = true;
                    drawable = this.d;
                    if (drawable == null) {
                        long j2 = this.w;
                        if (j2 != 0) {
                            if (j2 > uptimeMillis) {
                                drawable.setAlpha(((((int) ((j2 - uptimeMillis) * 255)) / this.a.z) * this.e) / nm7.d4);
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
        un unVar = this.a;
        if (theme == null) {
            unVar.getClass();
            return;
        }
        unVar.c();
        int i = unVar.h;
        Drawable[] drawableArr = unVar.g;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable != null && drawable.canApplyTheme()) {
                drawableArr[i2].applyTheme(theme);
                unVar.e |= drawableArr[i2].getChangingConfigurations();
            }
        }
        Resources resources = theme.getResources();
        if (resources != null) {
            unVar.b = resources;
            int i3 = resources.getDisplayMetrics().densityDpi;
            if (i3 == 0) {
                i3 = nm7.p2;
            }
            int i4 = unVar.c;
            unVar.c = i3;
            if (i4 != i3) {
                unVar.m = false;
                unVar.j = false;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    public final void d(Drawable drawable) {
        jo joVar = this.x;
        if (joVar == null) {
            joVar = new jo();
            this.x = joVar;
        }
        joVar.b = drawable.getCallback();
        drawable.setCallback(joVar);
        try {
            if (this.a.y <= 0 && this.f) {
                drawable.setAlpha(this.e);
            }
            un unVar = this.a;
            if (unVar.C) {
                drawable.setColorFilter(unVar.B);
            } else {
                if (unVar.F) {
                    drawable.setTintList(unVar.D);
                }
                un unVar2 = this.a;
                if (unVar2.G) {
                    drawable.setTintMode(unVar2.E);
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
            jo joVar2 = this.x;
            Drawable.Callback callback = (Drawable.Callback) joVar2.b;
            joVar2.b = null;
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
            un unVar = new un(this.F, this, null);
            unVar.I = unVar.I.clone();
            unVar.J = unVar.J.clone();
            i(unVar);
            this.n = true;
        }
        return this;
    }

    public final Drawable g() {
        if (!this.E) {
            f();
            un unVar = this.y;
            unVar.I = unVar.I.clone();
            unVar.J = unVar.J.clone();
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
        un unVar = this.a;
        if (!unVar.u) {
            unVar.c();
            unVar.u = true;
            int i = unVar.h;
            Drawable[] drawableArr = unVar.g;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    unVar.v = true;
                    z = true;
                    break;
                }
                if (drawableArr[i2].getConstantState() == null) {
                    unVar.v = false;
                    z = false;
                    break;
                }
                i2++;
            }
        } else {
            z = unVar.v;
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
        un unVar = this.a;
        if (unVar.l) {
            if (!unVar.m) {
                unVar.b();
            }
            return unVar.o;
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        un unVar = this.a;
        if (unVar.l) {
            if (!unVar.m) {
                unVar.b();
            }
            return unVar.n;
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        un unVar = this.a;
        if (unVar.l) {
            if (!unVar.m) {
                unVar.b();
            }
            return unVar.q;
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        un unVar = this.a;
        if (unVar.l) {
            if (!unVar.m) {
                unVar.b();
            }
            return unVar.p;
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
            un unVar = this.a;
            if (unVar.r) {
                return unVar.s;
            }
            unVar.c();
            int i = unVar.h;
            Drawable[] drawableArr = unVar.g;
            r1 = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                r1 = Drawable.resolveOpacity(r1, drawableArr[i2].getOpacity());
            }
            unVar.s = r1;
            unVar.r = true;
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
        un unVar = this.a;
        Rect rect2 = null;
        boolean z = false;
        if (!unVar.i) {
            Rect rect3 = unVar.k;
            if (rect3 != null || unVar.j) {
                rect2 = rect3;
            } else {
                unVar.c();
                Rect rect4 = new Rect();
                int i = unVar.h;
                Drawable[] drawableArr = unVar.g;
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
                unVar.j = true;
                unVar.k = rect2;
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
            un unVar = this.a;
            if (i < unVar.h) {
                Drawable d = unVar.d(i);
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

    public final void i(un unVar) {
        this.a = unVar;
        int i = this.h;
        if (i >= 0) {
            Drawable d = unVar.d(i);
            this.c = d;
            if (d != null) {
                d(d);
            }
        }
        this.d = null;
        this.y = unVar;
        this.F = unVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        un unVar = this.a;
        if (unVar != null) {
            unVar.r = false;
            unVar.t = false;
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
        ynd yndVar = this.G;
        if (yndVar != null) {
            yndVar.d();
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
            un unVar = this.F;
            unVar.I = unVar.I.clone();
            unVar.J = unVar.J.clone();
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
        un unVar = this.a;
        int i2 = this.h;
        int i3 = unVar.h;
        Drawable[] drawableArr = unVar.g;
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
        unVar.x = i;
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
        ynd tnVar;
        un unVar = this.F;
        int f = unVar.f(iArr);
        if (f < 0) {
            f = unVar.f(StateSet.WILD_CARD);
        }
        if (f != this.h) {
            ynd yndVar = this.G;
            if (yndVar != null) {
                if (f != this.H) {
                    if (f == this.I && yndVar.a()) {
                        yndVar.b();
                        this.H = this.I;
                        this.I = f;
                    } else {
                        i = this.H;
                        yndVar.d();
                    }
                }
                r2 = true;
            } else {
                i = this.h;
            }
            this.G = null;
            this.I = -1;
            this.H = -1;
            un unVar2 = this.F;
            int e = unVar2.e(i);
            int e2 = unVar2.e(f);
            if (e2 != 0 && e != 0) {
                long j = (e << 32) | e2;
                int longValue = (int) ((Long) unVar2.I.g(-1L, j)).longValue();
                if (longValue >= 0) {
                    boolean z = (((Long) unVar2.I.g(-1L, j)).longValue() & 8589934592L) != 0;
                    h(longValue);
                    Object obj = this.c;
                    if (obj instanceof AnimationDrawable) {
                        tnVar = new vn((AnimationDrawable) obj, (((Long) unVar2.I.g(-1L, j)).longValue() & 4294967296L) != 0, z);
                    } else if (obj instanceof mo) {
                        tnVar = new tn((mo) obj, (byte) 1);
                    } else if (obj instanceof Animatable) {
                        tnVar = new tn((Animatable) obj, (byte) 0);
                    }
                    tnVar.c();
                    this.G = tnVar;
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
        un unVar = this.a;
        if (unVar.A != z) {
            unVar.A = z;
            Drawable drawable = this.c;
            if (drawable != null) {
                drawable.setAutoMirrored(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        un unVar = this.a;
        unVar.C = true;
        if (unVar.B != colorFilter) {
            unVar.B = colorFilter;
            Drawable drawable = this.c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        un unVar = this.a;
        if (unVar.w != z) {
            unVar.w = z;
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
        un unVar = this.a;
        unVar.F = true;
        if (unVar.D != colorStateList) {
            unVar.D = colorStateList;
            this.c.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        un unVar = this.a;
        unVar.G = true;
        if (unVar.E != mode) {
            unVar.E = mode;
            this.c.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean j = j(z, z2);
        ynd yndVar = this.G;
        if (yndVar != null && (j || z2)) {
            if (z) {
                yndVar.c();
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
