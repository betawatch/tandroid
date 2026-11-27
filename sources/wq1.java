// default package

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class wq1 extends rt1 {
    public final xk4 A3;
    public final vpa B3;
    public boolean C3;
    public final Path D3;
    public boolean E3;
    public int F3;
    public final /* synthetic */ zu1 G3;
    public int g3;
    public final ArrayList h3;
    public final ArrayList i3;
    public final ArrayList j3;
    public final ArrayList k3;
    public final ArrayList l3;
    public int m3;
    public int n3;
    public int o3;
    public long p3;
    public float q3;
    public float r3;
    public boolean s3;
    public final float t3;
    public final Paint u3;
    public final Paint v3;
    public final xk4 w3;
    public final vpa x3;
    public final xk4 y3;
    public final vpa z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wq1(zu1 zu1Var, Context context, xu1 xu1Var) {
        super(zu1Var, context, xu1Var);
        this.G3 = zu1Var;
        this.h3 = new ArrayList();
        this.i3 = new ArrayList();
        this.j3 = new ArrayList();
        this.k3 = new ArrayList();
        this.l3 = new ArrayList(10);
        this.t3 = 2000.0f;
        final byte b = 1;
        Paint paint = new Paint(1);
        this.u3 = paint;
        Paint paint2 = new Paint(1);
        this.v3 = paint2;
        xk4 xk4Var = new xk4(0.0f);
        this.w3 = xk4Var;
        vpa vpaVar = new vpa(xk4Var);
        vpaVar.h = 0.0f;
        vpaVar.g = 2000.0f;
        vpaVar.m = bp1.j(0.0f, 1500.0f, 1.0f);
        final byte b2 = 0;
        vpaVar.b(new qs3(this) { // from class: vq1
            public final /* synthetic */ wq1 b;

            {
                this.b = this;
            }

            @Override // qs3
            public final void a(vpa vpaVar2, float f, float f2) {
                byte b3 = b2;
                wq1 wq1Var = this.b;
                switch (b3) {
                    case 0:
                        wq1Var.invalidate();
                        break;
                    case 1:
                        wq1Var.invalidate();
                        break;
                    default:
                        wq1Var.invalidate();
                        break;
                }
            }
        });
        this.x3 = vpaVar;
        xk4 xk4Var2 = new xk4(0.0f);
        this.y3 = xk4Var2;
        vpa vpaVar2 = new vpa(xk4Var2);
        vpaVar2.h = 0.0f;
        vpaVar2.m = bp1.j(0.0f, 400.0f, 0.5f);
        vpaVar2.b(new qs3(this) { // from class: vq1
            public final /* synthetic */ wq1 b;

            {
                this.b = this;
            }

            @Override // qs3
            public final void a(vpa vpaVar22, float f, float f2) {
                byte b3 = b;
                wq1 wq1Var = this.b;
                switch (b3) {
                    case 0:
                        wq1Var.invalidate();
                        break;
                    case 1:
                        wq1Var.invalidate();
                        break;
                    default:
                        wq1Var.invalidate();
                        break;
                }
            }
        });
        this.z3 = vpaVar2;
        xk4 xk4Var3 = new xk4(0.0f);
        this.A3 = xk4Var3;
        vpa vpaVar3 = new vpa(xk4Var3);
        vpaVar3.h = 0.0f;
        vpaVar3.m = bp1.j(0.0f, 200.0f, 1.0f);
        final byte b3 = 2;
        vpaVar3.b(new qs3(this) { // from class: vq1
            public final /* synthetic */ wq1 b;

            {
                this.b = this;
            }

            @Override // qs3
            public final void a(vpa vpaVar22, float f, float f2) {
                byte b32 = b3;
                wq1 wq1Var = this.b;
                switch (b32) {
                    case 0:
                        wq1Var.invalidate();
                        break;
                    case 1:
                        wq1Var.invalidate();
                        break;
                    default:
                        wq1Var.invalidate();
                        break;
                }
            }
        });
        this.B3 = vpaVar3;
        this.D3 = new Path();
        this.F3 = 0;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(hl.L(2.0f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(hl.L(2.0f));
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0459  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A1(Canvas canvas, RectF rectF) {
        int i;
        int i2;
        float f;
        zu1 zu1Var;
        float f2;
        int i3;
        float f3;
        int i4;
        m47 m47Var;
        int i5;
        ArrayList arrayList;
        l47 l47Var;
        boolean z;
        int i6;
        m47 currentMessagesGroup;
        int i7;
        int backgroundDrawableLeft;
        int backgroundDrawableRight;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z2;
        a aVar;
        int measuredHeight;
        int i15;
        int i16;
        a aVar2;
        int measuredHeight2;
        wq1 wq1Var = this;
        Canvas canvas2 = canvas;
        int childCount = wq1Var.getChildCount();
        m47 m47Var2 = null;
        int i17 = 0;
        while (true) {
            i = 8;
            i2 = 2;
            f = 0.0f;
            zu1Var = wq1Var.G3;
            if (i17 >= childCount) {
                f2 = 1.0f;
                break;
            }
            View childAt = wq1Var.getChildAt(i17);
            f2 = 1.0f;
            if (childAt.getVisibility() != 4 && childAt.getVisibility() != 8 && !zu1Var.Ya(childAt, rectF)) {
                if (childAt instanceof ec2) {
                    canvas2.save();
                    canvas2.translate(childAt.getX(), childAt.getY());
                    ((ec2) childAt).a(canvas2);
                    canvas2.restore();
                } else if (zu1Var.D0.n && (childAt instanceof eq0)) {
                    float measuredHeight3 = ((((wq1Var.getMeasuredHeight() - zu1Var.P9) - zu1Var.Ya) / 2.0f) - (childAt.getMeasuredHeight() / 2)) + zu1Var.P9;
                    if (!((eq0) childAt).J && !zu1Var.A0.W1) {
                        if (childAt.getTop() > measuredHeight3) {
                            childAt.setTranslationY(measuredHeight3 - childAt.getTop());
                        } else {
                            childAt.setTranslationY(0.0f);
                        }
                    }
                } else if (childAt instanceof gbc) {
                    float measuredHeight4 = ((((wq1Var.getMeasuredHeight() - zu1Var.P9) - zu1Var.Ya) / 2.0f) - (childAt.getMeasuredHeight() / 2)) + zu1Var.P9;
                    if (!((gbc) childAt).P && !zu1Var.A0.W1) {
                        if (childAt.getTop() > measuredHeight4) {
                            childAt.setTranslationY(measuredHeight4 - childAt.getTop());
                        } else {
                            childAt.setTranslationY(0.0f);
                        }
                    }
                } else {
                    if (childAt instanceof wb2) {
                        wb2 wb2Var = (wb2) childAt;
                        m47 currentMessagesGroup2 = wb2Var.getCurrentMessagesGroup();
                        if (currentMessagesGroup2 == null || currentMessagesGroup2 != m47Var2) {
                            j47 currentPosition = wb2Var.getCurrentPosition();
                            m37 backgroundDrawable = wb2Var.getBackgroundDrawable();
                            if ((backgroundDrawable.f || wb2Var.B2()) && (currentPosition == null || (currentPosition.l & 2) != 0)) {
                                boolean z3 = wb2Var.x6;
                                vnb vnbVar = wq1Var.o2;
                                z2 = true;
                                if (z3 || wb2Var.y6) {
                                    i14 = i17;
                                    if (currentPosition == null) {
                                        Paint Y0 = wq1Var.Y0("paintChatMessageBackgroundSelected");
                                        xu1 xu1Var = zu1Var.Ba;
                                        if ((xu1Var == null || !xu1Var.q) && Y0 != null) {
                                            if (zu1Var.Y7()) {
                                                measuredHeight = zu1Var.A0.getTop();
                                            } else {
                                                aVar = ((e) zu1Var).actionBar;
                                                measuredHeight = aVar.getMeasuredHeight();
                                            }
                                            float backgroundTranslationY = measuredHeight - zu1Var.m1.getBackgroundTranslationY();
                                            int backgroundSizeY = zu1Var.m1.getBackgroundSizeY();
                                            xu1 xu1Var2 = zu1Var.Ba;
                                            if (xu1Var2 != null) {
                                                xu1Var2.b(wb2Var.getX(), backgroundTranslationY, wq1Var.getMeasuredWidth(), backgroundSizeY);
                                            } else {
                                                aob.q(wb2Var.getX(), backgroundTranslationY, wq1Var.getMeasuredWidth(), backgroundSizeY);
                                            }
                                        } else {
                                            Y0 = aob.a2;
                                            Y0.setColor(aob.v0(aob.yd, vnbVar));
                                        }
                                        Paint paint = Y0;
                                        canvas2.save();
                                        canvas2.translate(0.0f, wb2Var.getTranslationY());
                                        int alpha = paint.getAlpha();
                                        paint.setAlpha((int) (wb2Var.getAlpha() * wb2Var.getHighlightAlpha() * alpha));
                                        canvas2.drawRect(0.0f, wb2Var.getTop(), wq1Var.getMeasuredWidth(), wb2Var.getBottom(), paint);
                                        paint.setAlpha(alpha);
                                        canvas2.restore();
                                    }
                                } else {
                                    int y = (int) wb2Var.getY();
                                    canvas2.save();
                                    if (currentPosition == null) {
                                        i15 = wb2Var.getMeasuredHeight();
                                        i14 = i17;
                                    } else {
                                        int measuredHeight5 = wb2Var.getMeasuredHeight() + y;
                                        long j = 0;
                                        float f4 = 0.0f;
                                        int i18 = 0;
                                        while (i18 < childCount) {
                                            View childAt2 = wq1Var.getChildAt(i18);
                                            int i19 = i17;
                                            if (childAt2 instanceof wb2) {
                                                wb2 wb2Var2 = (wb2) childAt2;
                                                if (wb2Var2.getCurrentMessagesGroup() == currentMessagesGroup2) {
                                                    m37 backgroundDrawable2 = wb2Var2.getBackgroundDrawable();
                                                    i16 = i18;
                                                    y = Math.min(y, (int) wb2Var2.getY());
                                                    measuredHeight5 = Math.max(measuredHeight5, wb2Var2.getMeasuredHeight() + ((int) wb2Var2.getY()));
                                                    long j2 = backgroundDrawable2.l;
                                                    if (j2 > j) {
                                                        j = j2;
                                                        f = wb2Var2.getX() + backgroundDrawable2.h;
                                                        f4 = wb2Var2.getY() + backgroundDrawable2.i;
                                                    }
                                                    i18 = i16 + 1;
                                                    i17 = i19;
                                                }
                                            }
                                            i16 = i18;
                                            i18 = i16 + 1;
                                            i17 = i19;
                                        }
                                        i14 = i17;
                                        backgroundDrawable.j = f;
                                        backgroundDrawable.k = f4 - y;
                                        i15 = measuredHeight5 - y;
                                    }
                                    int i20 = i15 + y;
                                    canvas2.clipRect(0, y, wq1Var.getMeasuredWidth(), i20);
                                    Paint Y02 = wq1Var.Y0("paintChatMessageBackgroundSelected");
                                    xu1 xu1Var3 = zu1Var.Ba;
                                    if (xu1Var3 == null || xu1Var3.q || Y02 == null) {
                                        backgroundDrawable.b = null;
                                        backgroundDrawable.a.setColor(aob.v0(aob.yd, vnbVar));
                                    } else {
                                        backgroundDrawable.b = Y02;
                                        if (zu1Var.Y7()) {
                                            measuredHeight2 = zu1Var.A0.getTop();
                                        } else {
                                            aVar2 = ((e) zu1Var).actionBar;
                                            measuredHeight2 = aVar2.getMeasuredHeight();
                                        }
                                        float backgroundTranslationY2 = measuredHeight2 - zu1Var.m1.getBackgroundTranslationY();
                                        int backgroundSizeY2 = zu1Var.m1.getBackgroundSizeY();
                                        xu1 xu1Var4 = zu1Var.Ba;
                                        if (xu1Var4 != null) {
                                            xu1Var4.b(wb2Var.getX(), backgroundTranslationY2, wq1Var.getMeasuredWidth(), backgroundSizeY2);
                                        } else {
                                            aob.q(wb2Var.getX(), backgroundTranslationY2, wq1Var.getMeasuredWidth(), backgroundSizeY2);
                                        }
                                    }
                                    backgroundDrawable.setBounds(0, y, wq1Var.getMeasuredWidth(), i20);
                                    backgroundDrawable.draw(canvas2);
                                    canvas2.restore();
                                }
                            } else {
                                i14 = i17;
                                z2 = true;
                            }
                            m47Var2 = currentMessagesGroup2;
                        } else {
                            i14 = i17;
                            z2 = true;
                        }
                        if (zu1Var.Z8 != wb2Var && currentMessagesGroup2 == null && wb2Var.L0()) {
                            canvas2.save();
                            canvas2.translate(wb2Var.getX(), wb2Var.getY() + wb2Var.getPaddingTop());
                            if (wb2Var.getScaleX() != 1.0f) {
                                canvas2.scale(wb2Var.getScaleX(), wb2Var.getScaleY(), wb2Var.getPivotX(), wb2Var.getHeight() >> 1);
                            }
                            wb2Var.M0(canvas2, z2, false);
                            canvas2.restore();
                        }
                    } else {
                        i14 = i17;
                        if (childAt instanceof dl1) {
                            dl1 dl1Var = (dl1) childAt;
                            if (dl1Var.S()) {
                                canvas2.save();
                                canvas2.translate(dl1Var.getX(), dl1Var.getY() + dl1Var.getPaddingTop());
                                canvas2.scale(dl1Var.getScaleX(), dl1Var.getScaleY(), dl1Var.getMeasuredWidth() / 2.0f, dl1Var.getMeasuredHeight() / 2.0f);
                                canvas2.translate(zu1Var.o7() / 2.0f, 0.0f);
                                dl1Var.I(canvas2, true);
                                dl1Var.L(canvas2, true);
                                canvas2.restore();
                            }
                        }
                    }
                    i17 = i14 + 1;
                }
            }
            i14 = i17;
            i17 = i14 + 1;
        }
        View view = zu1Var.Z8;
        m47 currentMessagesGroup3 = view instanceof wb2 ? ((wb2) view).getCurrentMessagesGroup() : null;
        int i21 = 0;
        while (i21 < 3) {
            ArrayList arrayList2 = wq1Var.l3;
            arrayList2.clear();
            if (i21 != i2 || zu1Var.A0.W1) {
                int i22 = 0;
                while (i22 < childCount) {
                    View childAt3 = zu1Var.A0.getChildAt(i22);
                    if (childAt3 instanceof wb2) {
                        wb2 wb2Var3 = (wb2) childAt3;
                        if (childAt3.getY() <= zu1Var.A0.getHeight() && childAt3.getY() + childAt3.getHeight() >= f && wb2Var3.getVisibility() != i && (currentMessagesGroup = wb2Var3.getCurrentMessagesGroup()) != null) {
                            l47 l47Var2 = currentMessagesGroup.m;
                            if (i21 == 0) {
                                i6 = i;
                                i7 = 1;
                                if (currentMessagesGroup.d.size() == 1) {
                                    i22++;
                                    i = i6;
                                    i2 = 2;
                                    f = 0.0f;
                                }
                            } else {
                                i6 = i;
                                i7 = 1;
                            }
                            if ((i21 != i7 || l47Var2.i) && ((i21 != 0 || !wb2Var3.getMessageObject().Z) && (i21 != 1 || wb2Var3.getMessageObject().Z))) {
                                boolean z4 = wb2Var3.La;
                                if (i21 == i2) {
                                    if (!z4) {
                                    }
                                    if (!arrayList2.contains(currentMessagesGroup)) {
                                        l47Var2.a = 0;
                                        l47Var2.b = 0;
                                        l47Var2.c = 0;
                                        l47Var2.d = 0;
                                        l47Var2.l = false;
                                        l47Var2.k = false;
                                        l47Var2.m = wb2Var3;
                                        arrayList2.add(currentMessagesGroup);
                                    }
                                    l47Var2.k = wb2Var3.L2();
                                    l47Var2.l = wb2Var3.K2();
                                    backgroundDrawableLeft = wb2Var3.getBackgroundDrawableLeft() + wb2Var3.getLeft();
                                    backgroundDrawableRight = wb2Var3.getBackgroundDrawableRight() + wb2Var3.getLeft();
                                    int backgroundDrawableTop = wb2Var3.getBackgroundDrawableTop() + wb2Var3.getPaddingTop() + wb2Var3.getTop();
                                    int backgroundDrawableBottom = wb2Var3.getBackgroundDrawableBottom() + wb2Var3.getPaddingTop() + wb2Var3.getTop();
                                    if ((wb2Var3.getCurrentPosition().l & 4) == 0) {
                                        backgroundDrawableTop -= hl.L(10.0f);
                                    }
                                    i8 = backgroundDrawableTop;
                                    if ((wb2Var3.getCurrentPosition().l & 8) == 0) {
                                        backgroundDrawableBottom = hl.L(10.0f) + backgroundDrawableBottom;
                                    }
                                    i9 = backgroundDrawableBottom;
                                    if (wb2Var3.La) {
                                        l47Var2.m = wb2Var3;
                                    }
                                    i10 = l47Var2.b;
                                    if (i10 != 0 || i8 < i10) {
                                        l47Var2.b = i8;
                                    }
                                    i11 = l47Var2.d;
                                    if (i11 != 0 || i9 > i11) {
                                        l47Var2.d = i9;
                                    }
                                    i12 = l47Var2.a;
                                    if (i12 != 0 || backgroundDrawableLeft < i12) {
                                        l47Var2.a = backgroundDrawableLeft;
                                    }
                                    i13 = l47Var2.c;
                                    if (i13 != 0 || backgroundDrawableRight > i13) {
                                        l47Var2.c = backgroundDrawableRight;
                                    }
                                } else {
                                    if (z4) {
                                    }
                                    if (!arrayList2.contains(currentMessagesGroup)) {
                                    }
                                    l47Var2.k = wb2Var3.L2();
                                    l47Var2.l = wb2Var3.K2();
                                    backgroundDrawableLeft = wb2Var3.getBackgroundDrawableLeft() + wb2Var3.getLeft();
                                    backgroundDrawableRight = wb2Var3.getBackgroundDrawableRight() + wb2Var3.getLeft();
                                    int backgroundDrawableTop2 = wb2Var3.getBackgroundDrawableTop() + wb2Var3.getPaddingTop() + wb2Var3.getTop();
                                    int backgroundDrawableBottom2 = wb2Var3.getBackgroundDrawableBottom() + wb2Var3.getPaddingTop() + wb2Var3.getTop();
                                    if ((wb2Var3.getCurrentPosition().l & 4) == 0) {
                                    }
                                    i8 = backgroundDrawableTop2;
                                    if ((wb2Var3.getCurrentPosition().l & 8) == 0) {
                                    }
                                    i9 = backgroundDrawableBottom2;
                                    if (wb2Var3.La) {
                                    }
                                    i10 = l47Var2.b;
                                    if (i10 != 0) {
                                    }
                                    l47Var2.b = i8;
                                    i11 = l47Var2.d;
                                    if (i11 != 0) {
                                    }
                                    l47Var2.d = i9;
                                    i12 = l47Var2.a;
                                    if (i12 != 0) {
                                    }
                                    l47Var2.a = backgroundDrawableLeft;
                                    i13 = l47Var2.c;
                                    if (i13 != 0) {
                                    }
                                    l47Var2.c = backgroundDrawableRight;
                                }
                            }
                            i22++;
                            i = i6;
                            i2 = 2;
                            f = 0.0f;
                        }
                    }
                    i6 = i;
                    i22++;
                    i = i6;
                    i2 = 2;
                    f = 0.0f;
                }
                i3 = i;
                int i23 = 0;
                while (i23 < arrayList2.size()) {
                    m47 m47Var3 = (m47) arrayList2.get(i23);
                    l47 l47Var3 = m47Var3.m;
                    ArrayList arrayList3 = m47Var3.d;
                    float U1 = l47Var3.m.U1(true);
                    float f5 = l47Var3.a + U1 + l47Var3.e;
                    float f6 = l47Var3.b + l47Var3.f;
                    float f7 = l47Var3.g + l47Var3.c + U1;
                    float f8 = l47Var3.d + l47Var3.h;
                    if (!l47Var3.j) {
                        f6 += l47Var3.m.getTranslationY();
                        f8 += l47Var3.m.getTranslationY();
                    }
                    float f9 = f6;
                    if (f8 > hl.L(20.0f) + zu1Var.A0.getMeasuredHeight()) {
                        f8 = hl.L(20.0f) + zu1Var.A0.getMeasuredHeight();
                    }
                    boolean z5 = (l47Var3.m.getScaleX() == f2 && l47Var3.m.getScaleY() == f2) ? false : true;
                    if (z5) {
                        canvas2.save();
                        m47Var = m47Var3;
                        i5 = i21;
                        arrayList = arrayList2;
                        canvas2.scale(l47Var3.m.getScaleX(), l47Var3.m.getScaleY(), bp1.z(f7, f5, 2.0f, f5), bp1.z(f8, f9, 2.0f, f9));
                    } else {
                        m47Var = m47Var3;
                        i5 = i21;
                        arrayList = arrayList2;
                    }
                    int size = arrayList3.size();
                    int i24 = 0;
                    while (true) {
                        if (i24 >= size) {
                            l47Var = l47Var3;
                            z = true;
                            break;
                        }
                        r47 r47Var = (r47) arrayList3.get(i24);
                        l47Var = l47Var3;
                        if (zu1Var.o6[r47.B0(r47Var.k) == zu1Var.l6 ? (char) 0 : (char) 1].indexOfKey(r47Var.e1()) < 0) {
                            z = false;
                            break;
                        } else {
                            i24++;
                            l47Var3 = l47Var;
                        }
                    }
                    float f10 = f8;
                    zu1 zu1Var2 = zu1Var;
                    boolean z6 = z;
                    m47 m47Var4 = m47Var;
                    l47Var.m.K0(canvas, (int) f5, (int) f9, (int) f7, (int) f8, l47Var.k, l47Var.l, z6, 0);
                    if (m47Var4 != currentMessagesGroup3) {
                        l47Var.m = null;
                    }
                    l47Var.o = m47Var4.c;
                    if (z5) {
                        canvas.restore();
                        for (int i25 = 0; i25 < childCount; i25++) {
                            View childAt4 = zu1Var2.A0.getChildAt(i25);
                            if (childAt4 instanceof wb2) {
                                wb2 wb2Var4 = (wb2) childAt4;
                                if (wb2Var4.getCurrentMessagesGroup() == m47Var4) {
                                    int left = wb2Var4.getLeft();
                                    int top = wb2Var4.getTop();
                                    childAt4.setPivotX(((f7 - f5) / 2.0f) + (f5 - left));
                                    childAt4.setPivotY(((f10 - f9) / 2.0f) + (f9 - top));
                                }
                            }
                        }
                    }
                    i23++;
                    canvas2 = canvas;
                    zu1Var = zu1Var2;
                    i21 = i5;
                    arrayList2 = arrayList;
                }
                f3 = 0.0f;
                i4 = 2;
            } else {
                i3 = i;
                i4 = i2;
                f3 = f;
            }
            canvas2 = canvas;
            zu1Var = zu1Var;
            i = i3;
            f = f3;
            i2 = i4;
            i21++;
            wq1Var = this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B1(Canvas canvas, RectF rectF) {
        float f;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = this.h3;
        int size = arrayList3.size();
        zu1 zu1Var = this.G3;
        boolean z = 1;
        boolean z2 = false;
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                wb2 wb2Var = (wb2) arrayList3.get(i);
                if (!zu1Var.Ya(wb2Var, rectF)) {
                    canvas.save();
                    canvas.translate(wb2Var.U1(false) + wb2Var.getLeft(), wb2Var.getY() + wb2Var.getPaddingTop());
                    wb2Var.A1(wb2Var.a() ? wb2Var.getAlpha() : 1.0f, canvas, true);
                    canvas.restore();
                }
            }
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.i3;
        int size2 = arrayList4.size();
        if (size2 > 0) {
            for (int i2 = 0; i2 < size2; i2++) {
                wb2 wb2Var2 = (wb2) arrayList4.get(i2);
                if (!zu1Var.Ya(wb2Var2, rectF)) {
                    float U1 = wb2Var2.U1(false) + wb2Var2.getLeft();
                    float y = wb2Var2.getY() + wb2Var2.getPaddingTop();
                    float alpha = wb2Var2.a() ? wb2Var2.getAlpha() : 1.0f;
                    canvas.save();
                    canvas.translate(U1, y);
                    wb2Var2.setInvalidatesParent(true);
                    wb2Var2.h1(canvas, alpha);
                    wb2Var2.setInvalidatesParent(false);
                    canvas.restore();
                }
            }
            arrayList4.clear();
        }
        ArrayList arrayList5 = this.j3;
        int size3 = arrayList5.size();
        if (size3 > 0) {
            int i3 = 0;
            while (i3 < size3) {
                wb2 wb2Var3 = (wb2) arrayList5.get(i3);
                if (zu1Var.Ya(wb2Var3, rectF)) {
                    arrayList2 = arrayList5;
                } else {
                    boolean z3 = (wb2Var3.getCurrentPosition() == null || (wb2Var3.getCurrentPosition().l & z) != 0) ? z2 : z;
                    float alpha2 = wb2Var3.a() ? wb2Var3.getAlpha() : 1.0f;
                    float U12 = wb2Var3.U1(z2) + wb2Var3.getLeft();
                    float y2 = wb2Var3.getY() + wb2Var3.getPaddingTop();
                    canvas.save();
                    m47 currentMessagesGroup = wb2Var3.getCurrentMessagesGroup();
                    if (currentMessagesGroup != null) {
                        l47 l47Var = currentMessagesGroup.m;
                        if (l47Var.j) {
                            float U13 = wb2Var3.U1(z);
                            float f2 = l47Var.a + U13 + l47Var.e;
                            arrayList2 = arrayList5;
                            float f3 = l47Var.b + l47Var.f;
                            float f4 = l47Var.c + U13 + l47Var.g;
                            float f5 = l47Var.d + l47Var.h;
                            if (!l47Var.j) {
                                f3 += wb2Var3.getTranslationY();
                                f5 += wb2Var3.getTranslationY();
                            }
                            canvas.clipRect(f2 + hl.L(8.0f), f3 + hl.L(8.0f), f4 - hl.L(8.0f), f5 - hl.L(8.0f));
                            if (wb2Var3.getTransitionParams().w0) {
                                canvas.translate(U12, y2);
                                wb2Var3.setInvalidatesParent(true);
                                wb2Var3.Q0(alpha2, canvas, z3);
                                wb2Var3.setInvalidatesParent(false);
                            }
                            canvas.restore();
                        }
                    }
                    arrayList2 = arrayList5;
                    if (wb2Var3.getTransitionParams().w0) {
                    }
                    canvas.restore();
                }
                i3++;
                arrayList5 = arrayList2;
                z = 1;
                z2 = false;
            }
            f = 8.0f;
            arrayList5.clear();
        } else {
            f = 8.0f;
        }
        ArrayList arrayList6 = this.k3;
        int size4 = arrayList6.size();
        if (size4 > 0) {
            int i4 = 0;
            while (i4 < size4) {
                wb2 wb2Var4 = (wb2) arrayList6.get(i4);
                if (zu1Var.Ya(wb2Var4, rectF)) {
                    arrayList = arrayList6;
                } else {
                    boolean z4 = wb2Var4.getCurrentPosition() != null && (wb2Var4.getCurrentPosition().l & 1) == 0;
                    float alpha3 = wb2Var4.a() ? wb2Var4.getAlpha() : 1.0f;
                    float U14 = wb2Var4.U1(false) + wb2Var4.getLeft();
                    float y3 = wb2Var4.getY() + wb2Var4.getPaddingTop();
                    canvas.save();
                    m47 currentMessagesGroup2 = wb2Var4.getCurrentMessagesGroup();
                    if (currentMessagesGroup2 != null) {
                        l47 l47Var2 = currentMessagesGroup2.m;
                        if (l47Var2.j) {
                            float U15 = wb2Var4.U1(true);
                            float f6 = l47Var2.a + U15 + l47Var2.e;
                            float f7 = l47Var2.b + l47Var2.f;
                            float f8 = l47Var2.c + U15 + l47Var2.g;
                            arrayList = arrayList6;
                            float f9 = l47Var2.d + l47Var2.h;
                            if (!l47Var2.j) {
                                f7 += wb2Var4.getTranslationY();
                                f9 += wb2Var4.getTranslationY();
                            }
                            canvas.clipRect(f6 + hl.L(f), f7 + hl.L(f), f8 - hl.L(f), f9 - hl.L(f));
                            if (!z4 && wb2Var4.getTransitionParams().w0) {
                                canvas.translate(U14, y3);
                                wb2Var4.setInvalidatesParent(true);
                                wb2Var4.q1(canvas, alpha3, null);
                                wb2Var4.V0(canvas, alpha3);
                                wb2Var4.setInvalidatesParent(false);
                            }
                            canvas.restore();
                        }
                    }
                    arrayList = arrayList6;
                    if (!z4) {
                        canvas.translate(U14, y3);
                        wb2Var4.setInvalidatesParent(true);
                        wb2Var4.q1(canvas, alpha3, null);
                        wb2Var4.V0(canvas, alpha3);
                        wb2Var4.setInvalidatesParent(false);
                    }
                    canvas.restore();
                }
                i4++;
                arrayList6 = arrayList;
            }
            arrayList6.clear();
        }
    }

    public final void C1(boolean z) {
        float f;
        VelocityTracker velocityTracker;
        zu1 zu1Var = this.G3;
        if (!z || (velocityTracker = zu1Var.B9) == null) {
            f = 0.0f;
        } else {
            velocityTracker.computeCurrentVelocity(1000);
            f = zu1Var.B9.getXVelocity();
        }
        VelocityTracker velocityTracker2 = zu1Var.B9;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            zu1Var.B9 = null;
        }
        zu1Var.y9 = false;
        zu1Var.C0.R = true;
        n0c n0cVar = zu1Var.n0;
        if (n0cVar != null) {
            n0cVar.settle(f);
        }
    }

    public final void D1(MotionEvent motionEvent) {
        TLRPC.Chat chat;
        m47 T6;
        r47 r47Var;
        boolean z;
        ArrayList arrayList;
        TLRPC.Chat chat2;
        boolean z2;
        zu1 zu1Var = this.G3;
        if (motionEvent != null) {
            zu1Var.R4 = true;
        }
        if (zu1Var.l8() && zu1Var.v9 == null) {
            if (motionEvent == null) {
                if (zu1Var.y9) {
                    C1(false);
                }
                zu1Var.x9 = false;
            } else {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    z2 = ((e) zu1Var).inPreviewMode;
                    boolean z3 = (z2 || zu1Var.B7() || motionEvent.getX() < ((float) getMeasuredWidth()) * 0.55f) ? false : true;
                    zu1Var.x9 = z3;
                    if (z3) {
                        zu1Var.y9 = false;
                        zu1Var.z9 = motionEvent.getX();
                        zu1Var.A9 = motionEvent.getY();
                        VelocityTracker velocityTracker = zu1Var.B9;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                        }
                        VelocityTracker obtain = VelocityTracker.obtain();
                        zu1Var.B9 = obtain;
                        obtain.addMovement(motionEvent);
                        return;
                    }
                    zu1Var.y9 = false;
                } else if (zu1Var.x9 || zu1Var.y9) {
                    if (actionMasked != 2) {
                        if (actionMasked == 1 || actionMasked == 3) {
                            if (zu1Var.y9) {
                                VelocityTracker velocityTracker2 = zu1Var.B9;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.addMovement(motionEvent);
                                }
                                C1(actionMasked == 1);
                            }
                            zu1Var.x9 = false;
                            return;
                        }
                        return;
                    }
                    VelocityTracker velocityTracker3 = zu1Var.B9;
                    if (velocityTracker3 != null) {
                        velocityTracker3.addMovement(motionEvent);
                    }
                    float x = motionEvent.getX() - zu1Var.z9;
                    float abs = Math.abs(motionEvent.getY() - zu1Var.A9);
                    if (!zu1Var.x9 || zu1Var.y9 || getScrollState() != 0 || x > (-hl.Z0(true, 0.4f)) || Math.abs(x) / 3.0f <= abs || zu1Var.C6() == null) {
                        if (zu1Var.y9) {
                            zu1Var.n0.setProgress((-(motionEvent.getX() - zu1Var.z9)) / zu1Var.n0.getContentWidth());
                            return;
                        }
                        return;
                    }
                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    super.onInterceptTouchEvent(obtain2);
                    obtain2.recycle();
                    zu1Var.C0.R = false;
                    zu1Var.x9 = false;
                    zu1Var.y9 = true;
                    zu1Var.z9 = motionEvent.getX();
                    n0c n0cVar = zu1Var.n0;
                    ValueAnimator valueAnimator = n0cVar.K;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        n0cVar.K = null;
                    }
                    hl.t1(zu1Var.m1);
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        return;
                    }
                    return;
                }
            }
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !zu1Var.C9 && !zu1Var.w9 && zu1Var.v9 == null) {
            z = ((e) zu1Var).inPreviewMode;
            if (!z) {
                View pressedChildView = getPressedChildView();
                if (!(pressedChildView instanceof wb2)) {
                    if (!(pressedChildView instanceof dl1)) {
                        return;
                    }
                    dl1 dl1Var = (dl1) pressedChildView;
                    float x2 = motionEvent.getX() - pressedChildView.getX();
                    float y = motionEvent.getY() - pressedChildView.getY();
                    if (!dl1Var.U()) {
                        return;
                    }
                    zoc zocVar = dl1Var.J0;
                    float f = (x2 - dl1Var.L0) - (dl1Var.k0 / 2.0f);
                    float paddingTop = (y - dl1Var.M0) - dl1Var.getPaddingTop();
                    yoc yocVar = zocVar.m;
                    if (yocVar != null && yocVar.n && zocVar.w.contains((int) f, (int) paddingTop)) {
                        return;
                    }
                }
                if (zu1Var.v9 != null) {
                    zu1Var.Bc(0.0f);
                }
                zu1Var.v9 = pressedChildView;
                r47 q7 = zu1Var.q7();
                boolean O4 = zu1Var.O4(q7);
                int i = zu1Var.g4;
                if ((i != 0 && i != 5 && i != 8 && (i != 3 || zu1Var.s4 != zu1Var.getUserConfig().e())) || (((arrayList = zu1Var.p4) != null && arrayList.contains(q7)) || ((zu1Var.Z6(q7) == 1 && (r47.B0(q7.k) == zu1Var.d7 || q7.l5())) || ((zu1Var.h == null && q7.e1() < 0) || (((chat2 = zu1Var.e) != null && xc2.c0(chat2) && !O4) || zu1Var.B7() || (r47.c3(q7.k) && q7.N3())))))) {
                    zu1Var.Bc(0.0f);
                    zu1Var.v9 = null;
                    return;
                } else {
                    this.o3 = motionEvent.getPointerId(0);
                    zu1Var.w9 = true;
                    this.m3 = (int) motionEvent.getX();
                    this.n3 = (int) motionEvent.getY();
                    return;
                }
            }
        }
        if (zu1Var.v9 != null && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.o3) {
            int max = Math.max(hl.L(-80.0f), Math.min(0, (int) (motionEvent.getX() - this.m3)));
            int abs2 = Math.abs(((int) motionEvent.getY()) - this.n3);
            if (getScrollState() == 0 && zu1Var.w9 && !zu1Var.C9 && max <= (-hl.Z0(true, 0.4f)) && Math.abs(max) / 3 > abs2) {
                MotionEvent obtain3 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                zu1Var.v9.onTouchEvent(obtain3);
                super.onInterceptTouchEvent(obtain3);
                obtain3.recycle();
                zu1Var.C0.R = false;
                zu1Var.w9 = false;
                zu1Var.C9 = true;
                this.m3 = (int) motionEvent.getX();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            }
            if (zu1Var.C9) {
                if (Math.abs(max) < hl.L(50.0f)) {
                    this.s3 = false;
                } else if (!this.s3) {
                    try {
                        performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    this.s3 = true;
                }
                float f2 = max;
                zu1Var.Bc(f2);
                r47 q72 = zu1Var.q7();
                if (q72 != null && (q72.g4() || r47.K4(q72.k))) {
                    zu1Var.vd(false, false);
                }
                View view = zu1Var.v9;
                if (view instanceof wb2) {
                    E1((wb2) view, f2);
                }
                invalidate();
                return;
            }
            return;
        }
        if (zu1Var.v9 != null) {
            if (motionEvent != null) {
                if (motionEvent.getPointerId(0) != this.o3) {
                    return;
                }
                if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1 && motionEvent.getAction() != 6) {
                    return;
                }
            }
            if (motionEvent != null && motionEvent.getAction() != 3) {
                View view2 = zu1Var.v9;
                if (Math.abs(view2 instanceof wb2 ? ((wb2) view2).U1(false) : view2 instanceof dl1 ? ((dl1) view2).getWalletSlidingOffset() : 0.0f) >= hl.L(50.0f)) {
                    r47 q73 = zu1Var.q7();
                    boolean O42 = zu1Var.O4(q73);
                    rr1 rr1Var = zu1Var.d1;
                    if ((rr1Var == null || rr1Var.getVisibility() != 0 || ((zu1Var.X0 && O42) || q73.X1)) && ((chat = zu1Var.e) == null || ((!xc2.r0(chat) || zu1Var.k8()) && ((!xc2.T(zu1Var.e) || xc2.w(5, zu1Var.e) || zu1Var.e.megagroup) && xc2.n(zu1Var.e))))) {
                        zu1Var.dc(zu1Var.q7());
                    } else {
                        if (q73.c1() != 0 && (T6 = zu1Var.T6(q73.c1())) != null && (r47Var = T6.h) != null) {
                            q73 = r47Var;
                        }
                        zu1Var.F5 = q73;
                        Bundle j = qd4.j(3, "onlySelect", "dialogsType", true);
                        j.putBoolean("quote", true);
                        j.putBoolean("reply_to", true);
                        zu1Var.Xa(j, q73);
                        j.putInt("messagesCount", 1);
                        j.putBoolean("canSelectTopics", true);
                        uj3 uj3Var = new uj3(j);
                        uj3Var.E2 = zu1Var;
                        zu1Var.presentFragment(uj3Var);
                    }
                }
            }
            View view3 = zu1Var.v9;
            float slidingOffsetX = view3 instanceof wb2 ? ((wb2) view3).getSlidingOffsetX() : view3 instanceof dl1 ? ((dl1) view3).getWalletSlidingOffset() : 0.0f;
            this.r3 = slidingOffsetX;
            if (slidingOffsetX == 0.0f) {
                zu1Var.v9 = null;
            }
            this.p3 = System.currentTimeMillis();
            this.q3 = 0.0f;
            invalidate();
            zu1Var.w9 = false;
            zu1Var.C9 = false;
            zu1Var.C0.R = true;
        }
    }

    public final void E1(wb2 wb2Var, float f) {
        m47 currentMessagesGroup = wb2Var.getCurrentMessagesGroup();
        if (currentMessagesGroup == null) {
            return;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != wb2Var && (childAt instanceof wb2)) {
                wb2 wb2Var2 = (wb2) childAt;
                if (wb2Var2.getCurrentMessagesGroup() == currentMessagesGroup) {
                    wb2Var2.setSlidingOffset(f);
                    wb2Var2.invalidate();
                }
            }
        }
        invalidate();
    }

    @Override // d79
    public final boolean H0(View view) {
        return (view.getVisibility() == 4 || view.getVisibility() == 8) ? false : true;
    }

    @Override // android.view.View
    public final AccessibilityNodeInfo createAccessibilityNodeInfo() {
        if (this.G3.h != null) {
            return null;
        }
        return super.createAccessibilityNodeInfo();
    }

    @Override // d79, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        zu1 zu1Var = this.G3;
        zu1Var.K8 = null;
        canvas.save();
        this.F1.setEmpty();
        if (zu1Var.ka != 0.0f) {
            int save = canvas.save();
            float measuredHeight = (-zu1Var.ka) - (zu1Var.ra != 0.0f ? (zu1Var.A0.getMeasuredHeight() - zu1Var.ka) * zu1Var.ra : 0.0f);
            zu1Var.Wa = measuredHeight;
            canvas.translate(0.0f, measuredHeight);
            A1(canvas, null);
            super.dispatchDraw(canvas);
            B1(canvas, null);
            canvas.restoreToCount(save);
        } else {
            A1(canvas, null);
            super.dispatchDraw(canvas);
            B1(canvas, null);
        }
        canvas.restore();
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002b, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r2.f7) <= 200) goto L8;
     */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(android.graphics.Canvas r44) {
        /*
            Method dump skipped, instructions count: 1398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wq1.draw(android.graphics.Canvas):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0289, code lost:
    
        if ((r4 & 1) != 0) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x023b, code lost:
    
        if (r8.c != 0) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x022e, code lost:
    
        if (r7.getTransitionParams().x0 != false) goto L134;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0197  */
    /* JADX WARN: Type inference failed for: r0v44, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v45, types: [pk5] */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v53, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v54, types: [pk5] */
    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        wb2 wb2Var;
        boolean z;
        wb2 wb2Var2;
        dl1 dl1Var;
        int i;
        m47 m47Var;
        int i2;
        boolean z2;
        float f;
        boolean z3;
        float f2;
        boolean z4;
        float f3;
        boolean z5;
        boolean z6;
        int paddingTop;
        wb2 wb2Var3;
        float f4;
        float checkBoxTranslation;
        int layoutHeight;
        float f5;
        int b;
        m47 m47Var2;
        int top;
        ?? r0;
        float checkBoxTranslation2;
        int b2;
        int i3;
        float x;
        float y;
        byte b3;
        r47 r47Var;
        zu1 zu1Var = this.G3;
        if (zu1Var.h8()) {
            invalidate();
        }
        boolean z7 = view == zu1Var.Z8;
        boolean z8 = view instanceof wb2;
        if (z8) {
            wb2Var = (wb2) view;
            z = wb2Var.ub.x0;
        } else {
            wb2Var = null;
            z = false;
        }
        if ((!wma.f0 && ((view.getY() > getMeasuredHeight() || view.getY() + view.getMeasuredHeight() < 0.0f) && !z)) || view.getVisibility() == 4 || view.getVisibility() == 8) {
            z7 = true;
        }
        if (z8) {
            wb2Var2 = (wb2) view;
            if (zu1Var.F6.contains(wb2Var2)) {
                z7 = true;
            }
            j47 currentPosition = wb2Var2.getCurrentPosition();
            m47Var = wb2Var2.getCurrentMessagesGroup();
            if (currentPosition != null) {
                int i4 = currentPosition.e;
                int i5 = currentPosition.i;
                if (i4 != i5 && i5 == 1000 && currentPosition.m == null && m47Var.b) {
                    i = wb2Var2.getBackgroundDrawableLeft();
                    i2 = 0;
                    b3 = wb2Var2.M1;
                    if (b3 != 7) {
                    }
                    zu1Var.K8 = wb2Var2;
                    if (!z7) {
                    }
                    if (z7) {
                    }
                    dl1Var = null;
                } else if (currentPosition.m != null) {
                    i2 = view.getBottom() - hl.L((wb2Var2.K2() ? 1 : 0) + 1);
                    i = 0;
                    b3 = wb2Var2.M1;
                    if ((b3 != 7 || b3 == 4) && (r47Var = wb2Var2.Q5) != null && r47Var.D != 5 && MediaController.z().H(wb2Var2.Q5)) {
                        zu1Var.K8 = wb2Var2;
                    }
                    if (!z7) {
                        View view2 = zu1Var.Z8;
                        if (view2 instanceof wb2) {
                            wb2 wb2Var4 = (wb2) view2;
                            if (wb2Var4.getCurrentMessagesGroup() != null && wb2Var4.getCurrentMessagesGroup() == m47Var) {
                                z7 = true;
                            }
                        }
                    }
                    if (z7) {
                        wb2Var2.getPhotoImage().getClass();
                    }
                    dl1Var = null;
                }
            }
            i = 0;
            i2 = 0;
            b3 = wb2Var2.M1;
            if (b3 != 7) {
            }
            zu1Var.K8 = wb2Var2;
            if (!z7) {
            }
            if (z7) {
            }
            dl1Var = null;
        } else {
            if (view instanceof dl1) {
                dl1Var = (dl1) view;
                wb2Var2 = null;
            } else {
                wb2Var2 = null;
                dl1Var = null;
            }
            i = 0;
            m47Var = null;
            i2 = 0;
        }
        if (i != 0) {
            canvas.save();
        } else if (i2 != 0) {
            canvas.save();
        }
        if (z7) {
            z7 = false;
        }
        if (z7) {
            z2 = true;
            f = 0.0f;
            z3 = false;
        } else {
            boolean z9 = (wb2Var2 == null || wb2Var2.ub.w1 || m47Var == null || !m47Var.m.j) ? false : true;
            if (z9) {
                canvas.save();
                float U1 = wb2Var2.U1(true);
                l47 l47Var = m47Var.m;
                z2 = true;
                float f6 = l47Var.c + U1;
                f = 0.0f;
                canvas.clipRect(l47Var.a + U1 + l47Var.e + hl.L(4.0f), l47Var.b + l47Var.f + hl.L(4.0f), (f6 + l47Var.g) - hl.L(4.0f), (l47Var.d + l47Var.h) - hl.L(4.0f));
            } else {
                z2 = true;
                f = 0.0f;
            }
            if (wb2Var2 != null) {
                dc2 dc2Var = wb2Var2.ub;
                if (dc2Var.w1) {
                    canvas.save();
                    canvas.translate(wb2Var2.getX(), wb2Var2.getY());
                    wb2Var2.d1(canvas);
                    canvas.restore();
                    z3 = dc2Var.h;
                } else if (z9) {
                    z3 = super.drawChild(canvas, view, j);
                }
                if (z9) {
                    canvas.restore();
                }
                if (wb2Var2 == null && wb2Var2.l2()) {
                    canvas.save();
                    canvas.translate(wb2Var2.getX(), wb2Var2.getPaddingTopAnimated() + wb2Var2.getY());
                    wb2Var2.i1(canvas);
                    canvas.restore();
                } else if (dl1Var != null) {
                    canvas.save();
                    canvas.translate(dl1Var.getX(), dl1Var.getY());
                    dl1Var.K(canvas);
                    canvas.restore();
                }
            }
            z3 = super.drawChild(canvas, view, j);
            if (z9) {
            }
            if (wb2Var2 == null) {
            }
            if (dl1Var != null) {
            }
        }
        if (i != 0 || i2 != 0) {
            canvas.restore();
        }
        if (view.getTranslationY() != f) {
            canvas.save();
            f2 = f;
            canvas.translate(f2, view.getTranslationY());
        } else {
            f2 = f;
        }
        if (wb2Var2 != null) {
            wb2Var2.S0(canvas);
        }
        if (view.getTranslationY() != f2) {
            canvas.restore();
        }
        if (view.getTranslationY() != f2) {
            canvas.save();
            canvas.translate(f2, view.getTranslationY());
        }
        if (wb2Var2 != null) {
            r47 messageObject = wb2Var2.getMessageObject();
            j47 currentPosition2 = wb2Var2.getCurrentPosition();
            if (!z7) {
                if (currentPosition2 != null) {
                    if (!currentPosition2.h) {
                        if (currentPosition2.a == 0) {
                        }
                        if (currentPosition2 == null || wb2Var2.getTransitionParams().D0 || wb2Var2.getTransitionParams().x0) {
                            if (currentPosition2 != null || (currentPosition2.l & wb2Var2.G()) != 0) {
                                this.j3.add(wb2Var2);
                            }
                            if (currentPosition2 != null) {
                                int i6 = currentPosition2.l;
                                if ((i6 & 8) != 0) {
                                }
                            }
                            this.k3.add(wb2Var2);
                        }
                        if (zu1Var.J8 != null && ((messageObject.g4() || r47.K4(messageObject.k)) && !messageObject.S4() && MediaController.z().H(messageObject))) {
                            ImageReceiver photoImage = wb2Var2.getPhotoImage();
                            x = wb2Var2.getX() + photoImage.L0;
                            y = (zu1Var.A0.getY() + ((wb2Var2.getY() + wb2Var2.getPaddingTop()) + photoImage.M0)) - zu1Var.J8.getTop();
                            if (zu1Var.J8.getTranslationX() == x || zu1Var.J8.getTranslationY() != y) {
                                zu1Var.J8.setTranslationX(x);
                                zu1Var.J8.setTranslationY(y);
                                zu1Var.fragmentView.invalidate();
                                zu1Var.J8.invalidate();
                            }
                        }
                    }
                }
                if (currentPosition2 == null || currentPosition2.h) {
                    this.h3.add(wb2Var2);
                }
                if ((currentPosition2 == null || (currentPosition2.a == 0 && currentPosition2.c == 0)) && wb2Var2.k2()) {
                    this.i3.add(wb2Var2);
                }
                if (currentPosition2 == null) {
                }
                if (currentPosition2 != null) {
                }
                this.j3.add(wb2Var2);
                if (currentPosition2 != null) {
                }
                this.k3.add(wb2Var2);
                if (zu1Var.J8 != null) {
                    ImageReceiver photoImage2 = wb2Var2.getPhotoImage();
                    x = wb2Var2.getX() + photoImage2.L0;
                    y = (zu1Var.A0.getY() + ((wb2Var2.getY() + wb2Var2.getPaddingTop()) + photoImage2.M0)) - zu1Var.J8.getTop();
                    if (zu1Var.J8.getTranslationX() == x) {
                    }
                    zu1Var.J8.setTranslationX(x);
                    zu1Var.J8.setTranslationY(y);
                    zu1Var.fragmentView.invalidate();
                    zu1Var.J8.invalidate();
                }
            }
        }
        if (wb2Var != null) {
            r47 messageObject2 = wb2Var.getMessageObject();
            j47 currentPosition3 = wb2Var.getCurrentPosition();
            ImageReceiver avatarImage = wb2Var.getAvatarImage();
            if (avatarImage != null && zu1Var.n7() < 1.0f) {
                m47 v7 = zu1Var.v7(messageObject2);
                if (!wb2Var.getMessageObject().Z) {
                    zu1Var.A0.getClass();
                    if (RecyclerView.S(view) != -1) {
                        z5 = z2;
                        z6 = (!zu1Var.A0.W1 || (v7 != null && v7.m.j)) ? z2 : false;
                        paddingTop = view.getPaddingTop() + (!z6 ? view.getTop() : (int) view.getY());
                        if (wb2Var.n()) {
                            if (wb2Var.La) {
                                b2 = ((SparseArray) zu1Var.o9.s).indexOfValue(view);
                                if (b2 >= 0) {
                                    b2 = ((SparseArray) zu1Var.o9.s).keyAt(b2);
                                }
                            } else {
                                b2 = zu1Var.A0.U(view).b();
                            }
                            if (b2 >= 0) {
                                if (v7 != null) {
                                    ArrayList arrayList = v7.e;
                                    if (currentPosition3 != null) {
                                        int indexOf = arrayList.indexOf(currentPosition3);
                                        f4 = 1.0f;
                                        int size = arrayList.size();
                                        z4 = z3;
                                        if ((currentPosition3.l & 8) == 0) {
                                            i3 = b2 - 1;
                                            int i7 = indexOf + 1;
                                            while (i7 < size) {
                                                wb2Var3 = wb2Var2;
                                                if (((j47) arrayList.get(i7)).c > currentPosition3.d) {
                                                    break;
                                                }
                                                i3--;
                                                i7++;
                                                wb2Var2 = wb2Var3;
                                            }
                                        } else {
                                            i3 = (b2 - size) + indexOf;
                                        }
                                        wb2Var3 = wb2Var2;
                                        if (wb2Var.La) {
                                            if (zu1Var.A0.L(i3) != null) {
                                                if (view.getTranslationY() != 0.0f) {
                                                    canvas.restore();
                                                }
                                                avatarImage.v0(false, false);
                                                return z4;
                                            }
                                        } else if (((View) ((SparseArray) zu1Var.o9.s).get(i3)) != null) {
                                            if (view.getTranslationY() != 0.0f) {
                                                canvas.restore();
                                            }
                                            avatarImage.v0(false, false);
                                            return z4;
                                        }
                                        checkBoxTranslation = wb2Var.getCheckBoxTranslation() + wb2Var.getSlidingOffsetX();
                                        layoutHeight = (int) (wb2Var3.getLayoutHeight() + wb2Var3.getTransitionParams().j0 + ((int) (wb2Var.getPaddingTopAnimated() + ((int) (0.0f + (!z6 ? view.getTop() : view.getY()))))));
                                        int measuredHeight = zu1Var.A0.getMeasuredHeight() - zu1Var.A0.getPaddingBottom();
                                        boolean z10 = ((!wb2Var.n1 || wb2Var.o1) && checkBoxTranslation == 0.0f) ? z2 : false;
                                        if (!wb2Var.M2() || wb2Var.getTransitionParams().l2) {
                                            if (wb2Var.getTransitionParams().l2) {
                                                float f7 = wb2Var.getTransitionParams().L1;
                                                if (!wb2Var.M2()) {
                                                    f7 = f4 - f7;
                                                }
                                                layoutHeight = (int) qd4.A(f4, f7, Math.min(layoutHeight, measuredHeight), layoutHeight * f7);
                                            }
                                        } else if (layoutHeight > measuredHeight) {
                                            layoutHeight = measuredHeight;
                                        }
                                        if (!z6 && view.getTranslationY() != 0.0f) {
                                            canvas.restore();
                                        }
                                        if (wb2Var.j()) {
                                            if (wb2Var.La) {
                                                b = ((SparseArray) zu1Var.o9.s).indexOfValue(view);
                                                if (b >= 0) {
                                                    b = ((SparseArray) zu1Var.o9.s).keyAt(b);
                                                }
                                            } else {
                                                b = zu1Var.A0.U(view).b();
                                            }
                                            if (b >= 0) {
                                                int i8 = paddingTop;
                                                int i9 = b;
                                                wb2 wb2Var5 = wb2Var;
                                                float f8 = checkBoxTranslation;
                                                int i10 = 0;
                                                while (i10 < 20) {
                                                    i10++;
                                                    if (v7 != null) {
                                                        ArrayList arrayList2 = v7.e;
                                                        if (currentPosition3 != null) {
                                                            int indexOf2 = arrayList2.indexOf(currentPosition3);
                                                            if (indexOf2 < 0) {
                                                                break;
                                                            }
                                                            arrayList2.size();
                                                            m47Var2 = v7;
                                                            if ((currentPosition3.l & 4) == 0) {
                                                                i9++;
                                                                int i11 = indexOf2 - 1;
                                                                while (i11 >= 0) {
                                                                    int i12 = i11;
                                                                    if (((j47) arrayList2.get(i11)).d < currentPosition3.c) {
                                                                        break;
                                                                    }
                                                                    i9++;
                                                                    i11 = i12 - 1;
                                                                }
                                                            } else {
                                                                i9 = i9 + indexOf2 + 1;
                                                            }
                                                            if (!wb2Var5.m()) {
                                                                ?? r02 = (View) ((SparseArray) zu1Var.o9.s).get(i9);
                                                                if (r02 == 0) {
                                                                    break;
                                                                }
                                                                top = r02.getTop() + r02.getPaddingTop();
                                                                if (!(r02 instanceof pk5)) {
                                                                    paddingTop = top;
                                                                    checkBoxTranslation = f8;
                                                                    wb2Var = wb2Var5;
                                                                    break;
                                                                }
                                                                r0 = (pk5) r02;
                                                                checkBoxTranslation2 = r0.getCheckBoxTranslation() + r0.getSlidingOffsetX();
                                                                if (!z10 || checkBoxTranslation2 <= 0.0f) {
                                                                    checkBoxTranslation2 = f8;
                                                                }
                                                                if (!r0.j()) {
                                                                    wb2Var = r0;
                                                                    paddingTop = top;
                                                                    checkBoxTranslation = checkBoxTranslation2;
                                                                    break;
                                                                }
                                                                wb2Var5 = r0;
                                                                f8 = checkBoxTranslation2;
                                                                i8 = top;
                                                                v7 = m47Var2;
                                                            } else {
                                                                f89 L = zu1Var.A0.L(i9);
                                                                if (L == null) {
                                                                    break;
                                                                }
                                                                ?? r03 = L.a;
                                                                top = r03.getTop() + r03.getPaddingTop();
                                                                if (!(r03 instanceof wb2)) {
                                                                    paddingTop = top;
                                                                    checkBoxTranslation = f8;
                                                                    wb2Var = wb2Var5;
                                                                    break;
                                                                }
                                                                r0 = (pk5) r03;
                                                                checkBoxTranslation2 = r0.getCheckBoxTranslation() + r0.getSlidingOffsetX();
                                                                if (!z10 || checkBoxTranslation2 <= 0.0f) {
                                                                    checkBoxTranslation2 = f8;
                                                                }
                                                                if (!r0.j()) {
                                                                    wb2Var = r0;
                                                                    paddingTop = top;
                                                                    checkBoxTranslation = checkBoxTranslation2;
                                                                    break;
                                                                }
                                                                wb2Var5 = r0;
                                                                f8 = checkBoxTranslation2;
                                                                i8 = top;
                                                                v7 = m47Var2;
                                                            }
                                                        }
                                                    }
                                                    m47Var2 = v7;
                                                    i9++;
                                                    if (!wb2Var5.m()) {
                                                    }
                                                }
                                                checkBoxTranslation = f8;
                                                wb2Var = wb2Var5;
                                                paddingTop = i8;
                                            }
                                        }
                                        if (layoutHeight - hl.L(48.0f) < paddingTop) {
                                            layoutHeight = hl.L(48.0f) + paddingTop;
                                        }
                                        if (!wb2Var.n()) {
                                            int bottom = z6 ? view.getBottom() : (int) (wb2Var.getDeltaBottom() + wb2Var.getY() + wb2Var.getMeasuredHeight());
                                            if (layoutHeight > bottom) {
                                                layoutHeight = bottom;
                                            }
                                        }
                                        canvas.save();
                                        if (checkBoxTranslation != 0.0f) {
                                            canvas.translate(checkBoxTranslation, 0.0f);
                                        }
                                        if (wb2Var instanceof wb2) {
                                            wb2 wb2Var6 = wb2Var;
                                            if (wb2Var6.getCurrentMessagesGroup() != null && wb2Var6.getCurrentMessagesGroup().m.j) {
                                                layoutHeight = (int) (layoutHeight - wb2Var6.getTranslationY());
                                            }
                                        }
                                        if (z5) {
                                            avatarImage.M0 = layoutHeight - hl.L(44.0f);
                                        }
                                        if (wb2Var.a()) {
                                            f5 = 1.0f;
                                            avatarImage.setAlpha(1.0f - zu1Var.n7());
                                        } else {
                                            avatarImage.setAlpha(wb2Var.getAlpha() * (1.0f - zu1Var.n7()));
                                            canvas.scale(wb2Var.getScaleX(), wb2Var.getScaleY(), wb2Var.getPivotX() + wb2Var.getX(), wb2Var.getY() + (wb2Var.getHeight() >> 1));
                                            f5 = 1.0f;
                                        }
                                        if (z5) {
                                            avatarImage.v0(z2, false);
                                        }
                                        if (zu1Var.n7() <= 0.0f) {
                                            canvas.scale(f5 - zu1Var.n7(), f5 - zu1Var.n7(), avatarImage.w(), avatarImage.x());
                                            f3 = 0.0f;
                                            canvas.translate(zu1Var.n7() * hl.L(24.0f), 0.0f);
                                        } else {
                                            f3 = 0.0f;
                                        }
                                        avatarImage.h(canvas, null);
                                        canvas.restore();
                                        if (!z6 && view.getTranslationY() != f3) {
                                            canvas.save();
                                        }
                                        if (view.getTranslationY() != f3) {
                                            canvas.restore();
                                        }
                                        return z4;
                                    }
                                }
                                z4 = z3;
                                wb2Var3 = wb2Var2;
                                f4 = 1.0f;
                                i3 = b2 - 1;
                                if (wb2Var.La) {
                                }
                                checkBoxTranslation = wb2Var.getCheckBoxTranslation() + wb2Var.getSlidingOffsetX();
                                layoutHeight = (int) (wb2Var3.getLayoutHeight() + wb2Var3.getTransitionParams().j0 + ((int) (wb2Var.getPaddingTopAnimated() + ((int) (0.0f + (!z6 ? view.getTop() : view.getY()))))));
                                int measuredHeight2 = zu1Var.A0.getMeasuredHeight() - zu1Var.A0.getPaddingBottom();
                                if (wb2Var.n1) {
                                }
                                if (wb2Var.M2()) {
                                }
                                if (wb2Var.getTransitionParams().l2) {
                                }
                                if (!z6) {
                                    canvas.restore();
                                }
                                if (wb2Var.j()) {
                                }
                                if (layoutHeight - hl.L(48.0f) < paddingTop) {
                                }
                                if (!wb2Var.n()) {
                                }
                                canvas.save();
                                if (checkBoxTranslation != 0.0f) {
                                }
                                if (wb2Var instanceof wb2) {
                                }
                                if (z5) {
                                }
                                if (wb2Var.a()) {
                                }
                                if (z5) {
                                }
                                if (zu1Var.n7() <= 0.0f) {
                                }
                                avatarImage.h(canvas, null);
                                canvas.restore();
                                if (!z6) {
                                    canvas.save();
                                }
                                if (view.getTranslationY() != f3) {
                                }
                                return z4;
                            }
                        }
                        z4 = z3;
                        wb2Var3 = wb2Var2;
                        f4 = 1.0f;
                        checkBoxTranslation = wb2Var.getCheckBoxTranslation() + wb2Var.getSlidingOffsetX();
                        layoutHeight = (int) (wb2Var3.getLayoutHeight() + wb2Var3.getTransitionParams().j0 + ((int) (wb2Var.getPaddingTopAnimated() + ((int) (0.0f + (!z6 ? view.getTop() : view.getY()))))));
                        int measuredHeight22 = zu1Var.A0.getMeasuredHeight() - zu1Var.A0.getPaddingBottom();
                        if (wb2Var.n1) {
                        }
                        if (wb2Var.M2()) {
                        }
                        if (wb2Var.getTransitionParams().l2) {
                        }
                        if (!z6) {
                        }
                        if (wb2Var.j()) {
                        }
                        if (layoutHeight - hl.L(48.0f) < paddingTop) {
                        }
                        if (!wb2Var.n()) {
                        }
                        canvas.save();
                        if (checkBoxTranslation != 0.0f) {
                        }
                        if (wb2Var instanceof wb2) {
                        }
                        if (z5) {
                        }
                        if (wb2Var.a()) {
                        }
                        if (z5) {
                        }
                        if (zu1Var.n7() <= 0.0f) {
                        }
                        avatarImage.h(canvas, null);
                        canvas.restore();
                        if (!z6) {
                        }
                        if (view.getTranslationY() != f3) {
                        }
                        return z4;
                    }
                }
                z5 = false;
                if (zu1Var.A0.W1) {
                }
                paddingTop = view.getPaddingTop() + (!z6 ? view.getTop() : (int) view.getY());
                if (wb2Var.n()) {
                }
                z4 = z3;
                wb2Var3 = wb2Var2;
                f4 = 1.0f;
                checkBoxTranslation = wb2Var.getCheckBoxTranslation() + wb2Var.getSlidingOffsetX();
                layoutHeight = (int) (wb2Var3.getLayoutHeight() + wb2Var3.getTransitionParams().j0 + ((int) (wb2Var.getPaddingTopAnimated() + ((int) (0.0f + (!z6 ? view.getTop() : view.getY()))))));
                int measuredHeight222 = zu1Var.A0.getMeasuredHeight() - zu1Var.A0.getPaddingBottom();
                if (wb2Var.n1) {
                }
                if (wb2Var.M2()) {
                }
                if (wb2Var.getTransitionParams().l2) {
                }
                if (!z6) {
                }
                if (wb2Var.j()) {
                }
                if (layoutHeight - hl.L(48.0f) < paddingTop) {
                }
                if (!wb2Var.n()) {
                }
                canvas.save();
                if (checkBoxTranslation != 0.0f) {
                }
                if (wb2Var instanceof wb2) {
                }
                if (z5) {
                }
                if (wb2Var.a()) {
                }
                if (z5) {
                }
                if (zu1Var.n7() <= 0.0f) {
                }
                avatarImage.h(canvas, null);
                canvas.restore();
                if (!z6) {
                }
                if (view.getTranslationY() != f3) {
                }
                return z4;
            }
        }
        z4 = z3;
        f3 = 0.0f;
        if (view.getTranslationY() != f3) {
        }
        return z4;
    }

    @Override // d79
    public final void l1(View view, float f, float f2, boolean z) {
        m47 currentMessagesGroup;
        super.l1(view, f, f2, z);
        if (view instanceof wb2) {
            wb2 wb2Var = (wb2) view;
            r47 messageObject = wb2Var.getMessageObject();
            if (messageObject.I3() || messageObject.U2() || (currentMessagesGroup = wb2Var.getCurrentMessagesGroup()) == null) {
                return;
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt != view && (childAt instanceof wb2)) {
                    wb2 wb2Var2 = (wb2) childAt;
                    if (wb2Var2.getCurrentMessagesGroup() == currentMessagesGroup) {
                        wb2Var2.setPressed(z);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:193:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x080a  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x08ad  */
    /* JADX WARN: Removed duplicated region for block: B:226:? A[RETURN, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f;
        float f2;
        int i;
        ad2 ad2Var;
        int i2;
        float f3;
        int i3;
        String M0;
        String M02;
        String M03;
        int i4;
        TLRPC.TL_forumTopic tL_forumTopic;
        int i5;
        wq1 wq1Var;
        Paint paint;
        Paint paint2;
        float f4;
        float f5;
        float f6;
        xk4 xk4Var;
        float f7;
        float f8;
        Paint paint3;
        float f9;
        Paint paint4;
        Paint paint5;
        float f10;
        float f11;
        Paint paint6;
        vnb vnbVar;
        float f12;
        xk4 xk4Var2;
        float f13;
        int i6;
        Paint paint7;
        super.onDraw(canvas);
        zu1 zu1Var = this.G3;
        View view = zu1Var.v9;
        if (view != null) {
            float slidingOffsetX = view instanceof wb2 ? ((wb2) view).getSlidingOffsetX() : view instanceof dl1 ? ((dl1) view).getWalletSlidingOffset() : 0.0f;
            if (!zu1Var.w9 && !zu1Var.C9 && this.r3 != 0.0f && slidingOffsetX != 0.0f) {
                long currentTimeMillis = System.currentTimeMillis();
                float f14 = ((currentTimeMillis - this.p3) / 180.0f) + this.q3;
                this.q3 = f14;
                if (f14 > 1.0f) {
                    this.q3 = 1.0f;
                    f14 = 1.0f;
                }
                this.p3 = currentTimeMillis;
                float interpolation = (1.0f - hl.F.getInterpolation(f14)) * this.r3;
                if (interpolation == 0.0f) {
                    this.r3 = 0.0f;
                }
                View view2 = zu1Var.v9;
                if (view2 instanceof wb2) {
                    E1((wb2) view2, interpolation);
                }
                zu1Var.Bc(interpolation);
                r47 q7 = zu1Var.q7();
                if (q7 != null && (q7.g4() || r47.K4(q7.k))) {
                    zu1Var.vd(false, false);
                }
                float f15 = this.q3;
                if (f15 == 1.0f || f15 == 0.0f) {
                    zu1Var.Bc(0.0f);
                    zu1Var.v9 = null;
                }
                invalidate();
            }
            if (zu1Var.v9 != null && Thread.currentThread() == Looper.getMainLooper().getThread()) {
                Paint Y0 = Y0("paintChatActionBackground");
                Paint paint8 = aob.h2;
                Paint paint9 = this.u3;
                if (paint9.getColor() != Y0.getColor()) {
                    paint9.setColor(Y0.getColor());
                }
                Paint paint10 = this.v3;
                if (paint10.getColor() != paint8.getColor()) {
                    paint10.setColor(paint8.getColor());
                }
                if (paint9.getShader() != Y0.getShader()) {
                    paint9.setShader(Y0.getShader());
                }
                if (paint10.getShader() != paint8.getShader()) {
                    paint10.setShader(paint8.getShader());
                }
                xk4 xk4Var3 = this.y3;
                float f16 = xk4Var3.a;
                f = 255.0f;
                float f17 = this.t3;
                float f18 = f16 / f17;
                f2 = 2.0f;
                int color = paint10.getColor();
                if (f18 > 1.0f) {
                    this.C3 = true;
                }
                View view3 = zu1Var.v9;
                i = 2;
                float U1 = view3 instanceof wb2 ? ((wb2) view3).U1(false) : view3 instanceof dl1 ? ((dl1) view3).getWalletSlidingOffset() : 0.0f;
                xk4 xk4Var4 = this.w3;
                float f19 = xk4Var4.a;
                xk4 xk4Var5 = this.A3;
                vpa vpaVar = this.B3;
                vpa vpaVar2 = this.z3;
                if (f19 == 0.0f) {
                    vpaVar2.d();
                    paint = Y0;
                    paint2 = paint8;
                    vpaVar2.m.i = 0.0d;
                    xk4Var3.a = 0.0f;
                    vpaVar.d();
                    vpaVar.m.i = 0.0d;
                    xk4Var5.a = 0.0f;
                    this.C3 = false;
                } else {
                    paint = Y0;
                    paint2 = paint8;
                }
                if (((float) vpaVar2.m.i) != f17) {
                    f4 = 1.0f;
                    f5 = ete.a(((-U1) - hl.L(20.0f)) / hl.L(30.0f), 0.0f, 1.0f);
                } else {
                    f4 = 1.0f;
                    f5 = 1.0f;
                }
                if (f5 == f4) {
                    wpa wpaVar = vpaVar2.m;
                    f6 = 20.0f;
                    xk4Var = xk4Var5;
                    if (((float) wpaVar.i) != f17) {
                        double d = f17;
                        wpaVar.i = d;
                        vpaVar2.h();
                        vpaVar.m.i = d;
                        vpaVar.h();
                    }
                } else {
                    f6 = 20.0f;
                    xk4Var = xk4Var5;
                }
                float f20 = U1 <= ((float) (-hl.L(f6))) ? f17 : 0.0f;
                vpa vpaVar3 = this.x3;
                wpa wpaVar2 = vpaVar3.m;
                if (f20 != ((float) wpaVar2.i)) {
                    wpaVar2.i = f20;
                    if (!vpaVar3.f) {
                        vpaVar3.h();
                    }
                }
                float f21 = xk4Var4.a / f17;
                r47 q72 = zu1Var.q7();
                float measuredWidth = (U1 * ((q72 == null || !q72.N3()) ? 1.0f : 0.5f)) + getMeasuredWidth();
                float measuredHeight = (zu1Var.v9.getMeasuredHeight() / 2.0f) + zu1Var.v9.getTop();
                if (this.C3) {
                    f8 = f18;
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f - f18;
                    f8 = f21;
                }
                int i7 = aob.d6;
                vnb vnbVar2 = this.o2;
                boolean z = vm2.h(aob.v0(i7, vnbVar2)) <= 0.5d;
                if (f21 != 0.0f) {
                    RectF rectF = hl.P;
                    xk4 xk4Var6 = xk4Var;
                    rectF.set((int) ((paint9.getStrokeWidth() / 2.0f) + (measuredWidth - (hl.L(16.0f) * f8))), (int) ((paint9.getStrokeWidth() / 2.0f) + (measuredHeight - (hl.L(16.0f) * f8))), (int) (((hl.L(16.0f) * f8) + measuredWidth) - (paint9.getStrokeWidth() / 2.0f)), (int) (((hl.L(16.0f) * f8) + measuredHeight) - (paint9.getStrokeWidth() / 2.0f)));
                    aob.q(0.0f, getY() + rectF.top, getMeasuredWidth(), hl.q.y);
                    if (f18 == 0.0f) {
                        int alpha = paint9.getAlpha();
                        paint9.setAlpha((int) (alpha * f21));
                        float f22 = f5 * 360.0f;
                        f9 = f21;
                        paint5 = paint;
                        f11 = f17;
                        vnbVar = vnbVar2;
                        f10 = measuredWidth;
                        paint6 = paint2;
                        f12 = f5;
                        xk4Var2 = xk4Var6;
                        canvas.drawArc(rectF, -90.0f, f22, false, paint9);
                        paint9.setAlpha(alpha);
                        if (zu1Var.Ba.g()) {
                            int alpha2 = paint10.getAlpha();
                            paint4 = paint10;
                            if (z) {
                                paint4.setColor(-1);
                            }
                            paint4.setAlpha((int) (alpha2 * f9));
                            paint3 = paint9;
                            canvas2 = canvas;
                            canvas2.drawArc(rectF, -90.0f, f22, false, paint4);
                        } else {
                            paint3 = paint9;
                            paint4 = paint10;
                            canvas2 = canvas;
                        }
                    } else {
                        canvas2 = canvas;
                        paint3 = paint9;
                        f9 = f21;
                        paint4 = paint10;
                        paint5 = paint;
                        f10 = measuredWidth;
                        f11 = f17;
                        paint6 = paint2;
                        vnbVar = vnbVar2;
                        f12 = f5;
                        xk4Var2 = xk4Var6;
                    }
                } else {
                    canvas2 = canvas;
                    paint3 = paint9;
                    f9 = f21;
                    paint4 = paint10;
                    paint5 = paint;
                    f10 = measuredWidth;
                    f11 = f17;
                    paint6 = paint2;
                    vnbVar = vnbVar2;
                    f12 = f5;
                    xk4Var2 = xk4Var;
                }
                RectF rectF2 = hl.P;
                rectF2.set((int) (f10 - (hl.L(16.0f) * f8)), (int) (measuredHeight - (hl.L(16.0f) * f8)), (int) ((hl.L(16.0f) * f8) + f10), (int) ((hl.L(16.0f) * f8) + measuredHeight));
                int measuredWidth2 = getMeasuredWidth();
                Point point = hl.q;
                aob.q(0.0f, getY() + rectF2.top, measuredWidth2, point.y);
                Path path = this.D3;
                path.rewind();
                Path.Direction direction = Path.Direction.CW;
                path.addRoundRect(rectF2, hl.L(16.0f) * f8, hl.L(16.0f) * f8, direction);
                int alpha3 = paint5.getAlpha();
                float f23 = 0.6f * f9 * f12;
                int i8 = (int) (alpha3 * f23);
                Paint paint11 = paint5;
                paint11.setAlpha(i8);
                canvas2.drawPath(path, paint11);
                paint11.setAlpha(alpha3);
                if (zu1Var.Ba.g()) {
                    int alpha4 = aob.h2.getAlpha();
                    if (z) {
                        f13 = f7;
                        aob.h2.setColor(-1);
                    } else {
                        f13 = f7;
                    }
                    aob.h2.setAlpha((int) (alpha4 * f23));
                    canvas2.drawPath(path, aob.h2);
                    aob.h2.setAlpha(alpha4);
                } else {
                    f13 = f7;
                }
                int i9 = (f13 > 0.0f ? 1 : (f13 == 0.0f ? 0 : -1));
                if (i9 != 0) {
                    i6 = i9;
                    paint7 = paint6;
                    rectF2.set((int) (f10 - (hl.L(16.0f) * f13)), (int) (measuredHeight - (hl.L(16.0f) * f13)), (int) ((hl.L(16.0f) * f13) + f10), (int) ((hl.L(16.0f) * f13) + measuredHeight));
                    path.rewind();
                    path.addRoundRect(rectF2, hl.L(16.0f), hl.L(16.0f), direction);
                    canvas2.save();
                    canvas2.clipPath(path, Region.Op.DIFFERENCE);
                } else {
                    i6 = i9;
                    paint7 = paint6;
                }
                rectF2.set((int) (f10 - (hl.L(16.0f) * f8)), (int) (measuredHeight - (hl.L(16.0f) * f8)), (int) ((hl.L(16.0f) * f8) + f10), (int) ((hl.L(16.0f) * f8) + measuredHeight));
                aob.q(0.0f, getY() + rectF2.top, getMeasuredWidth(), point.y);
                path.rewind();
                path.addRoundRect(rectF2, hl.L(16.0f) * f8, hl.L(16.0f) * f8, direction);
                int alpha5 = paint11.getAlpha();
                float f24 = 0.4f * f9;
                paint11.setAlpha((int) (alpha5 * f24));
                canvas2.drawPath(path, paint11);
                paint11.setAlpha(alpha5);
                if (zu1Var.Ba.g()) {
                    int alpha6 = aob.h2.getAlpha();
                    if (z) {
                        aob.h2.setColor(-1);
                    }
                    aob.h2.setAlpha((int) (f24 * alpha6));
                    canvas2.drawPath(path, aob.h2);
                    aob.h2.setAlpha(alpha6);
                }
                if (i6 != 0) {
                    canvas2.restore();
                }
                float f25 = xk4Var2.a / f11;
                if (f25 != 0.0f && f25 != 1.0f) {
                    float f26 = f25 + 1.0f;
                    float strokeWidth = paint3.getStrokeWidth();
                    float f27 = (1.0f - f25) * strokeWidth;
                    if (f27 != 0.0f) {
                        rectF2.set((int) ((f10 - (hl.L(16.0f) * f26)) + f27), (int) ((measuredHeight - (hl.L(16.0f) * f26)) + f27), (int) (((hl.L(16.0f) * f26) + f10) - f27), (int) (((hl.L(16.0f) * f26) + measuredHeight) - f27));
                        aob.q(0.0f, getY() + rectF2.top, getMeasuredWidth(), point.y);
                        int alpha7 = paint3.getAlpha();
                        paint3.setAlpha((int) (alpha7 * f9));
                        paint3.setStrokeWidth(f27);
                        canvas2.drawRoundRect(rectF2, hl.L(16.0f) * f26, hl.L(16.0f) * f26, paint3);
                        paint3.setStrokeWidth(strokeWidth);
                        paint3.setAlpha(alpha7);
                        if (zu1Var.Ba.g()) {
                            int alpha8 = paint4.getAlpha();
                            if (z) {
                                paint4.setColor(-1);
                            }
                            paint4.setAlpha((int) (alpha8 * f9));
                            paint4.setStrokeWidth(f27);
                            canvas2.drawRoundRect(rectF2, hl.L(16.0f) * f26, hl.L(16.0f) * f26, paint4);
                            paint4.setStrokeWidth(strokeWidth);
                        }
                    }
                }
                int i10 = (int) (f9 * 255.0f);
                Drawable drawable = vnbVar != null ? vnbVar.getDrawable("drawableReplyIcon") : null;
                if (drawable == null) {
                    drawable = aob.P0("drawableReplyIcon");
                }
                drawable.setAlpha(i10);
                drawable.setBounds((int) (f10 - ((drawable.getIntrinsicWidth() / 2) * f8)), (int) (measuredHeight - ((drawable.getIntrinsicHeight() / 2) * f8)), (int) (((drawable.getIntrinsicWidth() / 2) * f8) + f10), (int) (((drawable.getIntrinsicHeight() / 2) * f8) + measuredHeight));
                drawable.draw(canvas2);
                drawable.setAlpha(jn7.d4);
                paint4.setColor(color);
                paint7.setColor(color);
                if (zu1Var.ka != 0.0f || zu1Var.isInPreviewMode() || zu1Var.mb || (i2 = zu1Var.g4) == 3 || i2 == 1) {
                    ad2Var = zu1Var.ma;
                    if (ad2Var == null) {
                        ad2Var.P = 0.0f;
                        ad2Var.O = false;
                        return;
                    }
                    return;
                }
                canvas2.save();
                if (zu1Var.ra != 0.0f) {
                    float measuredHeight2 = zu1Var.A0.getMeasuredHeight() - zu1Var.ka;
                    zu1 zu1Var2 = zu1Var.qa;
                    f3 = (measuredHeight2 + (zu1Var2 == null ? 0.0f : zu1Var2.la)) * zu1Var.ra;
                } else {
                    f3 = 0.0f;
                }
                canvas2.translate(0.0f, (getMeasuredHeight() - zu1Var.Ya) - f3);
                if (zu1Var.ma == null) {
                    i5 = ((e) zu1Var).currentAccount;
                    ad2 ad2Var2 = new ad2(i5, zu1Var.fragmentView, zu1Var.l6, zu1Var.Ra, zu1Var.Sa, zu1Var.c(), zu1Var.Ba);
                    zu1Var.ma = ad2Var2;
                    ad2Var2.T = zu1Var.qd.e;
                    ArrayList arrayList = zu1Var.Qb;
                    if (arrayList == null || arrayList.isEmpty()) {
                        boolean z2 = zu1Var.x4;
                        ad2 ad2Var3 = zu1Var.ma;
                        if (z2) {
                            ad2Var3.h();
                        } else {
                            ad2Var3.f();
                        }
                    } else {
                        zu1Var.ma.g((TLRPC.Chat) zu1Var.Qb.get(0));
                    }
                    ad2 ad2Var4 = zu1Var.ma;
                    ad2Var4.G.I();
                    wl wlVar = ad2Var4.l0;
                    if (wlVar != null && (wq1Var = ad2Var4.b0) != null) {
                        wlVar.b(wq1Var);
                    }
                    jn7.f(ad2Var4.f0).b(ad2Var4, i);
                }
                ad2 ad2Var5 = zu1Var.ma;
                int measuredWidth3 = getMeasuredWidth() - (zu1Var.f8() ? hl.L(71.0f) : 0);
                ImageReceiver imageReceiver = ad2Var5.G;
                TextPaint textPaint = ad2Var5.f;
                TextPaint textPaint2 = ad2Var5.h;
                boolean z3 = ad2Var5.Y;
                if (measuredWidth3 != ad2Var5.c || (z3 && (tL_forumTopic = ad2Var5.I) != null && ad2Var5.J != tL_forumTopic.id)) {
                    ad2Var5.d = hl.L(56.0f) / f2;
                    ad2Var5.c = measuredWidth3;
                    TLRPC.Chat chat = ad2Var5.H;
                    if (chat != null) {
                        M0 = chat.title;
                    } else {
                        TLRPC.TL_forumTopic tL_forumTopic2 = ad2Var5.I;
                        if (tL_forumTopic2 != null) {
                            M0 = tL_forumTopic2.title;
                        } else {
                            if (z3) {
                                i3 = 0;
                                M0 = ob6.a0(null, null, 2131743961, uc7.s1(ad2Var5.f0).M0(Long.valueOf(-ad2Var5.j0)).title);
                            } else {
                                i3 = 0;
                                M0 = ob6.M0(2131743964, null);
                            }
                            int measureText = (int) textPaint.measureText((CharSequence) M0, i3, M0.length());
                            ad2Var5.y = measureText;
                            int y = c00.y(60.0f, ad2Var5.c, measureText);
                            ad2Var5.y = y;
                            ad2Var5.s = o0b.c(M0, textPaint, y, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, y, 1, true);
                            if (!ad2Var5.W) {
                                M02 = ob6.M0(2131743962, null);
                                M03 = ob6.M0(2131746054, null);
                            } else if (z3) {
                                M02 = ob6.M0(2131743960, null);
                                M03 = ob6.M0(2131746053, null);
                            } else {
                                boolean z4 = ad2Var5.X;
                                if (z4 && (i4 = ad2Var5.a) != ad2Var5.g0 && i4 != 0) {
                                    M02 = ob6.M0(2131743966, null);
                                    M03 = ob6.M0(2131746057, null);
                                } else if (z4) {
                                    M02 = ob6.M0(2131743963, null);
                                    M03 = ob6.M0(2131746055, null);
                                } else {
                                    M02 = ob6.M0(2131743965, null);
                                    M03 = ob6.M0(2131746056, null);
                                }
                            }
                            int measureText2 = (int) textPaint2.measureText(M02);
                            ad2Var5.E = measureText2;
                            ad2Var5.E = c00.y(60.0f, ad2Var5.c, measureText2);
                            int i11 = ad2Var5.E;
                            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                            ad2Var5.w = new StaticLayout(M02, textPaint2, i11, alignment, 1.0f, 0.0f, false);
                            int measureText3 = (int) textPaint2.measureText(M03);
                            ad2Var5.F = measureText3;
                            ad2Var5.F = c00.y(60.0f, ad2Var5.c, measureText3);
                            ad2Var5.x = new StaticLayout(M03, textPaint2, ad2Var5.F, alignment, 1.0f, 0.0f, false);
                            imageReceiver.i0((ad2Var5.c / f2) - (hl.L(40.0f) / f2), (hl.L(12.0f) + ad2Var5.d) - (hl.L(40.0f) / f2), hl.L(40.0f), hl.L(40.0f));
                            imageReceiver.q0((int) (hl.L(40.0f) / f2));
                            ad2Var5.d0.d(hl.L(28.0f), hl.L(100.0f));
                            if (z3) {
                                ad2Var5.J = ad2Var5.I == null ? 0L : r3.id;
                            }
                        }
                    }
                    i3 = 0;
                    int measureText4 = (int) textPaint.measureText((CharSequence) M0, i3, M0.length());
                    ad2Var5.y = measureText4;
                    int y2 = c00.y(60.0f, ad2Var5.c, measureText4);
                    ad2Var5.y = y2;
                    ad2Var5.s = o0b.c(M0, textPaint, y2, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, y2, 1, true);
                    if (!ad2Var5.W) {
                    }
                    int measureText22 = (int) textPaint2.measureText(M02);
                    ad2Var5.E = measureText22;
                    ad2Var5.E = c00.y(60.0f, ad2Var5.c, measureText22);
                    int i112 = ad2Var5.E;
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                    ad2Var5.w = new StaticLayout(M02, textPaint2, i112, alignment2, 1.0f, 0.0f, false);
                    int measureText32 = (int) textPaint2.measureText(M03);
                    ad2Var5.F = measureText32;
                    ad2Var5.F = c00.y(60.0f, ad2Var5.c, measureText32);
                    ad2Var5.x = new StaticLayout(M03, textPaint2, ad2Var5.F, alignment2, 1.0f, 0.0f, false);
                    imageReceiver.i0((ad2Var5.c / f2) - (hl.L(40.0f) / f2), (hl.L(12.0f) + ad2Var5.d) - (hl.L(40.0f) / f2), hl.L(40.0f), hl.L(40.0f));
                    imageReceiver.q0((int) (hl.L(40.0f) / f2));
                    ad2Var5.d0.d(hl.L(28.0f), hl.L(100.0f));
                    if (z3) {
                    }
                }
                float min = Math.min(1.0f, zu1Var.ka / hl.L(110.0f));
                canvas2.translate(zu1Var.f8() ? hl.U1(zu1Var.n7(), hl.L(32.0f), hl.L(71.0f)) : 0.0f, -(zu1Var.u7(h1c.c) + zu1Var.U.getInputBubbleHeight() + zu1Var.w.d() + hl.L(10.0f)));
                zu1Var.ma.a(canvas2, zu1Var.A0, min, 1.0f - zu1Var.ra);
                canvas2.restore();
                if (zu1Var.qa != null) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, r2.A0.getMeasuredWidth(), zu1Var.qa.A0.getMeasuredHeight(), (int) (zu1Var.ra * f), 31);
                    canvas2.translate(0.0f, (getMeasuredHeight() - zu1Var.ka) - f3);
                    zu1Var.qa.A0.draw(canvas2);
                    canvas2.restore();
                    return;
                }
                return;
            }
        }
        canvas2 = canvas;
        f = 255.0f;
        f2 = 2.0f;
        i = 2;
        if (zu1Var.ka != 0.0f) {
        }
        ad2Var = zu1Var.ma;
        if (ad2Var == null) {
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (this.G3.h == null) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            AccessibilityNodeInfo.CollectionInfo collectionInfo = accessibilityNodeInfo.getCollectionInfo();
            if (collectionInfo != null) {
                accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(collectionInfo.getRowCount(), 1, false));
            }
        }
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        j19 j19Var;
        a aVar;
        zu1 zu1Var = this.G3;
        ot1 ot1Var = zu1Var.u9;
        ot1Var.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            hl.r(ot1Var.f0);
            ot1Var.z = false;
        }
        if (!this.W1 && ((j19Var = zu1Var.ua) == null || !j19Var.a())) {
            boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            aVar = ((e) zu1Var).actionBar;
            if (aVar.z() || zu1Var.c8()) {
                return onInterceptTouchEvent;
            }
            D1(motionEvent);
            if (onInterceptTouchEvent || zu1Var.y9) {
                return true;
            }
        }
        return false;
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        wq1 wq1Var;
        it1 it1Var;
        View view;
        r47 messageObject;
        zu1 zu1Var = this.G3;
        if (zu1Var.vb && zu1Var.ub && getMeasuredHeight() > 0 && getPaddingTop() > 0 && zu1Var.D0 != null) {
            zu1Var.vb = false;
            zu1Var.C0.G = false;
            r47 r47Var = (r47) zu1Var.G6[0].get(zu1Var.wb);
            int indexOf = r47Var != null ? zu1Var.M6.indexOf(r47Var) : -1;
            if (indexOf >= 0) {
                zu1Var.C0.h1(zu1Var.D0.K + indexOf, Math.max(hl.L(50.0f) + zu1Var.h7(r47Var), hl.L(102.0f)), false);
            }
        }
        super.onLayout(z, i, i2, i3, i4);
        if (zu1Var.wb != 0 && (wq1Var = zu1Var.A0) != null && (it1Var = zu1Var.D0) != null && !it1Var.O && !wq1Var.W1) {
            int childCount = wq1Var.getChildCount();
            int i5 = 0;
            while (true) {
                if (i5 >= childCount) {
                    view = null;
                    break;
                }
                view = zu1Var.A0.getChildAt(i5);
                if ((view instanceof wb2) && (messageObject = ((wb2) view).getMessageObject()) != null && messageObject.e1() == zu1Var.wb && r47.B0(messageObject.k) == zu1Var.l6) {
                    break;
                } else {
                    i5++;
                }
            }
            int i6 = zu1Var.xb;
            if (view == null) {
                if (i6 != Integer.MIN_VALUE) {
                    zu1Var.wb = 0;
                    zu1Var.xb = TLObject.FLAG_31;
                }
            } else if (i6 != Integer.MIN_VALUE) {
                int top = view.getTop() - i6;
                if (top != 0) {
                    zu1Var.A0.scrollBy(0, top);
                }
            } else if (zu1Var.A0.getPaddingTop() > 0 && !zu1Var.vb) {
                zu1Var.xb = view.getTop();
            }
        }
        int i7 = this.g3;
        int i8 = i3 - i;
        if (i7 != i8) {
            if (i7 != 0) {
                zu1Var.H7(false);
            }
            this.g3 = i8;
        }
        int measuredHeight = getMeasuredHeight();
        if (this.F3 != measuredHeight) {
            this.E3 = true;
            yq1 yq1Var = zu1Var.B0;
            if (yq1Var != null) {
                yq1Var.g();
            }
            zu1Var.o9.e();
            this.E3 = false;
            this.F3 = measuredHeight;
        }
        zu1Var.j6 = false;
        ot1 ot1Var = zu1Var.u9;
        if (ot1Var != null && ot1Var.w()) {
            zu1Var.u9.v();
        }
        zu1Var.P7();
        zu1Var.h8();
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        ad2 ad2Var;
        zu1 zu1Var = this.G3;
        fm0 fm0Var = zu1Var.qd;
        ot1 ot1Var = zu1Var.u9;
        ot1Var.getClass();
        final byte b = 3;
        final byte b2 = 0;
        final byte b3 = 1;
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            hl.r(ot1Var.f0);
            ot1Var.z = false;
        }
        if (motionEvent.getAction() == 0) {
            zu1Var.Pa = true;
        }
        if (zu1Var.ka != 0.0f && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            float min = Math.min(1.0f, zu1Var.ka / hl.L(110.0f));
            final byte b4 = 2;
            if (motionEvent.getAction() != 1 || min != 1.0f || (ad2Var = zu1Var.ma) == null || ad2Var.S) {
                ad2 ad2Var2 = zu1Var.ma;
                if (ad2Var2 != null && ad2Var2.S) {
                    long currentTimeMillis = System.currentTimeMillis();
                    ad2 ad2Var3 = zu1Var.ma;
                    if (currentTimeMillis - ad2Var3.V < 500 && ad2Var3.N) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        zu1Var.na = animatorSet;
                        if (zu1Var.ma != null) {
                            fm0Var.a(false, true);
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(zu1Var.ka, hl.L(111.0f));
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: uq1
                            public final /* synthetic */ wq1 b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                byte b5 = b3;
                                wq1 wq1Var = this.b;
                                switch (b5) {
                                    case 0:
                                        zu1 zu1Var2 = wq1Var.G3;
                                        zu1Var2.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        zu1Var2.A0.invalidate();
                                        break;
                                    case 1:
                                        zu1 zu1Var3 = wq1Var.G3;
                                        zu1Var3.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        zu1Var3.A0.invalidate();
                                        break;
                                    case 2:
                                        zu1 zu1Var4 = wq1Var.G3;
                                        zu1Var4.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        zu1Var4.A0.invalidate();
                                        break;
                                    default:
                                        zu1 zu1Var5 = wq1Var.G3;
                                        zu1Var5.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        zu1Var5.A0.invalidate();
                                        break;
                                }
                            }
                        });
                        ofFloat.setDuration(400L);
                        ofFloat.setInterpolator(k43.f);
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(hl.L(111.0f), 0.0f);
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: uq1
                            public final /* synthetic */ wq1 b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                byte b5 = b4;
                                wq1 wq1Var = this.b;
                                switch (b5) {
                                    case 0:
                                        zu1 zu1Var2 = wq1Var.G3;
                                        zu1Var2.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        zu1Var2.A0.invalidate();
                                        break;
                                    case 1:
                                        zu1 zu1Var3 = wq1Var.G3;
                                        zu1Var3.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        zu1Var3.A0.invalidate();
                                        break;
                                    case 2:
                                        zu1 zu1Var4 = wq1Var.G3;
                                        zu1Var4.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        zu1Var4.A0.invalidate();
                                        break;
                                    default:
                                        zu1 zu1Var5 = wq1Var.G3;
                                        zu1Var5.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        zu1Var5.A0.invalidate();
                                        break;
                                }
                            }
                        });
                        ofFloat2.setStartDelay(600L);
                        ofFloat2.setDuration(250L);
                        ofFloat2.setInterpolator(bb2.V);
                        animatorSet.playSequentially(ofFloat, ofFloat2);
                        animatorSet.start();
                    }
                }
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(zu1Var.ka, 0.0f);
                zu1Var.na = ofFloat3;
                if (zu1Var.ma != null) {
                    fm0Var.a(false, true);
                }
                ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: uq1
                    public final /* synthetic */ wq1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        byte b5 = b;
                        wq1 wq1Var = this.b;
                        switch (b5) {
                            case 0:
                                zu1 zu1Var2 = wq1Var.G3;
                                zu1Var2.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                zu1Var2.A0.invalidate();
                                break;
                            case 1:
                                zu1 zu1Var3 = wq1Var.G3;
                                zu1Var3.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                zu1Var3.A0.invalidate();
                                break;
                            case 2:
                                zu1 zu1Var4 = wq1Var.G3;
                                zu1Var4.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                zu1Var4.A0.invalidate();
                                break;
                            default:
                                zu1 zu1Var5 = wq1Var.G3;
                                zu1Var5.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                zu1Var5.A0.invalidate();
                                break;
                        }
                    }
                });
                ofFloat3.setDuration(250L);
                ofFloat3.setInterpolator(bb2.V);
                ofFloat3.start();
            } else if (ad2Var.L != 1.0f) {
                float f = zu1Var.ka;
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f, hl.L(8.0f) + f);
                zu1Var.na = ofFloat4;
                ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: uq1
                    public final /* synthetic */ wq1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        byte b5 = b2;
                        wq1 wq1Var = this.b;
                        switch (b5) {
                            case 0:
                                zu1 zu1Var2 = wq1Var.G3;
                                zu1Var2.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                zu1Var2.A0.invalidate();
                                break;
                            case 1:
                                zu1 zu1Var3 = wq1Var.G3;
                                zu1Var3.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                zu1Var3.A0.invalidate();
                                break;
                            case 2:
                                zu1 zu1Var4 = wq1Var.G3;
                                zu1Var4.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                zu1Var4.A0.invalidate();
                                break;
                            default:
                                zu1 zu1Var5 = wq1Var.G3;
                                zu1Var5.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                zu1Var5.A0.invalidate();
                                break;
                        }
                    }
                });
                ofFloat4.setDuration(200L);
                k43 k43Var = k43.f;
                ofFloat4.setInterpolator(k43Var);
                ofFloat4.start();
                final ad2 ad2Var4 = zu1Var.ma;
                go1 go1Var = new go1(this, (byte) 4);
                AnimatorSet animatorSet2 = ad2Var4.K;
                if (animatorSet2 != null) {
                    animatorSet2.removeAllListeners();
                    ad2Var4.K.cancel();
                }
                ad2Var4.Z = go1Var;
                ad2Var4.K = new AnimatorSet();
                ValueAnimator ofFloat5 = ValueAnimator.ofFloat(ad2Var4.L, 1.0f);
                ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: yc2
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        byte b5 = b2;
                        ad2 ad2Var5 = ad2Var4;
                        ad2Var5.getClass();
                        switch (b5) {
                            case 0:
                                ad2Var5.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ad2Var5.U.invalidate();
                                wq1 wq1Var = ad2Var5.b0;
                                if (wq1Var != null) {
                                    wq1Var.invalidate();
                                    break;
                                }
                                break;
                            default:
                                ad2Var5.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                wq1 wq1Var2 = ad2Var5.b0;
                                if (wq1Var2 != null) {
                                    wq1Var2.invalidate();
                                    break;
                                }
                                break;
                        }
                    }
                });
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(ad2Var4.M, 0.0f);
                ofFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: yc2
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        byte b5 = b3;
                        ad2 ad2Var5 = ad2Var4;
                        ad2Var5.getClass();
                        switch (b5) {
                            case 0:
                                ad2Var5.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ad2Var5.U.invalidate();
                                wq1 wq1Var = ad2Var5.b0;
                                if (wq1Var != null) {
                                    wq1Var.invalidate();
                                    break;
                                }
                                break;
                            default:
                                ad2Var5.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                wq1 wq1Var2 = ad2Var5.b0;
                                if (wq1Var2 != null) {
                                    wq1Var2.invalidate();
                                    break;
                                }
                                break;
                        }
                    }
                });
                ad2Var4.K.addListener(new jb1((Object) ad2Var4, (byte) 22));
                ad2Var4.K.playTogether(ofFloat5, ofFloat6);
                ad2Var4.K.setDuration(120L);
                ad2Var4.K.setInterpolator(k43Var);
                ad2Var4.K.start();
            } else {
                zu1Var.G4();
            }
        }
        if (!this.W1) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            aVar = ((e) zu1Var).actionBar;
            if (aVar.z() || zu1Var.c8()) {
                return onTouchEvent;
            }
            D1(motionEvent);
            if (zu1Var.C9 || zu1Var.y9 || onTouchEvent) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        if (this.G3.g9 != null) {
            return false;
        }
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        nm9 f4;
        v0d v0dVar;
        super.requestDisallowInterceptTouchEvent(z);
        View view = this.G3.v9;
        if (view != null) {
            if ((view instanceof wb2) && (f4 = ((wb2) view).f4()) != null && (v0dVar = f4.e0) != null && f4.f0 && v0dVar.w && !v0dVar.E) {
                if (!v0dVar.x) {
                    return;
                }
                if (!v0dVar.y && (v0dVar.L & 3) != 1) {
                    return;
                }
            }
            D1(null);
        }
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.E3) {
            return;
        }
        iv1 iv1Var = this.G3.Fc;
        if (iv1Var.b != 0) {
            int childCount = iv1Var.a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                iv1Var.a.getChildAt(i).forceLayout();
            }
        }
        super.requestLayout();
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView
    public final void setItemAnimator(o79 o79Var) {
        if (this.W1) {
            return;
        }
        super.setItemAnimator(o79Var);
    }

    @Override // d79, android.view.View
    public final void setTranslationY(float f) {
        if (f != getTranslationY()) {
            super.setTranslationY(f);
            zu1 zu1Var = this.G3;
            zu1Var.O7();
            zu1Var.Q7();
        }
    }
}
