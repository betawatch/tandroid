// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Random;
import java.util.WeakHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraView;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.UsersSelectActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class p1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2;
        boolean z3;
        eo3[] eo3VarArr;
        int i;
        byte b;
        int i2;
        Layout layout;
        boolean z4;
        int i3;
        int i4;
        boolean z5 = true;
        byte b2 = 0;
        switch (this.a) {
            case 0:
                t1 t1Var = (t1) this.b;
                q66 q66Var = t1Var.x;
                if (q66Var != null) {
                    CharacterStyle characterStyle = q66Var.i;
                    final String url = characterStyle instanceof f8c ? ((f8c) characterStyle).getURL() : characterStyle instanceof URLSpan ? ((URLSpan) characterStyle).getURL() : characterStyle.toString();
                    try {
                        t1Var.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final StaticLayout staticLayout = t1Var.E;
                    final float f = t1Var.y;
                    if (t1Var.getContext() != null) {
                        final ClickableSpan clickableSpan = (ClickableSpan) t1Var.x.i;
                        nx0 h = uh9.h(1, null, t1Var.getContext(), false);
                        h.P = url;
                        h.Q = false;
                        CharSequence[] charSequenceArr = {ob6.M0(2131747544, null), ob6.M0(2131751732, null)};
                        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: n1
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i5) {
                                t1 t1Var2 = (t1) p1.this.b;
                                e eVar = t1Var2.I;
                                if (i5 == 0) {
                                    t1Var2.d(clickableSpan, staticLayout, f);
                                    return;
                                }
                                if (i5 == 1) {
                                    String str = url;
                                    hl.g(str);
                                    if (hl.C3()) {
                                        if (str.startsWith("@")) {
                                            bs2.v(null, 2131743320, d31.b0(eVar), R.raw.copy, 36);
                                        } else if (str.startsWith("#") || str.startsWith("$")) {
                                            bs2.v(null, 2131749116, d31.b0(eVar), R.raw.copy, 36);
                                        } else {
                                            bs2.v(null, 2131748675, d31.b0(eVar), R.raw.copy, 36);
                                        }
                                    }
                                }
                            }
                        };
                        h.M = charSequenceArr;
                        h.L = onClickListener;
                        h.I0 = new o1(this, (byte) 0);
                        h.show();
                    }
                    t1Var.x = null;
                    return;
                }
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.b;
                if (actionBarLayout.d == this) {
                    actionBarLayout.d = null;
                    actionBarLayout.g0(false, true, false);
                    return;
                }
                return;
            case 2:
                hb hbVar = (hb) this.b;
                ValueAnimator valueAnimator = hbVar.m;
                if (valueAnimator == null || valueAnimator.isRunning()) {
                    return;
                }
                hbVar.m.start();
                return;
            case 3:
                o10 o10Var = (o10) this.b;
                j20 j20Var = o10Var.E;
                if (MediaController.z().v0 != null) {
                    int i5 = j20Var.C2 + 1;
                    j20Var.C2 = i5;
                    if (i5 != 1) {
                        if (i5 != 2) {
                            MediaController.z().o0(true, 13.0f);
                            return;
                        } else {
                            MediaController.z().o0(true, 7.0f);
                            hl.d3(this, 2000L);
                            return;
                        }
                    }
                    o10Var.w = true;
                    j20Var.A2 = 1;
                    if (MediaController.z().G()) {
                        j20Var.T0();
                    } else if (j20Var.A2 == 1) {
                        hl.r(j20Var.H2);
                        j20Var.E2 = 0L;
                    }
                    MediaController.z().o0(true, 4.0f);
                    hl.d3(this, 2000L);
                    return;
                }
                return;
            case 4:
                j20 j20Var2 = (j20) this.b;
                kfc kfcVar = MediaController.z().j0;
                long U = kfcVar == null ? 0L : kfcVar.U();
                if (U == 0 || U == -9223372036854775807L) {
                    j20Var2.D2 = System.currentTimeMillis();
                    return;
                }
                float f2 = j20Var2.B2;
                long currentTimeMillis = System.currentTimeMillis();
                long j = currentTimeMillis - j20Var2.D2;
                j20Var2.D2 = currentTimeMillis;
                long j2 = currentTimeMillis - j20Var2.E2;
                int i6 = j20Var2.C2;
                float f3 = ((long) ((f2 * r1) + (((i6 == 1 ? 3L : i6 == 2 ? 6L : 12L) * j) - j))) / U;
                if (f3 < 0.0f) {
                    f3 = 0.0f;
                }
                j20Var2.B2 = f3;
                r47 r47Var = MediaController.z().v0;
                if (r47Var != null && r47Var.I3()) {
                    if (!MediaController.z().G()) {
                        MediaController.z().v0.b0 = j20Var2.B2;
                    }
                    j20Var2.X0(r47Var, false);
                }
                if (j20Var2.A2 == 1 && j20Var2.C2 > 0 && MediaController.z().G()) {
                    if (j2 > 200 || j20Var2.B2 == 0.0f) {
                        j20Var2.E2 = currentTimeMillis;
                        MediaController.z().k0(MediaController.z().v0, f3);
                    }
                    if (j20Var2.C2 <= 0 || j20Var2.B2 <= 0.0f) {
                        return;
                    }
                    hl.d3(j20Var2.H2, 16L);
                    return;
                }
                return;
            case 5:
                UsersSelectActivity usersSelectActivity = new UsersSelectActivity(null);
                usersSelectActivity.P = new zh6();
                usersSelectActivity.Q = new ArrayList();
                usersSelectActivity.y = (byte) 1;
                usersSelectActivity.H = false;
                x60 x60Var = (x60) this.b;
                usersSelectActivity.T = x60Var.Y();
                usersSelectActivity.n = new m0(this, (byte) 24);
                x60Var.presentFragment(usersSelectActivity);
                return;
            case 6:
                w76 w76Var = (w76) this.b;
                vr3 vr3Var = w76Var.c;
                p70 p70Var = w76Var.a;
                if (w76Var.E) {
                    if (w76Var.x) {
                        w76Var.x = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        p70Var.d = currentAnimationTimeMillis;
                        p70Var.f = -1L;
                        p70Var.e = currentAnimationTimeMillis;
                        p70Var.g = 0.5f;
                    }
                    if ((p70Var.f > 0 && AnimationUtils.currentAnimationTimeMillis() > p70Var.f + p70Var.h) || !w76Var.e()) {
                        w76Var.E = false;
                        return;
                    }
                    if (w76Var.y) {
                        w76Var.y = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        vr3Var.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (p70Var.e == 0) {
                        xi4.l("Cannot compute scroll delta before calling start()");
                        return;
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a = p70Var.a(currentAnimationTimeMillis2);
                    long j3 = currentAnimationTimeMillis2 - p70Var.e;
                    p70Var.e = currentAnimationTimeMillis2;
                    w76Var.G.scrollListBy((int) (j3 * ((a * 4.0f) + ((-4.0f) * a * a)) * p70Var.c));
                    WeakHashMap weakHashMap = ihc.a;
                    vr3Var.postOnAnimation(this);
                    return;
                }
                return;
            case 7:
                jf0 jf0Var = (jf0) this.b;
                gf0 gf0Var = jf0Var.b;
                if (gf0Var == null) {
                    gf0Var = new gf0(jf0Var, b2);
                    jf0Var.b = gf0Var;
                }
                int i7 = jf0Var.c + 1;
                jf0Var.c = i7;
                gf0Var.b = i7;
                jf0Var.postDelayed(gf0Var, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 8:
                for (Thread thread : ek0.w.keySet()) {
                    if (!thread.isAlive()) {
                        ek0.w.remove(thread);
                    }
                }
                if (ek0.w.isEmpty()) {
                    ek0.x = false;
                    return;
                } else {
                    hl.d3(((ek0) this.b).p, 5000L);
                    return;
                }
            case 9:
                nx0 nx0Var = (nx0) this.b;
                if (nx0Var.H != this || (z = nx0Var.J)) {
                    return;
                }
                nx0Var.H = null;
                if (z) {
                    return;
                }
                nx0Var.b.setVisibility(0);
                if (nx0Var.j0()) {
                    return;
                }
                if (nx0Var.K) {
                    nx0Var.c.setLayerType(2, null);
                }
                boolean z6 = nx0Var.V0;
                ViewGroup viewGroup = nx0Var.b;
                if (z6) {
                    viewGroup.setTranslationX(hl.L(48.0f));
                    nx0Var.b.setAlpha(0.0f);
                    nx0Var.b.setTranslationY(0.0f);
                } else {
                    viewGroup.setTranslationY(Math.max(0, Math.min(hl.n, nx0Var.O())) + hl.L(10.0f) + nx0Var.P() + nx0Var.f);
                }
                nx0Var.e0();
                nx0Var.B0 = (byte) 1;
                ValueAnimator valueAnimator2 = nx0Var.C0;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(nx0Var.D0, 1.0f);
                nx0Var.C0 = ofFloat;
                ofFloat.addUpdateListener(new bx0(nx0Var, (byte) 0));
                nx0Var.A0 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(nx0Var.b, (Property<ViewGroup, Float>) View.TRANSLATION_X, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(nx0Var.b, (Property<ViewGroup, Float>) View.ALPHA, 1.0f));
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(nx0Var.b, (Property<ViewGroup, Float>) View.TRANSLATION_Y, 0.0f);
                ofFloat2.addUpdateListener(new bx0(nx0Var, (byte) 1));
                arrayList.add(ofFloat2);
                arrayList.add(ObjectAnimator.ofInt(nx0Var.Z, sn.d, nx0Var.p0 ? nx0Var.q0 : 0));
                arrayList.add(nx0Var.C0);
                nx0Var.C(arrayList, true);
                nx0Var.A0.playTogether(arrayList);
                boolean z7 = nx0Var.V0;
                AnimatorSet animatorSet = nx0Var.A0;
                if (z7) {
                    animatorSet.setDuration(250L);
                    nx0Var.A0.setInterpolator(k43.f);
                } else {
                    animatorSet.setDuration(nx0Var.k0);
                    nx0Var.A0.setInterpolator(nx0Var.l0);
                }
                nx0Var.A0.setStartDelay(nx0Var.E ? 0L : 20L);
                nx0Var.A0.setInterpolator(nx0Var.l0);
                nx0Var.M0.d();
                nx0Var.A0.addListener(new gx0(nx0Var, (byte) 0));
                if (nx0Var.L0) {
                    jn7.e().k(99, 512);
                }
                nx0Var.A0.start();
                return;
            case 10:
                BubbleActivity bubbleActivity = (BubbleActivity) this.b;
                if (bubbleActivity.Z == this) {
                    if (hl.n2(true)) {
                        if (f11.a) {
                            cc4.b("lock app");
                        }
                        bubbleActivity.A();
                    } else if (f11.a) {
                        cc4.b("didn't pass lock check");
                    }
                    bubbleActivity.Z = null;
                    return;
                }
                return;
            case 11:
                la1 la1Var = (la1) this.b;
                CameraView cameraView = la1Var.d;
                if (cameraView == null || la1Var.O || cameraView.getCameraSession() == null) {
                    return;
                }
                la1Var.f.post(new fv0(this, (byte) 16));
                return;
            case 12:
                za1 za1Var = (za1) this.b;
                za1Var.b(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                za1Var.f.performHapticFeedback(0);
                Runnable runnable = za1Var.j;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 13:
                gc1 gc1Var = (gc1) this.b;
                kc1 kc1Var = gc1Var.f;
                if (kc1Var == null || gc1Var.e == null) {
                    return;
                }
                float[] fArr = gc1Var.h;
                float[] fArr2 = gc1Var.g;
                float width = kc1Var.getWidth();
                float height = kc1Var.getHeight();
                float f4 = Float.MAX_VALUE;
                float f5 = -3.4028235E38f;
                int i8 = 0;
                while (i8 < 4) {
                    gc1Var.d(kc1Var, i8 % 2 == 0 ? 0.0f : width, i8 < 2 ? 0.0f : height);
                    f4 = Math.min(f4, fArr2[1]);
                    f5 = Math.max(f5, fArr2[1]);
                    i8++;
                }
                float f6 = width / 2.0f;
                float f7 = height / 2.0f;
                float d = gc1Var.d(kc1Var, f6, f7);
                float f8 = fArr2[1];
                float d2 = gc1Var.d(kc1Var, width, f7) - d;
                float f9 = fArr2[1] - f8;
                float hypot = width <= 0.0f ? 1.0f : ((float) Math.hypot(d2, f9)) / f6;
                gc1.g(kc1Var, fArr);
                gc1Var.e.d(d, f8, f4, f5, (float) Math.toDegrees(Math.atan2(f9, d2)), hypot, kc1Var.getEditText().getPaint(), kc1Var.getEditText().getCurrentTextColor(), fArr[0], fArr[1], fArr[2], kc1Var.getEditText().getLayout() != null ? kc1Var.getEditText().getLayout().getAlignment() : null);
                ViewParent parent = kc1Var.getParent();
                bc1 bc1Var = gc1Var.e;
                if (parent == null) {
                    bc1Var.e(null, null);
                } else {
                    bc1Var.e(kc1Var.x(-1), kc1Var.x(1));
                }
                gc1Var.e.postOnAnimation(this);
                return;
            case 14:
                kc1 kc1Var2 = (kc1) this.b;
                if (kc1Var2.isAttachedToWindow()) {
                    kc1Var2.z();
                    kc1Var2.postOnAnimation(this);
                    return;
                }
                return;
            case 15:
                t32 t32Var = (t32) this.b;
                if (t32Var.T) {
                    t32Var.O.clear();
                    t32Var.Q.clear();
                    t32Var.R.clear();
                    t32Var.f();
                    return;
                }
                return;
            case 16:
                b62 b62Var = (b62) this.b;
                c62 c62Var = b62Var.Q;
                if (c62Var.K == null || c62Var.L) {
                    return;
                }
                int computeVerticalScrollOffset = c62Var.r.computeVerticalScrollOffset();
                boolean z8 = c62Var.r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (b62Var.e() - b62Var.r) + b62Var.n;
                float max = Math.max(0.0f, (c62Var.F - Math.max(0, computeVerticalScrollOffset - c62Var.getListTopPadding())) - hl.L(52.0f));
                float max2 = Math.max(0.0f, ((c62Var.r.getMeasuredHeight() - (c62Var.F - computeVerticalScrollOffset)) - c62Var.getListTopPadding()) - hl.L(84.0f));
                float L = hl.L(32.0f);
                float L2 = (max >= L || computeVerticalScrollOffset <= c62Var.getListTopPadding()) ? max2 < L ? hl.L(6.0f) * (1.0f - (max2 / L)) : 0.0f : (-(1.0f - (max / L))) * hl.L(6.0f);
                int i9 = (int) L2;
                if (Math.abs(i9) > 0 && c62Var.r.canScrollVertically(i9) && (L2 <= 0.0f || !z8)) {
                    c62Var.F += L2;
                    c62Var.r.scrollBy(0, i9);
                    b62Var.invalidate();
                }
                b62Var.M = true;
                b62Var.postDelayed(this, 15L);
                return;
            case 17:
                a72 a72Var = (a72) this.b;
                p1 p1Var = a72Var.V0;
                zh8 zh8Var = a72Var.h1;
                if (zh8Var != null) {
                    EditTextBoldCursor editField = zh8Var.getEditField();
                    if (a72Var.I || editField == null || !a72Var.H || a72Var.f1 || hl.D || hl.E || !hl.O1()) {
                        return;
                    }
                    editField.requestFocus();
                    hl.E3(editField);
                    hl.r(p1Var);
                    hl.d3(p1Var, 100L);
                    return;
                }
                return;
            case 18:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e) {
                    if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e;
                    }
                    return;
                } catch (NullPointerException e2) {
                    if (!TextUtils.equals(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e2;
                    }
                    return;
                }
            case 19:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                contactsActivity.b.Z();
                contactsActivity.g0 = false;
                return;
            case 20:
                tf3 tf3Var = (tf3) this.b;
                tf3Var.o0.onDismiss(tf3Var.w0);
                return;
            case 21:
                hl.r(this);
                bn3 bn3Var = (bn3) this.b;
                if (bn3Var.r != 1 || bn3Var.s == null) {
                    return;
                }
                Editable text = bn3Var.f.a.F0.getText();
                boolean z9 = text != null && text.toString().trim().length() > 0;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                boolean z10 = bn3Var.s.getRightMode() == 2;
                long j4 = bn3Var.s0;
                if (uptimeMillis2 - j4 >= 300) {
                    if (z10) {
                        if (!z9 || bn3Var.V > j4) {
                            bn3Var.s.setRightMode(0);
                            bn3Var.s0 = uptimeMillis2;
                        }
                    } else if (z9 && uptimeMillis2 - bn3Var.V > 1200 && uptimeMillis2 - bn3Var.r0 > 1200) {
                        bn3Var.s.setRightMode(2);
                        bn3Var.s0 = uptimeMillis2;
                    }
                }
                hl.d3(this, 50L);
                return;
            case 22:
                en3 en3Var = (en3) this.b;
                en3Var.j1 = false;
                if (en3Var.isAttachedToWindow() && en3Var.getVisibility() == 0) {
                    en3Var.invalidate();
                    en3Var.j1 = true;
                    en3Var.postOnAnimation(this);
                    return;
                }
                return;
            case 23:
                ho3 ho3Var = (ho3) this.b;
                TextView textView = ho3Var.a;
                Editable editableText = textView.getEditableText();
                if (editableText == null) {
                    ho3Var.g = false;
                    return;
                }
                long uptimeMillis3 = SystemClock.uptimeMillis();
                fo3[] fo3VarArr = (fo3[]) editableText.getSpans(0, editableText.length(), fo3.class);
                int length = fo3VarArr.length;
                int i10 = 0;
                boolean z11 = false;
                while (true) {
                    int i11 = 33;
                    if (i10 >= length) {
                        boolean z12 = z5;
                        float f10 = 0.5f;
                        eo3[] eo3VarArr2 = (eo3[]) editableText.getSpans(0, editableText.length(), eo3.class);
                        int length2 = eo3VarArr2.length;
                        int i12 = 0;
                        while (i12 < length2) {
                            eo3 eo3Var = eo3VarArr2[i12];
                            int spanStart = editableText.getSpanStart(eo3Var);
                            int spanEnd = editableText.getSpanEnd(eo3Var);
                            if (spanStart < 0 || spanEnd <= spanStart) {
                                eo3VarArr = eo3VarArr2;
                                i = length2;
                                b = b2;
                                editableText.removeSpan(eo3Var);
                            } else {
                                b = b2;
                                if (qu6.w(uptimeMillis3 - eo3Var.a, 750.0f, 1.0f, 0.0f) >= 1.0f) {
                                    editableText.removeSpan(eo3Var);
                                    eo3VarArr = eo3VarArr2;
                                    i = length2;
                                } else {
                                    long j5 = eo3Var.b;
                                    if (j5 <= 0) {
                                        j5 = eo3Var.a;
                                    }
                                    if (uptimeMillis3 >= j5 - 16) {
                                        if (!eo3Var.e) {
                                            eo3Var.e = z12;
                                            um3 um3Var = ho3Var.h;
                                            if (um3Var != null) {
                                                bn3 bn3Var2 = um3Var.b;
                                                float[] fArr3 = bn3Var2.E0;
                                                mm mmVar = bn3Var2.Z;
                                                if (mmVar == null || mmVar.c < 0.2f || !bn3Var2.u(fArr3) || (layout = bn3Var2.f.a.F0.getLayout()) == null || spanEnd > layout.getText().length()) {
                                                    eo3VarArr = eo3VarArr2;
                                                    i = length2;
                                                } else {
                                                    int lineForOffset = layout.getLineForOffset(spanStart);
                                                    float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
                                                    float primaryHorizontal2 = layout.getLineForOffset(spanEnd) == lineForOffset ? layout.getPrimaryHorizontal(spanEnd) : layout.getLineRight(lineForOffset);
                                                    eo3VarArr = eo3VarArr2;
                                                    gn3 gn3Var = bn3Var2.x;
                                                    float f11 = primaryHorizontal + fArr3[b];
                                                    i = length2;
                                                    float lineTop = layout.getLineTop(lineForOffset) + fArr3[1];
                                                    float max3 = Math.max(primaryHorizontal, primaryHorizontal2) + fArr3[b];
                                                    float lineBottom = layout.getLineBottom(lineForOffset) + fArr3[1];
                                                    int i13 = ((int) (bn3Var2.R * 2.5f)) + 2;
                                                    Random random = gn3Var.t;
                                                    int i14 = i13 + (random.nextFloat() < f10 ? (byte) 1 : b);
                                                    int i15 = b;
                                                    while (i15 < i14) {
                                                        gn3 gn3Var2 = gn3Var;
                                                        float max4 = (Math.max(1.0f, max3 - f11) * random.nextFloat()) + f11;
                                                        float A = qd4.A(lineBottom, lineTop, ik8.e(random, 0.85f, 0.15f), lineTop);
                                                        float L3 = hl.L((random.nextFloat() * 7.0f) + 3.0f);
                                                        double nextFloat = ((random.nextFloat() - f10) * 2.2f) - 1.5707963267948966d;
                                                        gn3Var2.j(max4, A, ((float) Math.cos(nextFloat)) * L3, ((float) Math.sin(nextFloat)) * L3, ik8.e(random, 0.55f, 0.45f), ik8.e(random, f10, 0.55f));
                                                        i15++;
                                                        lineTop = lineTop;
                                                        gn3Var = gn3Var2;
                                                        i14 = i14;
                                                        f10 = 0.5f;
                                                    }
                                                }
                                                i2 = 33;
                                                editableText.setSpan(eo3Var, spanStart, spanEnd, i2);
                                            }
                                        }
                                        eo3VarArr = eo3VarArr2;
                                        i = length2;
                                        i2 = i11;
                                        editableText.setSpan(eo3Var, spanStart, spanEnd, i2);
                                    } else {
                                        eo3VarArr = eo3VarArr2;
                                        i = length2;
                                    }
                                    z11 = true;
                                }
                            }
                            i12++;
                            b2 = b;
                            eo3VarArr2 = eo3VarArr;
                            length2 = i;
                            i11 = 33;
                            f10 = 0.5f;
                            z12 = true;
                        }
                        do3[] do3VarArr = (do3[]) editableText.getSpans(b2, editableText.length(), do3.class);
                        for (do3 do3Var : do3VarArr) {
                            if (do3Var.a != 0) {
                                int spanStart2 = editableText.getSpanStart(do3Var);
                                int spanEnd2 = editableText.getSpanEnd(do3Var);
                                if (spanStart2 >= 0 && spanEnd2 > spanStart2) {
                                    long j6 = do3Var.a;
                                    if (j6 == 0 || uptimeMillis3 < j6 + 300) {
                                        editableText.setSpan(do3Var, spanStart2, spanEnd2, 33);
                                        z11 = true;
                                    }
                                }
                                editableText.removeSpan(do3Var);
                            }
                        }
                        go3 go3Var = ho3Var.j;
                        if (go3Var == null || ho3Var.m <= 0.0f || editableText.getSpanStart(go3Var) < 0) {
                            z2 = false;
                            z3 = z11;
                        } else {
                            z2 = false;
                            editableText.setSpan(ho3Var.j, 0, editableText.length(), 18);
                            z3 = true;
                        }
                        if (z3) {
                            textView.postOnAnimation(this);
                            return;
                        } else {
                            ho3Var.g = z2;
                            return;
                        }
                    }
                    fo3 fo3Var = fo3VarArr[i10];
                    int spanStart3 = editableText.getSpanStart(fo3Var);
                    int spanEnd3 = editableText.getSpanEnd(fo3Var);
                    if (spanStart3 < 0 || spanEnd3 <= spanStart3) {
                        z4 = z5;
                        i3 = i10;
                        i4 = length;
                    } else {
                        i3 = i10;
                        z4 = z5;
                        i4 = length;
                        if (uptimeMillis3 < (Math.max(0, fo3Var.c - 1) * 22) + fo3Var.a + 320) {
                            editableText.setSpan(fo3Var, spanStart3, spanEnd3, 33);
                            z11 = z4;
                            i10 = i3 + 1;
                            z5 = z4;
                            length = i4;
                        }
                    }
                    editableText.removeSpan(fo3Var);
                    i10 = i3 + 1;
                    z5 = z4;
                    length = i4;
                }
                break;
            case 24:
                if (!((vo3) this.b).a.isEmpty()) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    int i16 = 0;
                    while (i16 < ((vo3) this.b).a.size()) {
                        uo3 uo3Var = (uo3) ((vo3) this.b).a.get(i16);
                        if (uo3Var.getLastTaskTime() < elapsedRealtime - 30000) {
                            uo3Var.recycle();
                            ((vo3) this.b).a.remove(i16);
                            ((vo3) this.b).e--;
                            i16--;
                        }
                        i16++;
                    }
                }
                if (((vo3) this.b).a.isEmpty() && ((vo3) this.b).c.isEmpty()) {
                    ((vo3) this.b).h = false;
                    return;
                } else {
                    Utilities.e.d(this, 30000L);
                    ((vo3) this.b).h = true;
                    return;
                }
            case 25:
                lq3 lq3Var = (lq3) this.b;
                lq3Var.J.clear();
                lq3Var.getNotificationCenter().k(jn7.e5, new Object[0]);
                return;
            case 26:
                ym ymVar = (ym) this.b;
                ymVar.a(true);
                ymVar.invalidateSelf();
                return;
            case 27:
                vr3 vr3Var2 = (vr3) this.b;
                vr3Var2.x = null;
                vr3Var2.drawableStateChanged();
                return;
            case 28:
                iu3 iu3Var = (iu3) this.b;
                p1 p1Var2 = iu3Var.Q;
                du3 du3Var = iu3Var.a;
                if (iu3Var.E || du3Var == null || !iu3Var.O || iu3Var.w || hl.D || hl.E || !hl.O1()) {
                    return;
                }
                du3Var.requestFocus();
                hl.E3(du3Var);
                hl.r(p1Var2);
                hl.d3(p1Var2, 100L);
                return;
            default:
                vh4 vh4Var = (vh4) ((j8) this.b).d;
                if (!vh4Var.a || ((ArrayList) vh4Var.c).isEmpty() || ((AnimatorSet) vh4Var.d).isRunning()) {
                    return;
                }
                try {
                    ((AnimatorSet) vh4Var.d).start();
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
