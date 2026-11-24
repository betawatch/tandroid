// default package

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.URLSpan;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxBase;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class xc2 {
    public int A;
    public boolean B;
    public boolean C;
    public long D;
    public float E;
    public boolean F;
    public byte G = -1;
    public float H;
    public jd0 I;
    public Paint J;
    public Paint K;
    public Path L;
    public final rc2 a;
    public boolean b;
    public StaticLayout c;
    public CharSequence d;
    public int e;
    public int f;
    public int g;
    public Drawable h;
    public int i;
    public ry2 j;
    public og8 k;
    public kf8 l;
    public ag8 m;
    public ag8 n;
    public int o;
    public int p;
    public int q;
    public float r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public long y;
    public String z;

    public xc2(rc2 rc2Var) {
        this.a = rc2Var;
    }

    public static void g(int i, ArrayList arrayList, boolean z) {
        if (!z || i == 0 || arrayList.isEmpty()) {
            return;
        }
        Collections.sort(arrayList, new sa((byte) 24));
        int size = arrayList.size();
        for (int i2 = 0; i2 < size && i > 0; i2++) {
            qc2 qc2Var = (qc2) arrayList.get(i2);
            int i3 = qc2Var.d;
            if (i3 > 0) {
                qc2Var.d = i3 + 1;
                i--;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0108, code lost:
    
        if (r6.length == 0) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(MotionEvent motionEvent) {
        boolean z;
        float f;
        boolean z2;
        CharacterStyle characterStyle;
        gn gnVar;
        boolean z3;
        boolean z4;
        CharacterStyle[] characterStyleArr;
        CharacterStyle[] characterStyleArr2;
        p99 p99Var;
        rc2 rc2Var = this.a;
        i66 i66Var = rc2Var.u4;
        yc2 yc2Var = rc2Var.ub;
        if ((this.d instanceof Spannable) && rc2Var.q3 != null && rc2Var.t4 == -1 && !rc2Var.rc) {
            boolean z5 = true;
            if (motionEvent.getAction() == 0 || (motionEvent.getAction() == 1 && (rc2Var.v4 == 1 || rc2Var.s4 != null))) {
                int x = (int) motionEvent.getX();
                int P1 = (int) rc2Var.P1(motionEvent);
                float f2 = x;
                float f3 = rc2Var.u5;
                if (f2 >= f3) {
                    float f4 = P1;
                    float f5 = rc2Var.v5;
                    if (f4 >= f5) {
                        i47 i47Var = rc2Var.q3;
                        if (f2 <= f3 + i47Var.c && f4 <= f5 + i47Var.c(yc2Var)) {
                            int i = (int) (f4 - rc2Var.v5);
                            int i2 = 0;
                            for (int i3 = 0; i3 < rc2Var.q3.e.size() && ((h47) rc2Var.q3.e.get(i3)).p(rc2Var.q3.e, yc2Var) <= i; i3++) {
                                i2 = i3;
                            }
                            try {
                                h47 h47Var = (h47) rc2Var.q3.e.get(i2);
                                float f6 = rc2Var.u5;
                                if (h47Var.l()) {
                                    try {
                                        f = rc2Var.q3.d;
                                    } catch (Exception e) {
                                        e = e;
                                        z = true;
                                        fc4.g(e, z);
                                        return false;
                                    }
                                } else {
                                    f = 0.0f;
                                }
                                int i4 = (int) (f2 - (f6 - f));
                                int p = (int) (i - h47Var.p(rc2Var.q3.e, yc2Var));
                                int lineForVertical = h47Var.e.getLineForVertical(p);
                                int i5 = 0;
                                float f7 = i4;
                                int offsetForHorizontal = h47Var.n + h47Var.e.getOffsetForHorizontal(lineForVertical, f7);
                                float lineLeft = h47Var.e.getLineLeft(lineForVertical);
                                if (lineLeft <= f7 && lineLeft + h47Var.e.getLineWidth(lineForVertical) >= f7) {
                                    Spannable spannable = (Spannable) this.d;
                                    CharacterStyle[] characterStyleArr3 = (CharacterStyle[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                                    if (characterStyleArr3 == null || characterStyleArr3.length == 0) {
                                        characterStyleArr3 = (CharacterStyle[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, f6c.class);
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    boolean z6 = characterStyleArr3 != null ? z2 : false;
                                    characterStyleArr3 = (CharacterStyle[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, gn.class);
                                    if (characterStyleArr3.length != 0 && ((!(characterStyleArr3[0] instanceof d6c) || d6c.h) && !gm.A1())) {
                                        if (motionEvent.getAction() == 0) {
                                            CharacterStyle characterStyle2 = characterStyleArr3[0];
                                            if (characterStyle2 instanceof gn) {
                                                gn gnVar2 = rc2Var.q4;
                                                if (gnVar2 == null || gnVar2 != characterStyle2) {
                                                    rc2Var.i3(1);
                                                    rc2Var.q4 = (gn) characterStyleArr3[0];
                                                    rc2Var.v4 = 1;
                                                }
                                            } else {
                                                m66 m66Var = rc2Var.r4;
                                                if (m66Var == null || m66Var.i != characterStyle2) {
                                                    i66Var.l(m66Var, true);
                                                    float[] fArr = rc2.Id;
                                                    m66 m66Var2 = new m66(characterStyleArr3[0], rc2Var.cc, f7, p, 0);
                                                    rc2Var.r4 = m66Var2;
                                                    m66Var2.d(cmb.v0(rc2Var.Q5.O3() ? cmb.Cc : cmb.Be, rc2Var.cc));
                                                    if (h47Var.J && (p99Var = rc2Var.n8) != null) {
                                                        rc2Var.r4.d(cmb.p1(cmb.I.o() ? 0.13f : 0.1f, p99Var.h()));
                                                    }
                                                    rc2Var.z0 = i2;
                                                    rc2Var.y0 = -1;
                                                    rc2Var.v4 = 1;
                                                    try {
                                                        b66 b = rc2Var.r4.b();
                                                        int[] Z1 = rc2.Z1(spannable, rc2Var.r4.i);
                                                        int i6 = Z1[0];
                                                        int i7 = h47Var.n;
                                                        int i8 = i6 - i7;
                                                        Z1[0] = i8;
                                                        Z1[1] = Z1[1] - i7;
                                                        b.d(h47Var.e, i8, 0.0f);
                                                        h47Var.e.getSelectionPath(Z1[0], Z1[1], b);
                                                        if (Z1[1] >= h47Var.r) {
                                                            int i9 = i2 + 1;
                                                            while (i9 < rc2Var.q3.e.size()) {
                                                                h47 h47Var2 = (h47) rc2Var.q3.e.get(i9);
                                                                if (z6) {
                                                                    try {
                                                                        int i10 = h47Var2.n;
                                                                        characterStyleArr2 = (CharacterStyle[]) spannable.getSpans(i10, i10, f6c.class);
                                                                    } catch (Exception e2) {
                                                                        e = e2;
                                                                        z4 = z5;
                                                                        fc4.g(e, z4);
                                                                        i66Var.a(rc2Var.r4, Integer.valueOf(z4 ? 1 : 0));
                                                                        rc2Var.qc = z4;
                                                                        rc2Var.invalidate();
                                                                        return z4;
                                                                    }
                                                                } else {
                                                                    int i11 = h47Var2.n;
                                                                    characterStyleArr2 = (CharacterStyle[]) spannable.getSpans(i11, i11, ClickableSpan.class);
                                                                }
                                                                if (characterStyleArr2 == null || characterStyleArr2.length == 0) {
                                                                    break;
                                                                }
                                                                CharacterStyle characterStyle3 = characterStyleArr2[i5];
                                                                m66 m66Var3 = rc2Var.r4;
                                                                if (characterStyle3 != m66Var3.i) {
                                                                    z3 = z5;
                                                                    break;
                                                                }
                                                                b66 b2 = m66Var3.b();
                                                                z3 = z5;
                                                                try {
                                                                    b2.d(h47Var2.e, i5, h47Var2.p(rc2Var.q3.e, yc2Var) - h47Var.p(rc2Var.q3.e, yc2Var));
                                                                    int i12 = (Z1[z3 ? 1 : 0] + h47Var.n) - h47Var2.n;
                                                                    h47Var2.e.getSelectionPath(0, i12, b2);
                                                                    if (i12 < h47Var2.r - 1) {
                                                                        break;
                                                                    }
                                                                    i9++;
                                                                    z5 = z3 ? 1 : 0;
                                                                    i5 = 0;
                                                                } catch (Exception e3) {
                                                                    e = e3;
                                                                    z4 = z3;
                                                                    fc4.g(e, z4);
                                                                    i66Var.a(rc2Var.r4, Integer.valueOf(z4 ? 1 : 0));
                                                                    rc2Var.qc = z4;
                                                                    rc2Var.invalidate();
                                                                    return z4;
                                                                }
                                                            }
                                                        }
                                                        z3 = z5;
                                                        i5 = 0;
                                                        if (Z1[i5] <= h47Var.n) {
                                                            int i13 = 0;
                                                            for (int i14 = i2 - 1; i14 >= 0; i14--) {
                                                                h47 h47Var3 = (h47) rc2Var.q3.e.get(i14);
                                                                if (z6) {
                                                                    int i15 = h47Var3.r - 1;
                                                                    characterStyleArr = (CharacterStyle[]) spannable.getSpans(i15, i15, f6c.class);
                                                                } else {
                                                                    int i16 = h47Var3.r - 1;
                                                                    characterStyleArr = (CharacterStyle[]) spannable.getSpans(i16, i16, ClickableSpan.class);
                                                                }
                                                                if (characterStyleArr == null || characterStyleArr.length == 0) {
                                                                    break;
                                                                }
                                                                CharacterStyle characterStyle4 = characterStyleArr[0];
                                                                m66 m66Var4 = rc2Var.r4;
                                                                if (characterStyle4 != m66Var4.i) {
                                                                    break;
                                                                }
                                                                b66 b3 = m66Var4.b();
                                                                i13 -= h47Var3.w;
                                                                int i17 = Z1[0];
                                                                int i18 = h47Var.n;
                                                                int i19 = h47Var3.n;
                                                                int i20 = (i17 + i18) - i19;
                                                                int i21 = (Z1[z3 ? 1 : 0] + i18) - i19;
                                                                b3.d(h47Var3.e, i20, i13);
                                                                h47Var3.e.getSelectionPath(i20, i21, b3);
                                                                if (i20 > h47Var3.n) {
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                        z4 = z3 ? 1 : 0;
                                                    } catch (Exception e4) {
                                                        e = e4;
                                                        z3 = z5;
                                                    }
                                                    i66Var.a(rc2Var.r4, Integer.valueOf(z4 ? 1 : 0));
                                                    rc2Var.qc = z4;
                                                    rc2Var.invalidate();
                                                    return z4;
                                                }
                                            }
                                            z4 = true;
                                            rc2Var.qc = z4;
                                            rc2Var.invalidate();
                                            return z4;
                                        }
                                        CharacterStyle characterStyle5 = characterStyleArr3[0];
                                        if ((characterStyle5 instanceof gn) && (gnVar = rc2Var.q4) == characterStyle5) {
                                            if (rc2Var.eb.D1(gnVar)) {
                                                z = true;
                                                try {
                                                    rc2Var.i3(1);
                                                    rc2Var.q4 = null;
                                                    return true;
                                                } catch (Exception e5) {
                                                    e = e5;
                                                    fc4.g(e, z);
                                                    return false;
                                                }
                                            }
                                            rc2Var.i3(1);
                                            rc2Var.q4 = null;
                                        } else {
                                            m66 m66Var5 = rc2Var.r4;
                                            if (m66Var5 != null && characterStyle5 == (characterStyle = m66Var5.i)) {
                                                rc2Var.eb.M(rc2Var, characterStyle, false);
                                                rc2Var.i3(1);
                                                return true;
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e6) {
                                e = e6;
                                z = true;
                            }
                            return false;
                        }
                    }
                }
                rc2Var.i3(1);
                return false;
            }
            if (motionEvent.getAction() == 1) {
                rc2Var.s4 = null;
                rc2Var.f3();
                return false;
            }
        }
        return false;
    }

    public final void b(boolean z) {
        boolean z2;
        rc2 rc2Var = this.a;
        k47 k47Var = rc2Var.Q5;
        if (k47Var != null) {
            TLRPC.MessageMedia m1 = k47.m1(k47Var);
            if (m1 instanceof TLRPC.TL_messageMediaPoll) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) m1;
                byte b = 0;
                if (rc2Var.f7 != null) {
                    int min = Math.min(tL_messageMediaPoll.poll.answers.size(), rc2Var.f7.length);
                    z2 = false;
                    for (int i = 0; i < min; i++) {
                        CheckBoxBase checkBoxBase = rc2Var.f7[i];
                        if (checkBoxBase != null && checkBoxBase.q) {
                            z2 = true;
                        }
                    }
                } else {
                    z2 = false;
                }
                TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
                boolean z3 = rc2Var.W4;
                boolean z4 = (z3 || rc2Var.X4 || !this.w || pollResults == null || pollResults.total_voters == 0 || !tL_messageMediaPoll.poll.creator) ? false : true;
                boolean z5 = (z3 || rc2Var.X4 || this.x) ? false : true;
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                boolean z6 = poll.public_voters;
                CharSequence charSequence = null;
                if (this.t) {
                    charSequence = jb6.M0(2131746910, null);
                    b = 84;
                } else if (!z4 || (poll.multiple_choice && z5 && z2)) {
                    if (poll.multiple_choice && z5) {
                        charSequence = jb6.M0(2131746889, null);
                        b = 83;
                    } else if (!rc2Var.j6 && z6 && ((z3 && (!this.v || this.w)) || (rc2Var.X4 && pollResults.total_voters != 0))) {
                        charSequence = jb6.a0(null, null, 2131746838, Integer.valueOf(pollResults.total_voters));
                        b = 80;
                    }
                } else if (z6) {
                    charSequence = jb6.a0(null, null, 2131746838, Integer.valueOf(pollResults.total_voters));
                    b = 80;
                } else if (k47Var.M0) {
                    charSequence = gm.F2(jb6.M0(2131746844, null), false, -gm.L(2.6666667f), 0.0f, 1.0f, R.drawable.msg_mini_forumarrow);
                    b = 82;
                } else {
                    charSequence = gm.D2(jb6.G(pollResults.total_voters, "PollViewVotesAsAdmin", new Object[0]), false);
                    b = 81;
                }
                if (b != 0) {
                    if (this.k == null) {
                        og8 og8Var = new og8(rc2Var, rc2Var.cc);
                        this.k = og8Var;
                        og8Var.setCallback(rc2Var);
                        og8Var.a.setCallback(rc2Var);
                        og8Var.d.setCallback(rc2Var);
                    }
                    rc2Var.z2 = charSequence;
                    this.k.d.t(charSequence, z, true);
                    rc2Var.u2 = true;
                    rc2Var.y2 = b;
                    rc2Var.x0();
                }
                rc2Var.a0(z);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x019b, code lost:
    
        if (r13.i != r12[r17]) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x024b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0280 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0280 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(MotionEvent motionEvent) {
        Drawable drawable;
        rc2 rc2Var;
        boolean z;
        mc2 mc2Var;
        int i;
        kf8 kf8Var;
        int i2;
        int[] iArr;
        int i3;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        rc2 rc2Var2 = this.a;
        i66 i66Var = rc2Var2.u4;
        int[] iArr2 = rc2Var2.N2;
        int[] iArr3 = rc2Var2.L2;
        Drawable[] drawableArr = rc2Var2.J2;
        ArrayList arrayList = rc2Var2.Q4;
        k47 k47Var = rc2Var2.Q5;
        int i6 = 0;
        if (k47Var.T == 0 && (((!rc2Var2.Z4 && !rc2Var2.b5) || k47Var.C4()) && !arrayList.isEmpty())) {
            k47 k47Var2 = rc2Var2.Q5;
            if (k47Var2.D == 17 && k47Var2.p4()) {
                int x = (int) motionEvent.getX();
                int P1 = (int) rc2Var2.P1(motionEvent);
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() != 1) {
                        if (motionEvent.getAction() != 2) {
                            if (motionEvent.getAction() != 3) {
                                return false;
                            }
                            h();
                            return false;
                        }
                        if ((rc2Var2.i5 == -1 && !rc2Var2.q5) || (drawable = drawableArr[0]) == null) {
                            return false;
                        }
                        drawable.setHotspot(x, P1);
                        return false;
                    }
                    if (rc2Var2.t5 != -1) {
                        rc2Var2.playSoundEffect(0);
                        if (rc2Var2.Q5 != null && (mc2Var = rc2Var2.eb) != null && rc2Var2.t5 == 0) {
                            mc2Var.q2(rc2Var2);
                        }
                        rc2Var2.t5 = -1;
                        h();
                        return false;
                    }
                    if (rc2Var2.y5) {
                        rc2Var2.playSoundEffect(0);
                        rc2Var2.G0();
                        rc2Var2.y5 = false;
                        h();
                        return false;
                    }
                    if (rc2Var2.q5) {
                        rc2Var2.playSoundEffect(0);
                        rc2Var2.G0();
                        rc2Var2.q5 = false;
                        rc2Var2.t5 = -1;
                        h();
                        return false;
                    }
                    m66 m66Var = rc2Var2.r4;
                    if (m66Var != null) {
                        CharacterStyle characterStyle = m66Var.i;
                        if (characterStyle instanceof URLSpan) {
                            rc2Var2.eb.M(rc2Var2, characterStyle, false);
                        } else if (characterStyle instanceof ClickableSpan) {
                            ((ClickableSpan) characterStyle).onClick(rc2Var2);
                        }
                        rc2Var2.i3(4);
                        return false;
                    }
                    if (rc2Var2.i5 == -1) {
                        return false;
                    }
                    rc2Var2.playSoundEffect(0);
                    h();
                    if (this.F) {
                        qc2 qc2Var = (qc2) arrayList.get(rc2Var2.i5);
                        ImageReceiver imageReceiver = qc2Var.x.c;
                        TLRPC.PollAnswer pollAnswer = qc2Var.s;
                        TLRPC.MessageMedia messageMedia = pollAnswer.media;
                        motionEvent.getX();
                        motionEvent.getY();
                        int i7 = qc2Var.s.unshuffled_index;
                        mc2 mc2Var2 = rc2Var2.eb;
                        if (mc2Var2 != null) {
                            mc2Var2.m(rc2Var2, pollAnswer, messageMedia, i7);
                        }
                    } else if (rc2Var2.Q5.r1) {
                        Toast.makeText(rc2Var2.getContext(), jb6.M0(rc2Var2.Q5.C4() ? 2131748250 : 2131748248, null), 1).show();
                    } else {
                        qc2 qc2Var2 = (qc2) arrayList.get(rc2Var2.i5);
                        TLRPC.PollAnswer pollAnswer2 = qc2Var2.s;
                        if (rc2Var2.W4 || rc2Var2.X4) {
                            new ArrayList().add(pollAnswer2);
                            rc2Var2.eb.t0(rc2Var2, pollAnswer2);
                        } else {
                            if (this.x) {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(pollAnswer2);
                                rc2Var = rc2Var2;
                                rc2Var2.eb.b1(rc2Var, arrayList2, qc2Var2.j, gm.L(50.0f) + qc2Var2.a, rc2Var2.gb + qc2Var2.b);
                            } else {
                                TLRPC.Poll poll = rc2Var2.j5;
                                if (poll == null || !poll.multiple_choice) {
                                    int i8 = rc2Var2.i5;
                                    rc2Var2.d5 = i8;
                                    rc2Var2.Z4 = true;
                                    rc2Var2.h5 = 0.0f;
                                    rc2Var2.f5 = true;
                                    rc2Var2.e5 = 360.0f;
                                    rc2Var2.g5 = false;
                                    if (qc2Var2.t != null) {
                                        rc2Var2.P3(i8, true);
                                    } else {
                                        rc2Var2.a5 = true;
                                        ArrayList arrayList3 = new ArrayList();
                                        arrayList3.add(pollAnswer2);
                                        rc2Var = rc2Var2;
                                        rc2Var2.eb.b1(rc2Var, arrayList3, -1, 0, 0);
                                    }
                                } else {
                                    boolean contains = rc2Var2.Q5.x1.contains(pollAnswer2);
                                    k47 k47Var3 = rc2Var2.Q5;
                                    if (contains) {
                                        k47Var3.x1.remove(pollAnswer2);
                                        z = true;
                                        rc2Var2.f7[rc2Var2.i5].f(-1, false, true);
                                    } else {
                                        z = true;
                                        k47Var3.x1.add(pollAnswer2);
                                        rc2Var2.f7[rc2Var2.i5].f(-1, true, true);
                                    }
                                    b(z);
                                }
                            }
                            rc2Var2 = rc2Var;
                        }
                    }
                    rc2Var2.i5 = -1;
                    rc2Var2.invalidate();
                    return false;
                }
                rc2Var2.i5 = -1;
                rc2Var2.q5 = false;
                rc2Var2.t5 = -1;
                rc2Var2.y5 = false;
                rc2Var2.i3(4);
                int i9 = rc2Var2.w5;
                if (i9 != -1 && rc2Var2.x5 != -1 && Math.abs(x - i9) < gm.L(20.0f) && Math.abs(P1 - rc2Var2.x5) < gm.L(20.0f)) {
                    rc2Var2.y5 = true;
                    h();
                    rc2Var2.invalidate();
                    return true;
                }
                if (rc2Var2.r5 && (i4 = rc2Var2.o5) != -1 && x >= i4 && x <= gm.L(40.0f) + i4 && P1 >= (i5 = rc2Var2.p5) && P1 <= gm.L(40.0f) + i5) {
                    rc2Var2.q5 = true;
                    iArr3[0] = 3;
                    Drawable drawable2 = drawableArr[0];
                    if (drawable2 != null) {
                        drawable2.setBounds(rc2Var2.o5 - gm.L(8.0f), rc2Var2.p5 - gm.L(8.0f), gm.L(32.0f) + rc2Var2.o5, gm.L(32.0f) + rc2Var2.p5);
                        drawableArr[0].setHotspot(x, P1);
                        drawableArr[0].setState(iArr2);
                    }
                    h();
                    rc2Var2.invalidate();
                    return true;
                }
                if (rc2Var2.Q5.M0) {
                    h();
                    rc2Var2.invalidate();
                    return false;
                }
                h();
                int i10 = 0;
                boolean z4 = false;
                while (i10 < arrayList.size()) {
                    i = i6;
                    qc2 qc2Var3 = (qc2) arrayList.get(i10);
                    int L = (qc2Var3.b + rc2Var2.gb) - gm.L(13.0f);
                    StaticLayout staticLayout = qc2Var3.p;
                    if (staticLayout != null && (staticLayout.getText() instanceof Spannable)) {
                        float f = x;
                        float f2 = qc2Var3.m;
                        if (f >= f2) {
                            float f3 = P1;
                            float f4 = qc2Var3.n;
                            if (f3 >= f4 && !rc2Var2.Q5.t1) {
                                int i11 = x - ((int) f2);
                                int i12 = P1 - ((int) f4);
                                try {
                                } catch (Exception e) {
                                    e = e;
                                    iArr = iArr3;
                                }
                                if (i12 <= qc2Var3.p.getHeight()) {
                                    int lineForVertical = qc2Var3.p.getLineForVertical(i12);
                                    float f5 = i11;
                                    int offsetForHorizontal = qc2Var3.p.getOffsetForHorizontal(lineForVertical, f5);
                                    float lineLeft = qc2Var3.p.getLineLeft(lineForVertical);
                                    if (lineLeft <= f5 && lineLeft + qc2Var3.p.getLineWidth(lineForVertical) >= f5) {
                                        Spannable spannable = (Spannable) qc2Var3.p.getText();
                                        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                                        if (clickableSpanArr.length != 0 && ((!(clickableSpanArr[i] instanceof d6c) || d6c.h) && !gm.A1())) {
                                            m66 m66Var2 = rc2Var2.r4;
                                            if (m66Var2 != null) {
                                                iArr = iArr3;
                                                try {
                                                    z3 = z4;
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    z2 = true;
                                                    fc4.g(e, z2);
                                                    i3 = qc2Var3.a;
                                                    if (x >= i3) {
                                                        if (P1 > gm.L(26.0f) + L + qc2Var3.c) {
                                                        }
                                                    }
                                                    i10++;
                                                    i6 = i;
                                                    iArr3 = iArr;
                                                }
                                                try {
                                                } catch (Exception e3) {
                                                    e = e3;
                                                    z4 = z3;
                                                    z2 = true;
                                                    fc4.g(e, z2);
                                                    i3 = qc2Var3.a;
                                                    if (x >= i3) {
                                                    }
                                                    i10++;
                                                    i6 = i;
                                                    iArr3 = iArr;
                                                }
                                            } else {
                                                iArr = iArr3;
                                                z3 = z4;
                                            }
                                            i66Var.l(m66Var2, true);
                                            ClickableSpan clickableSpan = clickableSpanArr[i];
                                            ylb ylbVar = rc2Var2.cc;
                                            float[] fArr = rc2.Id;
                                            m66 m66Var3 = new m66(clickableSpan, ylbVar, f, f3, 0);
                                            rc2Var2.r4 = m66Var3;
                                            m66Var3.d(cmb.v0(rc2Var2.Q5.O3() ? cmb.Cc : cmb.Be, rc2Var2.cc));
                                            rc2Var2.y0 = i10;
                                            rc2Var2.v4 = 4;
                                            rc2Var2.u();
                                            try {
                                                b66 b = rc2Var2.r4.b();
                                                int[] Z1 = rc2.Z1(spannable, rc2Var2.r4.i);
                                                b.d(qc2Var3.p, Z1[i], 0.0f);
                                                qc2Var3.p.getSelectionPath(Z1[i], Z1[1], b);
                                            } catch (Exception e4) {
                                                fc4.g(e4, true);
                                            }
                                            i66Var.a(rc2Var2.r4, 4);
                                            try {
                                                rc2Var2.invalidate();
                                            } catch (Exception e5) {
                                                e = e5;
                                                z2 = true;
                                                z4 = true;
                                                fc4.g(e, z2);
                                                i3 = qc2Var3.a;
                                                if (x >= i3) {
                                                }
                                                i10++;
                                                i6 = i;
                                                iArr3 = iArr;
                                            }
                                            z4 = true;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    iArr = iArr3;
                    z4 = z4;
                    i3 = qc2Var3.a;
                    if (x >= i3 && x <= (i3 + rc2Var2.b7) - gm.L(31.0f) && P1 >= L) {
                        if (P1 > gm.L(26.0f) + L + qc2Var3.c) {
                            rc2Var2.i5 = i10;
                            yf8 yf8Var = qc2Var3.x;
                            boolean z5 = (yf8Var == null || !yf8Var.h || x <= (qc2Var3.a + rc2Var2.b7) - gm.L(81.0f)) ? i : 1;
                            this.F = z5;
                            if (z5 == 0) {
                                iArr[i] = 1;
                                qc2Var3.w.setHotspot(x, P1);
                                qc2Var3.w.setState(iArr2);
                                rc2Var2.invalidate();
                            }
                            z4 = true;
                            break;
                        }
                    }
                    i10++;
                    i6 = i;
                    iArr3 = iArr;
                }
                i = i6;
                if (!z4 && this.s && (kf8Var = this.l) != null) {
                    fg0 fg0Var = kf8Var.a;
                    if (kf8Var.getBounds().contains(x, P1)) {
                        fg0Var.setHotspot(x, P1);
                        fg0Var.setState(kf8Var.e);
                        i2 = i;
                    } else {
                        i2 = -1;
                    }
                    rc2Var2.t5 = i2;
                    if (i2 != -1) {
                        return true;
                    }
                }
                return z4;
            }
        }
        return false;
    }

    public final boolean d(MotionEvent motionEvent) {
        ag8 ag8Var;
        ag8 ag8Var2;
        rc2 rc2Var = this.a;
        k47 k47Var = rc2Var.Q5;
        if (k47Var != null && k47Var.D == 17 && !k47Var.n4()) {
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int P1 = (int) rc2Var.P1(motionEvent);
            ag8 ag8Var3 = this.m;
            if (ag8Var3 != null) {
                if (ag8Var3.Y && ag8Var3.a.f && ag8Var3.L.e(x - ag8Var3.M, P1 - ag8Var3.N, action)) {
                    if (action == 0) {
                        rc2Var.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    rc2Var.g1 = true;
                    rc2Var.invalidate();
                    return true;
                }
                ag8 ag8Var4 = this.m;
                if ((ag8Var4.Y || ag8Var4.X) && ag8Var4.k(x, P1, action)) {
                    rc2Var.g1 = true;
                    rc2Var.invalidate();
                    return true;
                }
            }
            if (rc2Var.Q5.L0 && (ag8Var2 = this.n) != null) {
                if (ag8Var2.Y && ag8Var2.a.f && ag8Var2.L.e(x - ag8Var2.M, P1 - ag8Var2.N, action)) {
                    if (action == 0) {
                        rc2Var.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    rc2Var.g1 = true;
                    rc2Var.invalidate();
                    return true;
                }
                ag8 ag8Var5 = this.n;
                if ((ag8Var5.Y || ag8Var5.X) && ag8Var5.k(x, P1, action)) {
                    rc2Var.g1 = true;
                    rc2Var.invalidate();
                    return true;
                }
            }
            if (action == 0) {
                this.G = (byte) -1;
                ag8 ag8Var6 = this.m;
                if (ag8Var6 != null && ag8Var6.T && ag8Var6.getBounds().contains(x, P1)) {
                    this.G = (byte) -2;
                    rc2Var.invalidate();
                    return true;
                }
                if (rc2Var.Q5.L0 && (ag8Var = this.n) != null && ag8Var.T && ag8Var.getBounds().contains(x, P1)) {
                    this.G = (byte) -3;
                    rc2Var.invalidate();
                    return true;
                }
            } else if (action == 2) {
                if (this.G != -1) {
                    return true;
                }
            } else if (action == 1 && this.G != -1) {
                rc2Var.playSoundEffect(0);
                byte b = this.G;
                if (b == -2) {
                    ag8 ag8Var7 = this.m;
                    ImageReceiver imageReceiver = ag8Var7.b;
                    TLRPC.MessageMedia messageMedia = ag8Var7.U;
                    mc2 mc2Var = rc2Var.eb;
                    if (mc2Var != null) {
                        mc2Var.m(rc2Var, null, messageMedia, -2);
                    }
                } else if (b == -3) {
                    ag8 ag8Var8 = this.n;
                    ImageReceiver imageReceiver2 = ag8Var8.b;
                    TLRPC.MessageMedia messageMedia2 = ag8Var8.U;
                    mc2 mc2Var2 = rc2Var.eb;
                    if (mc2Var2 != null) {
                        mc2Var2.m(rc2Var, null, messageMedia2, -3);
                    }
                }
                this.G = (byte) -1;
                rc2Var.invalidate();
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(int i) {
        rc2 rc2Var = this.a;
        CheckBoxBase[] checkBoxBaseArr = rc2Var.f7;
        if (checkBoxBaseArr != null) {
            if (checkBoxBaseArr.length != i) {
                int i2 = 0;
                while (true) {
                    CheckBoxBase[] checkBoxBaseArr2 = rc2Var.f7;
                    if (i2 >= checkBoxBaseArr2.length) {
                        break;
                    }
                    checkBoxBaseArr2[i2].l = false;
                    i2++;
                }
            }
            if (this.I != null) {
                this.I = new jd0(rc2Var.a6, rc2Var, gm.L(16.0f), gm.L(7.0f), gm.N(1.0f));
                return;
            }
            return;
        }
        rc2Var.f7 = new CheckBoxBase[i];
        int i3 = 0;
        while (true) {
            CheckBoxBase[] checkBoxBaseArr3 = rc2Var.f7;
            if (i3 >= checkBoxBaseArr3.length) {
                break;
            }
            checkBoxBaseArr3[i3] = new CheckBoxBase(20, rc2Var.cc, rc2Var);
            rc2Var.f7[i3].k(false);
            rc2Var.f7[i3].j(true);
            rc2Var.f7[i3].d(9);
            i3++;
        }
        if (this.I != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x06fb, code lost:
    
        if (r64.y != r3) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x10c7, code lost:
    
        if (r42 == false) goto L646;
     */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0cf5  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0d7e  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0e52  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0ea7  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0ec2  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x1029  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x1039  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x1066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:467:0x107d  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x108f  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x109b  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x10cb  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x10db  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x10f0  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x1100  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x111b  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x112b  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x113e  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x1146  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x116c  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x11cc  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x116f  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x112e  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x1121  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x1103  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x10f4  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x10bb  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x1092  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x1080  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x104e  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0f9f  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x0e69  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x0e1f  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x0d76  */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(Canvas canvas) {
        int a2;
        int a22;
        int a23;
        float f;
        float f2;
        int i;
        int i2;
        float f3;
        float L;
        int i3;
        int i4;
        long j;
        int i5;
        rc2 rc2Var;
        Drawable[] drawableArr;
        RectF rectF;
        int i6;
        float f4;
        yc2 yc2Var;
        ArrayList arrayList;
        int[] iArr;
        int i7;
        int i8;
        int i9;
        float f5;
        float f6;
        ?? r12;
        float f7;
        int i10;
        int i11;
        int i12;
        float f8;
        int i13;
        long j2;
        float f9;
        int i14;
        int i15;
        int i16;
        int i17;
        float f10;
        float f11;
        m37 m37Var;
        og8 og8Var;
        ho hoVar;
        byte[] bArr;
        TLRPC.PollAnswer pollAnswer;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        float f12;
        int i24;
        int i25;
        int i26;
        float f13;
        long j3;
        ArrayList arrayList2;
        int i27;
        int i28;
        Canvas canvas2;
        int i29;
        RectF rectF2;
        int i30;
        int i31;
        Canvas canvas3;
        int i32;
        int i33;
        int i34;
        float f14;
        int i35;
        StaticLayout staticLayout;
        TLRPC.Poll poll;
        CheckBoxBase checkBoxBase;
        yf8 yf8Var;
        CheckBoxBase checkBoxBase2;
        byte[] bArr2;
        int i36;
        TLRPC.Poll poll2;
        float f15;
        float L2;
        int extraTextX;
        float f16;
        float f17;
        Canvas canvas4 = canvas;
        rc2 rc2Var2 = this.a;
        ArrayList arrayList3 = rc2Var2.Q4;
        int[] iArr2 = rc2Var2.L2;
        Drawable[] drawableArr2 = rc2Var2.J2;
        RectF rectF3 = rc2Var2.c4;
        yc2 yc2Var2 = rc2Var2.ub;
        long currentTimeMillis = System.currentTimeMillis();
        long j4 = currentTimeMillis - this.D;
        if (j4 > 17) {
            j4 = 17;
        }
        this.D = currentTimeMillis;
        if (rc2Var2.Q5.O3()) {
            a2 = rc2Var2.a2(cmb.Vc);
            a22 = rc2Var2.a2(rc2Var2.A2() ? cmb.dc : cmb.ic);
            a23 = rc2Var2.a2(cmb.Xc);
        } else {
            a2 = rc2Var2.a2(cmb.Uc);
            a22 = rc2Var2.a2(rc2Var2.A2() ? cmb.ee : cmb.de);
            a23 = rc2Var2.a2(cmb.Wc);
        }
        cmb.N2.setColor(a2);
        TextPaint textPaint = cmb.O2;
        textPaint.linkColor = a23;
        textPaint.setColor(a2);
        cmb.L2.setColor(a2);
        cmb.S2.setColor(a22);
        cmb.E2.setColor(a22);
        cmb.H2.setColor(a22);
        canvas4.save();
        int i37 = rc2Var2.Q5.L0 ? this.g : 0;
        if (yc2Var2.i3) {
            float f18 = i37;
            f = gm.R1(yc2Var2.h3 ? this.g : 0.0f, f18, yc2Var2.L1);
            float f19 = f - f18;
            canvas4.translate(0.0f, f19);
            f2 = f19;
        } else {
            f = i37;
            f2 = 0.0f;
        }
        float f20 = f2;
        if (yc2Var2.G2) {
            int i38 = rc2Var2.gb;
            i = a2;
            i2 = a22;
            f3 = 0.0f;
            canvas4.translate(0.0f, gm.U1(yc2Var2.L1, yc2Var2.H2, i38) + (-i38));
        } else {
            i = a2;
            i2 = a22;
            if (yc2Var2.u2) {
                float f21 = rc2Var2.gb;
                float f22 = yc2Var2.L1;
                float A = td4.A(1.0f, f22, yc2Var2.v2, f21 * f22);
                if (rc2Var2.Q5.m5()) {
                    A -= rc2Var2.gb;
                }
                f3 = 0.0f;
                canvas4.translate(0.0f, A);
            } else {
                f3 = 0.0f;
            }
        }
        if (yc2Var2.x0) {
            canvas4.translate(f3, yc2Var2.k0);
        }
        if (rc2Var2.Q5.O3()) {
            L = gm.L(11.0f) + (rc2Var2.d7 - rc2Var2.b7);
        } else {
            L = rc2Var2.Y6 ? gm.L(91.0f) : rc2Var2.b3() ? gm.L(68.0f) : gm.L(20.0f);
        }
        boolean z = yc2Var2.x0;
        if (z) {
            L += yc2Var2.h0;
        }
        float f23 = L;
        float f24 = rc2Var2.b7;
        if (z) {
            f24 += yc2Var2.i0 - yc2Var2.h0;
        }
        float f25 = f24;
        int L3 = (int) (f23 - gm.L(9.0f));
        float f26 = f23 + f25;
        int L4 = (int) (f26 - gm.L(22.0f));
        if (f > gm.L(8.0f)) {
            if (rc2Var2.n8 == null) {
                rc2Var2.n8 = new p99(rc2Var2);
            }
            RectF rectF4 = gm.P;
            rectF4.set(0.0f, gm.L(5.0f), f25 - gm.L(33.0f), f - gm.L(3.0f));
            rectF4.offset(f23 + gm.L(1.0f), ((((gm.L(10.0f) + rc2Var2.gb) + this.q) + rc2Var2.u3) + i37) - f);
            rc2Var2.n8.a(rc2Var2.Q5, rc2Var2.va, rc2Var2.wa, rc2Var2.cc, 3);
            int i39 = a23;
            i5 = i37;
            int i40 = i2;
            iArr = iArr2;
            drawableArr = drawableArr2;
            i4 = L4;
            j = j4;
            int i41 = i;
            rc2Var2.n8.d(canvas, rectF4, 5.0f, 5.0f, 5.0f, 1.0f, true, false);
            canvas4 = canvas;
            rc2Var2.n8.f(canvas4, rectF4, 1.0f);
            if (rc2Var2.q3 != null) {
                int color = cmb.Z2.getColor();
                cmb.Z2.setColor(i41);
                canvas4.save();
                canvas4.clipRect(rectF4);
                ag8 ag8Var = this.n;
                if (ag8Var != null && ag8Var.T) {
                    int L5 = gm.L(10.0f) + ((int) rectF4.left);
                    int L6 = (((int) (rectF4.top + (this.g - gm.L(8.0f)))) - this.f) - gm.L(8.0f);
                    this.n.setBounds(L5, L6, this.e + L5, this.f + L6);
                    this.n.b(rc2Var2.Q5.N3());
                    ag8 ag8Var2 = this.n;
                    rc2Var2.a2(rc2Var2.Q5.N3() ? cmb.Dc : cmb.Ye);
                    uib uibVar = ag8Var2.r;
                    if (uibVar != null) {
                        uibVar.m(i41);
                    }
                    uib uibVar2 = ag8Var2.s;
                    if (uibVar2 != null) {
                        uibVar2.m(i40);
                    }
                    this.n.draw(canvas4);
                }
                if (this.c != null) {
                    int color2 = cmb.X2.getColor();
                    cmb.X2.setColor(rc2Var2.n8.h());
                    canvas4.save();
                    canvas4.translate(rectF4.left + gm.L(10.0f), rectF4.top + gm.L(6.0f));
                    this.c.draw(canvas4);
                    canvas4.restore();
                    cmb.X2.setColor(color2);
                    if (this.h != null) {
                        if (this.i != rc2Var2.n8.h()) {
                            this.i = rc2Var2.n8.h();
                            this.h.setColorFilter(new PorterDuffColorFilter(this.i, PorterDuff.Mode.SRC_IN));
                        }
                        rc2Var2.w5 = ((int) rectF4.right) - gm.L(16.33f);
                        rc2Var2.x5 = gm.L(16.33f) + ((int) rectF4.top);
                        canvas4.save();
                        canvas4.scale(0.85f, 0.85f, rc2Var2.w5, rc2Var2.x5);
                        int A2 = aq1.A(2, rc2Var2.w5, this.h);
                        int y = aq1.y(2, rc2Var2.x5, this.h);
                        Drawable drawable = this.h;
                        drawable.setBounds(A2, y, drawable.getIntrinsicWidth() + A2, this.h.getIntrinsicHeight() + y);
                        this.h.draw(canvas4);
                        canvas4.restore();
                    }
                }
                cmb.a3.setColor(cmb.Z2.getColor());
                cmb.a3.linkColor = i39;
                float L7 = rectF4.left + gm.L(10.0f);
                rc2Var2.u5 = L7;
                float L8 = rectF4.top + gm.L(25.0f);
                rc2Var2.v5 = L8;
                i47 i47Var = rc2Var2.q3;
                i6 = i40;
                i3 = L3;
                rectF = rectF3;
                yc2Var = yc2Var2;
                i = i41;
                f4 = 1.0f;
                arrayList = arrayList3;
                rc2Var2.f1(L7, L8, canvas, i47Var.e, i47Var.d, true, 1.0f, true, false, false, true);
                float L9 = rectF4.left + gm.L(10.0f);
                float L10 = rectF4.top + gm.L(25.0f);
                i47 i47Var2 = rc2Var2.q3;
                rc2Var2.I0(L9, L10, canvas, i47Var2.e, rc2Var2.Qa, true, 1.0f, i47Var2.d, true);
                rc2Var = rc2Var2;
                canvas4 = canvas;
                canvas4.restore();
                cmb.Z2.setColor(color);
            } else {
                f4 = 1.0f;
                i6 = i40;
                i3 = L3;
                rectF = rectF3;
                yc2Var = yc2Var2;
                i = i41;
                arrayList = arrayList3;
                rc2Var = rc2Var2;
            }
        } else {
            i3 = L3;
            i4 = L4;
            j = j4;
            i5 = i37;
            rc2Var = rc2Var2;
            drawableArr = drawableArr2;
            rectF = rectF3;
            i6 = i2;
            f4 = 1.0f;
            yc2Var = yc2Var2;
            arrayList = arrayList3;
            iArr = iArr2;
        }
        if (rc2Var.o2 != null) {
            canvas4.save();
            canvas4.translate(f23 + rc2Var.getExtraTextX(), gm.L(15.0f) + rc2Var.gb + this.q + rc2Var.u3 + i5);
            int alpha = cmb.N2.getAlpha();
            if (yc2Var.l3 != null) {
                cmb.N2.setAlpha((int) (yc2Var.L1 * alpha));
            }
            rc2Var.o2.draw(canvas4);
            StaticLayout staticLayout2 = rc2Var.o2;
            gn.drawAnimatedEmojis(canvas4, staticLayout2, rc2Var.Pa, 0.0f, null, 0.0f, 0.0f, 0.0f, yc2Var.l3 != null ? yc2Var.L1 : f4, rc2Var.L1(1, staticLayout2.getPaint().getColor()));
            if (yc2Var.l3 != null) {
                cmb.N2.setAlpha(alpha);
            }
            int height = rc2Var.o2.getHeight();
            if (yc2Var.l3 != null) {
                cmb.N2.setAlpha((int) ((f4 - yc2Var.L1) * alpha));
                yc2Var.l3.draw(canvas4);
                cmb.N2.setAlpha(alpha);
                StaticLayout staticLayout3 = yc2Var.l3;
                gn.drawAnimatedEmojis(canvas4, staticLayout3, yc2Var.m3, 0.0f, null, 0.0f, 0.0f, 0.0f, f4 - yc2Var.L1, rc2Var.L1(1, staticLayout3.getPaint().getColor()));
                i7 = gm.U1(yc2Var.L1, yc2Var.l3.getHeight(), height);
            } else {
                i7 = height;
            }
            canvas4.restore();
        } else {
            i7 = 0;
        }
        ag8 ag8Var3 = this.m;
        if (ag8Var3 == null || !ag8Var3.T) {
            i8 = i6;
            i9 = i;
            f5 = f23;
        } else {
            int L11 = (gm.L(rc2Var.gb > 0 ? 11.0f : 5.0f) + rc2Var.gb) - ((int) f20);
            f5 = f23;
            int L12 = gm.L(2.0f) + (((int) f5) - gm.L(9.0f));
            this.m.setBounds(L12, L11, this.o + L12, this.p + L11);
            this.m.b(rc2Var.Q5.N3());
            ag8 ag8Var4 = this.m;
            rc2Var.a2(rc2Var.Q5.N3() ? cmb.Dc : cmb.Ye);
            uib uibVar3 = ag8Var4.r;
            i9 = i;
            if (uibVar3 != null) {
                uibVar3.m(i9);
            }
            uib uibVar4 = ag8Var4.s;
            i8 = i6;
            if (uibVar4 != null) {
                uibVar4.m(i8);
            }
            this.m.draw(canvas4);
        }
        int L13 = gm.L(20.0f) + i7 + rc2Var.gb + this.q + rc2Var.u3 + i5;
        if (rc2Var.e3 != null) {
            canvas4.save();
            canvas4.translate(rc2Var.g3 + f5 + rc2Var.getExtraTextX(), L13);
            rc2Var.e3.draw(canvas4);
            canvas4.restore();
            TLRPC.MessageMedia n1 = k47.n1(rc2Var.Q5.k);
            if (n1 instanceof TLRPC.TL_messageMediaPoll) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) n1;
                if (!tL_messageMediaPoll.poll.quiz || (!(rc2Var.W4 || rc2Var.X4 || rc2Var.Y4 || (this.x && (!this.v || this.w))) || TextUtils.isEmpty(tL_messageMediaPoll.results.solution))) {
                    f6 = 2.0f;
                    f7 = 0.3f;
                    i10 = 2;
                    rc2Var.o5 = -1;
                } else {
                    Drawable b2 = rc2Var.b2(rc2Var.Q5.O3() ? "drawable_chat_pollHintDrawableOut" : "drawable_chat_pollHintDrawableIn");
                    if (rc2Var.Z4) {
                        b2.setAlpha((int) (this.r * 255.0f));
                    } else {
                        b2.setAlpha(nm7.d4);
                    }
                    rc2Var.o5 = (int) (((f26 - gm.L(23.0f)) - b2.getIntrinsicWidth()) - gm.L(8.0f));
                    rc2Var.p5 = L13 - gm.L(6.0f);
                    int w = aq1.w(2, rc2Var.o5, b2);
                    f7 = 0.3f;
                    int i42 = aq1.i(2, rc2Var.p5, b2);
                    i10 = 2;
                    if (rc2Var.r5) {
                        float f27 = rc2Var.s5;
                        if (f27 < f4) {
                            f6 = 2.0f;
                            f17 = so.a.getInterpolation(f27);
                            int intrinsicWidth = ((int) (b2.getIntrinsicWidth() * f17)) / 2;
                            int intrinsicHeight = ((int) (b2.getIntrinsicHeight() * f17)) / 2;
                            b2.setBounds(w - intrinsicWidth, i42 - intrinsicHeight, w + intrinsicWidth, i42 + intrinsicHeight);
                            b2.draw(canvas4);
                        }
                    }
                    f6 = 2.0f;
                    f17 = rc2Var.s5;
                    int intrinsicWidth2 = ((int) (b2.getIntrinsicWidth() * f17)) / 2;
                    int intrinsicHeight2 = ((int) (b2.getIntrinsicHeight() * f17)) / 2;
                    b2.setBounds(w - intrinsicWidth2, i42 - intrinsicHeight2, w + intrinsicWidth2, i42 + intrinsicHeight2);
                    b2.draw(canvas4);
                }
            } else {
                f6 = 2.0f;
                f7 = 0.3f;
                i10 = 2;
                rc2Var.o5 = -1;
            }
            if (this.I == null || rc2Var.j6) {
                r12 = 0;
            } else {
                r12 = 0;
                int ceil = (int) Math.ceil(rc2Var.e3.getLineLeft(0));
                int i43 = rc2Var.g3;
                if (i43 == 0 && ceil == 0) {
                    f16 = ((int) Math.ceil(rc2Var.e3.getLineWidth(0))) + f5 + gm.L(7.0f) + rc2Var.getExtraTextX();
                } else {
                    if (i43 != 0) {
                        L2 = (i43 + f5) - gm.L(23.0f);
                        extraTextX = rc2Var.getExtraTextX();
                    } else {
                        L2 = (ceil + f5) - gm.L(23.0f);
                        extraTextX = rc2Var.getExtraTextX();
                    }
                    f16 = L2 - extraTextX;
                }
                if (rc2Var.c5 && this.C) {
                    jd0 jd0Var = this.I;
                    boolean z2 = rc2Var.b5;
                    float f28 = this.r;
                    if (z2) {
                        f28 = (f4 - f28) / f7;
                    }
                    jd0Var.setAlpha((int) (pqe.a(f28, 0.0f, f4) * 255.0f));
                } else {
                    this.I.setAlpha(nm7.d4);
                }
                this.I.setBounds((int) f16, L13 - gm.L(1.0f), (int) (this.I.c.d.f.a + f16), gm.L(16.0f) + (L13 - gm.L(1.0f)));
                jd0 jd0Var2 = this.I;
                Paint paint = rc2Var.L6.c;
                jd0Var2.c(canvas4);
            }
        } else {
            f6 = 2.0f;
            r12 = 0;
            f7 = 0.3f;
            i10 = 2;
        }
        if (((rc2Var.X4 || rc2Var.W4 || rc2Var.Y4) && !rc2Var.Z4) || (poll2 = rc2Var.j5) == null || !poll2.quiz || poll2.close_period == 0 || !rc2Var.j6) {
            i11 = i9;
            i12 = i8;
            f8 = 13.0f;
            i13 = -1;
            j2 = j;
        } else {
            i12 = i8;
            long max = Math.max(0L, (rc2Var.j5.close_date * 1000) - ConnectionsManager.getInstance(rc2Var.a6).getCurrentTimeMillis());
            i11 = i9;
            if (this.z != null) {
                f15 = 1000.0f;
            } else {
                f15 = 1000.0f;
            }
            this.z = gm.h0((int) Math.ceil(max / f15), r12);
            this.A = (int) Math.ceil(cmb.S2.measureText(r6));
            this.y = max;
            if (max <= 0 && !rc2Var.X4) {
                if (rc2Var.Q5.w0 + 1000 < SystemClock.elapsedRealtime()) {
                    rc2Var.Q5.w0 = 0L;
                }
                rc2Var.eb.g2();
            }
            int L14 = (rc2Var.L6.getBounds().right - this.A) - gm.L(rc2Var.Q5.O3() ? 40.0f : 34.0f);
            if (max <= 5000) {
                cmb.S2.setColor(rc2Var.a2(rc2Var.Q5.O3() ? cmb.ga : cmb.fa));
            }
            if (this.B) {
                cmb.S2.setAlpha((int) ((1.0f - this.r) * 255.0f));
            }
            float f29 = f15;
            canvas4.drawText(this.z, L14, gm.L(11.0f) + L13, cmb.S2);
            cmb.Y1.setColor(cmb.S2.getColor());
            int v = hg9.v(13.0f, this.A, L14);
            int L15 = gm.L(5.1f);
            int L16 = gm.L(6.0f) + L13;
            if (max <= 60000) {
                f8 = 13.0f;
                RectF rectF5 = rectF;
                rectF5.set(v - L15, L16 - L15, v + L15, L15 + L16);
                float min = (max / (Math.min(60, rc2Var.j5.close_period) * f29)) * (-360.0f);
                i13 = -1;
                canvas4.drawArc(rectF5, -90.0f, min, false, cmb.Y1);
                rc2Var.m5.a(min, rc2Var.Z4 ? 1.0f - this.r : 1.0f, canvas, cmb.Y1, rectF5);
                canvas4 = canvas;
                rectF = rectF5;
            } else {
                f8 = 13.0f;
                i13 = -1;
                canvas4.drawCircle(v, L16, L15, cmb.Y1);
            }
            if (max > 60000 || this.H != 0.0f) {
                cmb.Y1.setAlpha((int) (this.H * 255.0f));
                float f30 = v;
                canvas4.drawLine(f30 - (gm.L(2.1f) * this.H), L16 - gm.L(7.5f), (gm.L(2.1f) * this.H) + f30, L16 - gm.L(7.5f), cmb.Y1);
                float f31 = L16;
                canvas4 = canvas;
                canvas4.drawLine(f30, f31 - (gm.L(3.0f) * this.H), f30, f31, cmb.Y1);
                if (max <= 60000) {
                    j2 = j;
                    float f32 = this.H - (j2 / 180.0f);
                    this.H = f32;
                    if (f32 < 0.0f) {
                        this.H = 0.0f;
                    }
                    rc2Var.invalidate();
                }
            }
            j2 = j;
            rc2Var.invalidate();
        }
        if (drawableArr[r12] != null && ((i36 = iArr[r12]) == 1 || i36 == 3)) {
            if (i36 == 3) {
                canvas4.save();
                float f33 = rc2Var.s5;
                canvas4.scale(f33, f33, drawableArr[r12].getBounds().centerX(), drawableArr[r12].getBounds().centerY());
            }
            drawableArr[r12].draw(canvas4);
            if (iArr[r12] == 3) {
                canvas4.restore();
            }
        }
        boolean C4 = rc2Var.Q5.C4();
        TLRPC.Poll poll3 = rc2Var.j5;
        boolean z3 = (poll3 == null || !poll3.multiple_choice) ? r12 : true;
        boolean z4 = (C4 && rc2Var.Q5.q()) ? true : r12;
        boolean z5 = (rc2Var.W4 && !this.w && this.v) ? true : r12;
        if (!this.C || z5) {
            f9 = 255.0f;
        } else {
            boolean z6 = rc2Var.b5;
            float f34 = this.r;
            if (z6) {
                f34 = 1.0f - f34;
            }
            f9 = Math.min(f34 / f7, 1.0f) * 255.0f;
        }
        int i44 = (int) f9;
        int max2 = Math.max(rc2Var.S4, (int) r12);
        while (true) {
            int i45 = rc2Var.T4;
            if (i45 == i13) {
                i45 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            }
            if (max2 > Math.min(i45, arrayList.size() - 1)) {
                break;
            }
            ArrayList arrayList4 = arrayList;
            qc2 qc2Var = (qc2) arrayList4.get(max2);
            qc2Var.a = (int) f5;
            int i46 = qc2Var.b;
            int i47 = qc2Var.c;
            if (qc2Var.A != null) {
                i46 = gm.U1(yc2Var.L1, qc2Var.C, i46);
                i47 = gm.U1(yc2Var.L1, qc2Var.D, i47);
            }
            int i48 = i47;
            TLRPC.TodoItem todoItem = qc2Var.t;
            if ((todoItem == null || todoItem.id != rc2Var.c6) && (((bArr = rc2Var.e6) == null || Arrays.equals(qc2Var.s.option, bArr)) && ((pollAnswer = qc2Var.s) == null || (bArr2 = pollAnswer.option) == null || !Arrays.equals(bArr2, rc2Var.d6)))) {
                canvas4.save();
                int i49 = i12;
                int p1 = cmb.p1(0.12f, i49);
                if (qc2Var.v != p1) {
                    fg0 fg0Var = qc2Var.w;
                    qc2Var.v = p1;
                    i18 = i44;
                    cmb.F1(fg0Var, p1, false);
                } else {
                    i18 = i44;
                }
                long j5 = j2;
                qc2Var.w.setBounds((int) (f5 - gm.L(8.0f)), (rc2Var.gb + i46) - gm.L(f8), (int) (f26 - gm.L(23.0f)), gm.L(f8) + rc2Var.gb + i46 + i48);
                qc2Var.w.draw(canvas4);
                canvas4.restore();
                yf8 yf8Var2 = qc2Var.x;
                if (yf8Var2 != null) {
                    i19 = i3;
                    i21 = i4;
                    yf8Var2.setBounds(i19, (rc2Var.gb + i46) - gm.L(f8), i21, gm.L(f8) + rc2Var.gb + i46 + i48);
                    i20 = i11;
                    qc2Var.x.k(i20);
                    yf8 yf8Var3 = qc2Var.x;
                    Paint paint2 = rc2Var.L6.c;
                    yf8Var3.c(canvas4);
                } else {
                    i19 = i3;
                    i20 = i11;
                    i21 = i4;
                }
                canvas4.save();
                qc2Var.m = gm.L(z4 ? 48.0f : 35.0f) + f5;
                qc2Var.n = rc2Var.gb + i46;
                canvas4.translate(gm.L(z4 ? 48.0f : 35.0f) + f5, i46 + rc2Var.gb);
                if (yc2Var.x0) {
                    canvas4.translate(0.0f, yc2Var.k0);
                }
                int alpha2 = cmb.O2.getAlpha();
                if (qc2Var.A != null) {
                    i22 = alpha2;
                    cmb.O2.setAlpha((int) (alpha2 * yc2Var.L1));
                } else {
                    i22 = alpha2;
                }
                canvas4.save();
                if (C4 && z4 && qc2Var.q != null && (checkBoxBase2 = rc2Var.f7[max2]) != null) {
                    float progress = checkBoxBase2.getProgress();
                    canvas4.translate(0.0f, (-gm.L(7.66f)) * progress);
                    qc2Var.n = ((-gm.L(7.66f)) * progress) + qc2Var.n;
                }
                if (max2 == rc2Var.y0 && rc2Var.u4.h(canvas4, 4)) {
                    rc2Var.invalidate();
                }
                if (qc2Var.o && (yf8Var = qc2Var.x) != null) {
                    canvas4.translate(-yf8Var.d(gm.L(7.0f)), 0.0f);
                }
                qc2Var.p.draw(canvas4);
                StaticLayout staticLayout4 = qc2Var.p;
                cn cnVar = qc2Var.r;
                if (qc2Var.A != null) {
                    int i50 = i20;
                    f12 = yc2Var.L1;
                    i23 = i50;
                } else {
                    i23 = i20;
                    f12 = 1.0f;
                }
                i24 = max2;
                i25 = i23;
                i26 = i21;
                f13 = f5;
                int i51 = i22;
                j3 = j5;
                arrayList2 = arrayList4;
                i27 = i19;
                i28 = i18;
                gn.drawAnimatedEmojis(canvas, staticLayout4, cnVar, 0.0f, null, 0.0f, 0.0f, 0.0f, f12, rc2Var.L1(1, staticLayout4.getPaint().getColor()));
                if (qc2Var.A != null) {
                    cmb.O2.setAlpha((int) ((1.0f - yc2Var.L1) * i51));
                    qc2Var.A.draw(canvas);
                    StaticLayout staticLayout5 = qc2Var.A;
                    gn.drawAnimatedEmojis(canvas, staticLayout5, qc2Var.B, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f - yc2Var.L1, rc2Var.L1(1, staticLayout5.getPaint().getColor()));
                    cmb.O2.setAlpha(i51);
                }
                canvas.restore();
                if (C4 && z4 && qc2Var.q != null && (checkBoxBase = rc2Var.f7[i24]) != null) {
                    float progress2 = checkBoxBase.getProgress();
                    if (progress2 > 0.0f) {
                        uib uibVar5 = qc2Var.q;
                        uibVar5.p = f25 - gm.L(8.0f);
                        uibVar5.c(0.0f, (qc2Var.q.h() / f6) + (qc2Var.p.getHeight() - gm.L(6.0f)), progress2, i49, canvas);
                        i29 = i49;
                        canvas2 = canvas;
                        cmb.O2.setAlpha(i51);
                        if (!C4 || ((!rc2Var.W4 || (!this.w && this.v)) && !rc2Var.X4 && !rc2Var.Y4 && ((!this.x || (this.v && !this.w)) && (!this.C || z5)))) {
                            rectF2 = rectF;
                            i30 = 2;
                        } else {
                            TLRPC.Poll poll4 = rc2Var.j5;
                            if (poll4 == null || !poll4.quiz) {
                                cmb.R1.setColor(rc2Var.a2(rc2Var.Q5.O3() ? cmb.pc : cmb.ne));
                            } else {
                                boolean z7 = qc2Var.l;
                                k47 k47Var = rc2Var.Q5;
                                int i52 = z7 ? k47Var.O3() ? cmb.ea : cmb.da : k47Var.O3() ? cmb.ga : cmb.fa;
                                if (!rc2Var.L6.l() || cmb.d1(i52)) {
                                    cmb.R1.setColor(rc2Var.a2(i52));
                                } else {
                                    cmb.R1.setColor(rc2Var.a2(rc2Var.Q5.O3() ? cmb.pc : cmb.ne));
                                }
                            }
                            if (this.C && !z5) {
                                float f35 = i28;
                                cmb.L2.setAlpha((int) ((cmb.L2.getAlpha() / 255.0f) * f35));
                                cmb.R1.setAlpha((int) (f35 * (cmb.R1.getAlpha() / 255.0f)));
                            }
                            boolean z8 = qc2Var.i || qc2Var.k || ((poll = rc2Var.j5) != null && poll.quiz && qc2Var.l && (rc2Var.W4 || rc2Var.X4 || rc2Var.Y4 || (this.x && (!this.v || this.w))));
                            int i53 = qc2Var.f;
                            String format = String.format("%d%%", Integer.valueOf(pqe.b((int) Math.ceil(((qc2Var.d - i53) * this.r) + i53), 0, 100)));
                            float ceil2 = (-gm.L(6.5f)) - ((int) Math.ceil(cmb.L2.measureText(format)));
                            float L17 = gm.L(14.0f);
                            if (!z8 || (staticLayout = qc2Var.p) == null) {
                                i34 = 2;
                            } else {
                                i34 = 2;
                                if (staticLayout.getLineCount() < 2) {
                                    f14 = rc2Var.U4;
                                    canvas2.drawText(format, ceil2, L17 + f14, cmb.L2);
                                    int L18 = rc2Var.b7 - gm.L(76.0f);
                                    float f36 = qc2Var.h;
                                    float f37 = ((qc2Var.g - f36) * this.r) + f36;
                                    if (z5) {
                                        int color3 = cmb.R1.getColor();
                                        int alpha3 = Color.alpha(color3);
                                        float L19 = L18 - (this.u ? gm.L(37.33f) : 0);
                                        i35 = i25;
                                        cmb.R1.setColor(on2.p(i35, (alpha3 << 4) / nm7.d4));
                                        float f38 = f37 * L19;
                                        i30 = i34;
                                        rectF2 = rectF;
                                        rectF2.set(Math.max(f38 - gm.L(f6), 0.0f), gm.L(6.0f) + i48, L19, gm.L(11.0f) + i48);
                                        canvas2.drawRoundRect(rectF2, gm.L(f6), gm.L(f6), cmb.R1);
                                        cmb.R1.setColor(color3);
                                        rectF2.set(0.0f, gm.L(6.0f) + i48, f38, gm.L(11.0f) + i48);
                                        canvas2.drawRoundRect(rectF2, gm.L(f6), gm.L(f6), cmb.R1);
                                    } else {
                                        i30 = i34;
                                        rectF2 = rectF;
                                        i35 = i25;
                                    }
                                    if (z8) {
                                        i25 = i35;
                                    } else {
                                        float L20 = rectF2.left - gm.L(15.5f);
                                        float centerY = rectF2.centerY() + rc2Var.U4;
                                        float L21 = gm.L(7.0f);
                                        float L22 = gm.L(z3 ? 4.5f : 7.0f);
                                        float f39 = L20 - L21;
                                        float f40 = centerY - L21;
                                        float f41 = L20 + L21;
                                        float f42 = centerY + L21;
                                        canvas2.saveLayerAlpha(f39, f40, f41, f42, i28);
                                        TLRPC.Poll poll5 = rc2Var.j5;
                                        Drawable drawable2 = (poll5 == null || !poll5.quiz || qc2Var.l) ? cmb.J4[rc2Var.Q5.O3() ? 1 : 0] : cmb.K4[rc2Var.Q5.O3() ? 1 : 0];
                                        hg0.t(drawable2, L20 - (drawable2.getIntrinsicWidth() / 2), centerY - (drawable2.getIntrinsicHeight() / 2));
                                        drawable2.draw(canvas2);
                                        if (rc2Var.qd == null) {
                                            Paint paint3 = new Paint(1);
                                            rc2Var.qd = paint3;
                                            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
                                        }
                                        rc2Var.qd.setColor(cmb.R1.getColor());
                                        i25 = i35;
                                        i28 = i28;
                                        canvas2.drawRoundRect(f39, f40, f41, f42, L22, L22, rc2Var.qd);
                                        canvas.restore();
                                    }
                                }
                            }
                            f14 = 0.0f;
                            canvas2.drawText(format, ceil2, L17 + f14, cmb.L2);
                            int L182 = rc2Var.b7 - gm.L(76.0f);
                            float f362 = qc2Var.h;
                            float f372 = ((qc2Var.g - f362) * this.r) + f362;
                            if (z5) {
                            }
                            if (z8) {
                            }
                        }
                        if (!C4 || (!(rc2Var.W4 || rc2Var.X4 || rc2Var.Y4 || (this.x && (!this.v || this.w))) || z5 || this.C)) {
                            if (rc2Var.A2()) {
                                cmb.Z1.setColor(rc2Var.a2(rc2Var.Q5.O3() ? cmb.qc : cmb.oe));
                            } else {
                                cmb.Z1.setColor(rc2Var.a2(rc2Var.Q5.O3() ? cmb.rc : cmb.pe));
                            }
                            if (this.C && !z5) {
                                cmb.Z1.setAlpha((int) ((255 - i28) * (cmb.Z1.getAlpha() / 255.0f)));
                            }
                            canvas4 = canvas;
                            canvas4.drawLine(-gm.L(f6), gm.L(f8) + i48, f25 - gm.L(z4 ? 71.0f : 58.0f), gm.L(f8) + i48, cmb.Z1);
                            if (C4) {
                                if (rc2Var.Z4) {
                                    i31 = i24;
                                    if (i31 != rc2Var.d5 || z5) {
                                        rectF = rectF2;
                                        if (this.x || (this.v && !this.w)) {
                                            if (rc2Var.Q5.O3()) {
                                                cmb.W1.setColor(rc2Var.a2(rc2Var.A2() ? cmb.Kb : cmb.Jb));
                                            } else {
                                                cmb.W1.setColor(rc2Var.a2(rc2Var.A2() ? cmb.rd : cmb.qd));
                                            }
                                            if (this.C && !z5) {
                                                cmb.W1.setAlpha((int) ((255 - i28) * (cmb.W1.getAlpha() / 255.0f)));
                                            }
                                            float f43 = -gm.L(z4 ? 35.0f : 22.0f);
                                            float L23 = gm.L(9.0f);
                                            float L24 = gm.L(z3 ? 8.0f : 8.5f);
                                            if (z3) {
                                                i24 = i31;
                                                canvas.drawRoundRect(f43 - L24, L23 - L24, f43 + L24, L24 + L23, gm.L(4.0f), gm.L(4.0f), cmb.W1);
                                                canvas3 = canvas;
                                            } else {
                                                i24 = i31;
                                                canvas3 = canvas;
                                                canvas3.drawCircle(f43, L23, L24, cmb.W1);
                                                if (!z5) {
                                                }
                                            }
                                            int L25 = gm.L(z3 ? 8.0f : 8.5f);
                                            i32 = cmb.j7;
                                            if (rc2Var.Q5.O3() && rc2Var.a2(i32) == -1) {
                                                i32 = cmb.qb;
                                            }
                                            rc2Var.f7[i24].h(-1, rc2Var.Q5.O3() ? cmb.pc : cmb.ne, i32);
                                            i33 = L25 / 2;
                                            rc2Var.f7[i24].e((-gm.L(z4 ? 35.0f : 22.0f)) - i33, gm.L(9.0f) - i33, L25, L25);
                                            rc2Var.f7[i24].i(z3 ? gm.L(5.0f) : 0.0f);
                                            rc2Var.f7[i24].l(z3 ? 19.0f : 20.0f);
                                            rc2Var.f7[i24].a(canvas3);
                                            if (qc2Var.t != null && qc2Var.z != null) {
                                                if (this.J == null) {
                                                    Paint paint4 = new Paint(1);
                                                    this.J = paint4;
                                                    paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                                                }
                                                float progress3 = rc2Var.f7[i24].getProgress();
                                                float R1 = gm.R1(0.5f, 1.0f, progress3);
                                                qc2Var.z.i0(gm.L(8.0f) + ((-gm.L(!z4 ? 35.0f : 22.0f)) - i33), gm.L(9.0f) - (gm.L(20.0f) / 2), gm.L(20.0f), gm.L(20.0f));
                                                ImageReceiver imageReceiver = qc2Var.z;
                                                canvas4 = canvas;
                                                canvas4.saveLayerAlpha(imageReceiver.L0, imageReceiver.M0, imageReceiver.w(), qc2Var.z.x(), nm7.d4, 31);
                                                canvas4.save();
                                                ImageReceiver imageReceiver2 = qc2Var.z;
                                                canvas4.scale(R1, R1, imageReceiver2.L0, imageReceiver2.s());
                                                qc2Var.z.setAlpha(progress3);
                                                qc2Var.z.g(canvas4);
                                                canvas4.restore();
                                                canvas4.drawCircle(-gm.L(z4 ? 35.0f : 22.0f), gm.L(9.0f), gm.L(11.0f), this.J);
                                                canvas4.restore();
                                                canvas4.restore();
                                            }
                                            canvas4 = canvas3;
                                            canvas4.restore();
                                        }
                                        canvas4 = canvas;
                                        i24 = i31;
                                        canvas4.restore();
                                    } else {
                                        cmb.W1.setColor(rc2Var.a2(rc2Var.Q5.O3() ? cmb.pc : cmb.ne));
                                        if (this.C && !z5) {
                                            cmb.W1.setAlpha((int) ((255 - i28) * (cmb.W1.getAlpha() / 255.0f)));
                                        }
                                        rectF2.set((-gm.L(z4 ? 35.0f : 22.0f)) - gm.L(8.5f), gm.L(9.0f) - gm.L(8.5f), gm.L(8.5f) + (-gm.L(23.0f)), gm.L(8.5f) + gm.L(9.0f));
                                        RectF rectF6 = rectF2;
                                        canvas4.drawArc(rectF6, this.E, rc2Var.e5, false, cmb.W1);
                                        rectF = rectF6;
                                        canvas4 = canvas;
                                        i24 = i31;
                                        canvas4.restore();
                                    }
                                }
                            } else if (!z4) {
                                if (qc2Var.i) {
                                    if (this.L == null) {
                                        Path path = new Path();
                                        this.L = path;
                                        path.moveTo(-gm.L(3.66f), gm.L(0.16f));
                                        this.L.lineTo(gm.L(-1.0f), gm.L(3.0f));
                                        this.L.lineTo(gm.L(3.66f), gm.L(-3.0f));
                                    }
                                    if (this.K == null) {
                                        Paint paint5 = new Paint(1);
                                        this.K = paint5;
                                        paint5.setStyle(Paint.Style.STROKE);
                                        this.K.setStrokeCap(Paint.Cap.ROUND);
                                        this.K.setStrokeJoin(Paint.Join.ROUND);
                                    }
                                    this.K.setStrokeWidth(gm.L(1.833f));
                                    this.K.setColor(rc2Var.a2(rc2Var.Q5.O3() ? cmb.pc : cmb.ne));
                                    canvas4.save();
                                    canvas4.translate(-gm.L(z4 ? 35.0f : 22.0f), gm.L(9.0f));
                                    canvas4.drawPath(this.L, this.K);
                                    canvas4.restore();
                                } else {
                                    cmb.Z1.setColor(rc2Var.a2(rc2Var.Q5.O3() ? cmb.pc : cmb.ne));
                                    canvas4.drawCircle(-gm.L(z4 ? 35.0f : 22.0f), gm.L(9.0f), gm.L(2.5f), cmb.Z1);
                                }
                            }
                            rectF = rectF2;
                            i31 = i24;
                            if (this.x) {
                            }
                            if (rc2Var.Q5.O3()) {
                            }
                            if (this.C) {
                                cmb.W1.setAlpha((int) ((255 - i28) * (cmb.W1.getAlpha() / 255.0f)));
                            }
                            float f432 = -gm.L(z4 ? 35.0f : 22.0f);
                            float L232 = gm.L(9.0f);
                            float L242 = gm.L(z3 ? 8.0f : 8.5f);
                            if (z3) {
                            }
                            int L252 = gm.L(z3 ? 8.0f : 8.5f);
                            i32 = cmb.j7;
                            if (rc2Var.Q5.O3()) {
                                i32 = cmb.qb;
                            }
                            rc2Var.f7[i24].h(-1, rc2Var.Q5.O3() ? cmb.pc : cmb.ne, i32);
                            i33 = L252 / 2;
                            rc2Var.f7[i24].e((-gm.L(z4 ? 35.0f : 22.0f)) - i33, gm.L(9.0f) - i33, L252, L252);
                            rc2Var.f7[i24].i(z3 ? gm.L(5.0f) : 0.0f);
                            rc2Var.f7[i24].l(z3 ? 19.0f : 20.0f);
                            rc2Var.f7[i24].a(canvas3);
                            if (qc2Var.t != null) {
                                if (this.J == null) {
                                }
                                float progress32 = rc2Var.f7[i24].getProgress();
                                float R12 = gm.R1(0.5f, 1.0f, progress32);
                                qc2Var.z.i0(gm.L(8.0f) + ((-gm.L(!z4 ? 35.0f : 22.0f)) - i33), gm.L(9.0f) - (gm.L(20.0f) / 2), gm.L(20.0f), gm.L(20.0f));
                                ImageReceiver imageReceiver3 = qc2Var.z;
                                canvas4 = canvas;
                                canvas4.saveLayerAlpha(imageReceiver3.L0, imageReceiver3.M0, imageReceiver3.w(), qc2Var.z.x(), nm7.d4, 31);
                                canvas4.save();
                                ImageReceiver imageReceiver22 = qc2Var.z;
                                canvas4.scale(R12, R12, imageReceiver22.L0, imageReceiver22.s());
                                qc2Var.z.setAlpha(progress32);
                                qc2Var.z.g(canvas4);
                                canvas4.restore();
                                canvas4.drawCircle(-gm.L(z4 ? 35.0f : 22.0f), gm.L(9.0f), gm.L(11.0f), this.J);
                                canvas4.restore();
                                canvas4.restore();
                            }
                            canvas4 = canvas3;
                            canvas4.restore();
                        } else {
                            canvas4 = canvas;
                        }
                        rectF = rectF2;
                        canvas4.restore();
                    }
                }
                canvas2 = canvas;
                i29 = i49;
                cmb.O2.setAlpha(i51);
                if (C4) {
                }
                rectF2 = rectF;
                i30 = 2;
                if (C4) {
                }
                if (rc2Var.A2()) {
                }
                if (this.C) {
                    cmb.Z1.setAlpha((int) ((255 - i28) * (cmb.Z1.getAlpha() / 255.0f)));
                }
                canvas4 = canvas;
                canvas4.drawLine(-gm.L(f6), gm.L(f8) + i48, f25 - gm.L(z4 ? 71.0f : 58.0f), gm.L(f8) + i48, cmb.Z1);
                if (C4) {
                }
                rectF = rectF2;
                i31 = i24;
                if (this.x) {
                }
                if (rc2Var.Q5.O3()) {
                }
                if (this.C) {
                }
                float f4322 = -gm.L(z4 ? 35.0f : 22.0f);
                float L2322 = gm.L(9.0f);
                float L2422 = gm.L(z3 ? 8.0f : 8.5f);
                if (z3) {
                }
                int L2522 = gm.L(z3 ? 8.0f : 8.5f);
                i32 = cmb.j7;
                if (rc2Var.Q5.O3()) {
                }
                rc2Var.f7[i24].h(-1, rc2Var.Q5.O3() ? cmb.pc : cmb.ne, i32);
                i33 = L2522 / 2;
                rc2Var.f7[i24].e((-gm.L(z4 ? 35.0f : 22.0f)) - i33, gm.L(9.0f) - i33, L2522, L2522);
                rc2Var.f7[i24].i(z3 ? gm.L(5.0f) : 0.0f);
                rc2Var.f7[i24].l(z3 ? 19.0f : 20.0f);
                rc2Var.f7[i24].a(canvas3);
                if (qc2Var.t != null) {
                }
                canvas4 = canvas3;
                canvas4.restore();
            } else {
                i28 = i44;
                j3 = j2;
                i24 = max2;
                arrayList2 = arrayList4;
                f13 = f5;
                i30 = i10;
                i29 = i12;
                i25 = i11;
                i26 = i4;
                i27 = i3;
            }
            max2 = i24 + 1;
            i12 = i29;
            i44 = i28;
            f5 = f13;
            i3 = i27;
            i11 = i25;
            arrayList = arrayList2;
            j2 = j3;
            i4 = i26;
            i10 = i30;
            i13 = -1;
        }
        int i54 = i44;
        long j6 = j2;
        float f44 = f5;
        ArrayList arrayList5 = arrayList;
        int i55 = i10;
        int i56 = i4;
        int i57 = i3;
        if (arrayList5.isEmpty()) {
            i14 = 0;
        } else {
            qc2 qc2Var2 = (qc2) b10.f(1, arrayList5);
            int i58 = qc2Var2.b;
            int i59 = qc2Var2.c;
            if (qc2Var2.A != null) {
                i58 = gm.U1(yc2Var.L1, qc2Var2.C, i58);
                i59 = gm.U1(yc2Var.L1, qc2Var2.D, i59);
            }
            i14 = rc2Var.gb + i58 + i59;
        }
        if (this.s) {
            i15 = yc2Var.V2 ? gm.U1(yc2Var.L1, yc2Var.X2, rc2Var.Q1) : rc2Var.Q1;
        } else {
            i15 = 0;
        }
        if (!this.s || this.l == null) {
            i16 = i57;
            i17 = i56;
        } else {
            int L26 = gm.L(f8) + i14;
            int L27 = gm.L(44.33f);
            kf8 kf8Var = this.l;
            TLRPC.Poll poll6 = rc2Var.j5;
            kf8Var.e(((poll6 == null || poll6.public_voters || poll6.multiple_choice) ? cmb.H2 : cmb.E2).getColor());
            i16 = i57;
            i17 = i56;
            this.l.setBounds(i16, L26, i17, L27 + L26);
            this.l.draw(canvas4);
            if (rc2Var.eb != null) {
                canvas4.save();
                canvas4.translate(i16, L26);
                rc2Var.eb.k1(rc2Var);
                canvas4.restore();
            }
            if ((!rc2Var.W4 && !rc2Var.X4 && !rc2Var.Y4) || z5 || this.C) {
                int color4 = cmb.Z1.getColor();
                if (rc2Var.A2()) {
                    cmb.Z1.setColor(rc2Var.a2(rc2Var.Q5.O3() ? cmb.rc : cmb.pe));
                } else {
                    cmb.Z1.setColor(rc2Var.a2(rc2Var.Q5.O3() ? cmb.qc : cmb.oe));
                }
                if (this.C && !z5) {
                    cmb.Z1.setAlpha((int) ((255 - i54) * (cmb.Z1.getAlpha() / 255.0f)));
                }
                float f45 = L26 + i15;
                canvas4.drawLine((f44 + gm.L(35.0f)) - gm.L(f6), f45, ((f44 + gm.L(35.0f)) + f25) - gm.L(58.0f), f45, cmb.Z1);
                cmb.Z1.setColor(color4);
            }
        }
        if (this.s) {
            i14 += i15;
        }
        og8 og8Var2 = this.k;
        float b = og8Var2 != null ? og8Var2.b() : 0.0f;
        float f46 = (C4 || (hoVar = rc2Var.z3) == null || !hoVar.isVisible()) ? 0.0f : 1.0f;
        boolean z9 = rc2Var.u2;
        float f47 = z9 ? 1.0f : 0.0f;
        if (z9) {
            int L28 = gm.L((rc2Var.Q5.O3() || rc2Var.C6 || rc2Var.K) ? f6 : 8.0f) + rc2Var.getCurrentBackgroundLeft();
            int L29 = gm.L(f8) + i14;
            if (rc2Var.Q5.O3()) {
                cmb.L2.setColor(rc2Var.a2(cmb.Nb));
            } else {
                cmb.L2.setColor(rc2Var.a2(cmb.Ad));
            }
            f10 = b;
            rc2Var.M2.set(L28, L29, rc2Var.D2 + L28, gm.L(44.0f) + L29);
            Drawable drawable3 = drawableArr[0];
            if (drawable3 != null && iArr[0] == i55) {
                drawable3.setBounds(L28 - gm.L(this.b ? 6.0f : 0.0f), L29, rc2Var.D2 + L28, gm.L(44.0f) + L29);
                drawableArr[0].draw(canvas4);
            }
            if (rc2Var.Q5.S3() && (og8Var = this.k) != null) {
                og8Var.c(rc2Var.a2(rc2Var.Q5.O3() ? cmb.Nb : cmb.Ad));
                this.k.setBounds(i16, L29, i17, gm.L(44.0f) + L29);
                this.k.d((-gm.L(7.0f)) * f46);
                this.k.draw(canvas4);
            } else if (rc2Var.r2 != null) {
                canvas4.save();
                canvas4.translate(L28 + rc2Var.B2, gm.L(14.5f) + L29);
                rc2Var.r2.draw(canvas4);
                canvas4.restore();
            }
        } else {
            f10 = b;
            if (rc2Var.y3 != null) {
                float L30 = ((1.0f - f46) * gm.L(6.0f)) + gm.L(25.0f) + i14;
                canvas4.save();
                if (yc2Var.x0) {
                    canvas4.translate(((rc2Var.getBackgroundDrawableRight() + yc2Var.i0) + (rc2Var.getBackgroundDrawableLeft() + yc2Var.h0)) / f6, L30);
                } else {
                    canvas4.translate((rc2Var.getBackgroundDrawableRight() + rc2Var.getBackgroundDrawableLeft()) / f6, L30);
                }
                rc2Var.y3.setBounds(-1, -1, 1, 1);
                ho hoVar2 = rc2Var.y3;
                TLRPC.Poll poll7 = rc2Var.j5;
                hoVar2.u(((poll7 == null || poll7.public_voters || poll7.multiple_choice) ? cmb.H2 : cmb.E2).getColor());
                rc2Var.y3.draw(canvas4);
                canvas4.restore();
            }
        }
        if (C4 || rc2Var.z3 == null) {
            f11 = 1.0f;
        } else {
            float L31 = (gm.L(3.0f) * f47) + td4.A(1.0f, f46, gm.L(6.0f), gm.L(41.0f) + i14);
            canvas4.save();
            if (yc2Var.x0) {
                canvas4.translate(((rc2Var.getBackgroundDrawableRight() + yc2Var.i0) + (rc2Var.getBackgroundDrawableLeft() + yc2Var.h0)) / f6, L31);
            } else {
                canvas4.translate((i16 + i17) / f6, L31);
            }
            rc2Var.z3.setBounds(-1, -1, 1, 1);
            ho hoVar3 = rc2Var.z3;
            TLRPC.Poll poll8 = rc2Var.j5;
            hoVar3.u(((poll8 == null || poll8.public_voters || poll8.multiple_choice) ? cmb.H2 : cmb.E2).getColor());
            f11 = 1.0f;
            ur3.b(canvas4, rc2Var.z3, 1.0f - f10);
            canvas4.restore();
        }
        j(j6);
        canvas4.restore();
        if (f10 >= f11) {
            rc2Var.a0(true);
        }
        a09 a09Var = rc2Var.o3;
        if (a09Var != null) {
            if ((a09Var.e || a09Var.f) && (m37Var = rc2Var.L6) != null) {
                canvas4.save();
                canvas4.clipPath(m37Var.n());
                Paint paint6 = rc2Var.o3.i;
                k47 k47Var2 = rc2Var.Q5;
                int a24 = rc2Var.a2((k47Var2 == null || !k47Var2.O3() || rc2Var.Q5.t1) ? cmb.Kd : cmb.Qb);
                cmb.h1();
                paint6.setColor(cmb.p1(0.2f, a24));
                rc2Var.o3.c(canvas4, rc2Var.o0, rc2Var.u0, m37Var.getBounds(), rc2Var.R1(true));
                canvas.restore();
            }
        }
    }

    public final void h() {
        ArrayList arrayList = this.a.Q4;
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                ((qc2) arrayList.get(i)).w.setState(StateSet.NOTHING);
            }
        }
        kf8 kf8Var = this.l;
        if (kf8Var != null) {
            kf8Var.a.setState(StateSet.NOTHING);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0a18  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0a29  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0a5c  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0a85  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0aa6  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0aae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(k47 k47Var, boolean z) {
        boolean z2;
        float f;
        String L0;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        CharSequence charSequence;
        float f2;
        boolean z8;
        boolean z9;
        ArrayList arrayList;
        ArrayList arrayList2;
        byte[] bArr;
        l39 l39Var;
        int i2;
        int i3;
        boolean z10;
        int i4;
        CharSequence charSequence2;
        int i5;
        int i6;
        Object obj;
        Object obj2;
        int i7;
        qc2 qc2Var;
        Boolean bool;
        fg0 Y;
        TLRPC.TL_messageMediaToDo tL_messageMediaToDo;
        CharSequence charSequence3;
        int L;
        int i8;
        l39 l39Var2;
        ArrayList arrayList3;
        Object obj3;
        Object obj4;
        int i9;
        TLRPC.PollAnswer pollAnswer;
        boolean z11;
        boolean z12;
        CharSequence charSequence4;
        byte[] bArr2;
        int i10;
        CharSequence charSequence5;
        int i11;
        qc2 qc2Var2;
        int i12;
        float f3;
        boolean z13;
        ArrayList arrayList4;
        int i13;
        boolean contains;
        int i14;
        boolean z14;
        int i15;
        int i16;
        boolean z15;
        boolean z16;
        TLRPC.Message message;
        y2c y2cVar;
        TLRPC.PollResults pollResults;
        CharSequence ellipsize;
        ho hoVar;
        int currentTime;
        int i17;
        TLRPC.Message message2;
        y2c y2cVar2;
        TLRPC.TL_textWithEntities tL_textWithEntities2;
        String L02;
        TLRPC.TL_textWithEntities tL_textWithEntities3;
        int i18;
        boolean z17;
        int i19;
        k47 k47Var2 = k47Var;
        rc2 rc2Var = this.a;
        l39 l39Var3 = rc2Var.O;
        ArrayList arrayList5 = rc2Var.Q4;
        int i20 = rc2Var.a6;
        if (rc2Var.m5 == null) {
            rc2Var.m5 = new uqb();
        }
        rc2Var.Y4 = false;
        rc2Var.A0(0);
        rc2Var.v9 = true;
        rc2Var.E9 = !rc2Var.u6;
        rc2Var.O1 = false;
        int min = Math.min(gm.L(500.0f), k47Var2.l1());
        rc2Var.b7 = gm.L(31.0f) + min;
        TLRPC.MessageMedia n1 = k47.n1(k47Var2.k);
        boolean z18 = n1 instanceof TLRPC.TL_messageMediaPoll;
        if (z18) {
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) n1;
            TLRPC.Poll poll = tL_messageMediaPoll.poll;
            boolean z19 = poll.quiz;
            z5 = poll.public_voters;
            boolean z20 = poll.multiple_choice;
            int i21 = tL_messageMediaPoll.results.total_voters;
            this.H = poll.close_date - ConnectionsManager.getInstance(i20).getCurrentTime() < 60 ? 0.0f : 1.0f;
            TLRPC.Poll poll2 = tL_messageMediaPoll.poll;
            boolean z21 = poll2.closed;
            rc2Var.X4 = z21;
            z2 = z18;
            rc2Var.Y4 = k47Var2.M0;
            this.v = poll2.hide_results_until_close;
            TLRPC.TL_textWithEntities tL_textWithEntities4 = poll2.question;
            if (z21) {
                L02 = jb6.L0(2131750627);
            } else {
                boolean z22 = poll2.quiz;
                boolean z23 = poll2.public_voters;
                L02 = z22 ? jb6.L0(z23 ? 2131746178 : 2131754213) : z23 ? jb6.L0(2131746321) : jb6.L0(2131754214);
            }
            L0 = L02;
            rc2Var.j5 = tL_messageMediaPoll.poll;
            TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
            rc2Var.k5 = pollResults2.results;
            rc2Var.l5 = pollResults2.total_voters;
            CharSequence charSequence6 = k47Var2.A;
            this.d = charSequence6;
            if (charSequence6 == null && !TextUtils.isEmpty(pollResults2.solution)) {
                k47Var2.l0();
                this.d = k47Var2.A;
            }
            if (this.d != null) {
                if (this.h == null) {
                    this.h = rc2Var.getContext().getResources().getDrawable(R.drawable.msg_close).mutate();
                }
                int L2 = rc2Var.b7 - gm.L(38.0f);
                this.e = L2 - gm.L(18.0f);
                this.f = 0;
                TLRPC.PollResults pollResults3 = tL_messageMediaPoll.results;
                if (pollResults3 == null || pollResults3.solution_media == null) {
                    tL_textWithEntities3 = tL_textWithEntities4;
                    i18 = i21;
                    i19 = L2;
                    z17 = z19;
                    z6 = z20;
                    f = 1.0f;
                } else {
                    if (this.n == null) {
                        tL_textWithEntities3 = tL_textWithEntities4;
                        i18 = i21;
                        this.n = new ag8(i20, rc2Var, rc2Var.cc, true);
                    } else {
                        tL_textWithEntities3 = tL_textWithEntities4;
                        i18 = i21;
                    }
                    z17 = z19;
                    i19 = L2;
                    z6 = z20;
                    f = 1.0f;
                    this.n.o(k47Var2, tL_messageMediaPoll.results.solution_media, k47Var, i19, wf8.c(-3, k47Var2.k), !z);
                    ag8 ag8Var = this.n;
                    if (ag8Var.T) {
                        this.f = ag8Var.g(i19);
                    }
                    if (rc2Var.O0) {
                        this.n.a();
                    }
                }
                this.c = new StaticLayout(TextUtils.ellipsize(jb6.L0(2131746179), cmb.X2, min - gm.L(30.0f), TextUtils.TruncateAt.END), cmb.X2, min - gm.L(30.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                i47 i47Var = new i47(k47Var2, this.d, cmb.Z2, i19 - gm.L(11.0f));
                rc2Var.q3 = i47Var;
                int L3 = gm.L(37.0f) + i47Var.b();
                int i22 = this.f;
                this.g = L3 + (i22 > 0 ? i22 + gm.L(14.0f) : 0);
                z3 = false;
                rc2Var.Qa = gn.update(0, (View) rc2Var, false, rc2Var.Qa, (ArrayList<h47>) rc2Var.q3.e);
            } else {
                tL_textWithEntities3 = tL_textWithEntities4;
                i18 = i21;
                z17 = z19;
                z6 = z20;
                z3 = false;
                f = 1.0f;
            }
            tL_textWithEntities = tL_textWithEntities3;
            i = i18;
            z4 = z17;
        } else {
            z2 = z18;
            f = 1.0f;
            this.H = 1.0f;
            rc2Var.X4 = false;
            this.v = false;
            TLRPC.TodoList todoList = ((TLRPC.TL_messageMediaToDo) n1).todo;
            TLRPC.TL_textWithEntities tL_textWithEntities5 = todoList.title;
            L0 = jb6.L0((!todoList.others_can_complete || k47Var2.A0() == z8c.h(i20).e()) ? 2131748225 : 2131748345);
            tL_textWithEntities = tL_textWithEntities5;
            i = 0;
            z3 = true;
            z4 = false;
            z5 = true;
            z6 = true;
        }
        String str = L0;
        if (k47Var2.L2 && (message2 = k47Var2.k) != null && (y2cVar2 = message2.translatedPoll) != null && (tL_textWithEntities2 = y2cVar2.a) != null) {
            tL_textWithEntities = tL_textWithEntities2;
        }
        this.s = false;
        this.t = false;
        this.u = false;
        rc2Var.W4 = k47Var2.U4();
        this.w = k47Var2.E2();
        float f4 = f;
        this.x = iqd.a(ah8.a(k47Var2), 7);
        if (rc2Var.W4) {
            k47Var2.x1.clear();
        }
        boolean z24 = z3;
        CharSequence l = gw3.l(new SpannableStringBuilder(tL_textWithEntities.text), cmb.N2.getFontMetricsInt(), false);
        ArrayList<TLRPC.MessageEntity> arrayList6 = tL_textWithEntities.entities;
        if (arrayList6 != null) {
            z7 = z4;
            Spannable A5 = k47.A5(l, arrayList6, cmb.N2.getFontMetricsInt(), true);
            k47.a(A5, tL_textWithEntities.entities, rc2Var.Q5.O3(), false, false);
            charSequence = A5;
        } else {
            z7 = z4;
            charSequence = l;
        }
        StaticLayout staticLayout = new StaticLayout(charSequence, cmb.N2, (gm.L(2.0f) + min) - (rc2Var.getExtraTextX() << 1), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        rc2Var.o2 = staticLayout;
        rc2Var.Pa = gn.update(0, (View) rc2Var, false, rc2Var.Pa, staticLayout);
        StaticLayout staticLayout2 = rc2Var.o2;
        if (staticLayout2 != null) {
            int lineCount = staticLayout2.getLineCount();
            for (int i23 = 0; i23 < lineCount; i23++) {
                f2 = 0.0f;
                if (rc2Var.o2.getLineLeft(i23) > 0.0f) {
                    z8 = true;
                    break;
                }
            }
        }
        f2 = 0.0f;
        z8 = false;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        StaticLayout staticLayout3 = new StaticLayout(TextUtils.ellipsize(str, cmb.S2, min, truncateAt), cmb.S2, (gm.L(2.0f) + min) - (rc2Var.getExtraTextX() << 1), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        rc2Var.e3 = staticLayout3;
        if (staticLayout3.getLineCount() > 0) {
            boolean z25 = jb6.a0;
            if (!z8) {
                i17 = 0;
                if (z25) {
                    rc2Var.g3 = -((int) Math.ceil(rc2Var.e3.getLineLeft(0)));
                }
                rc2Var.g3 = i17;
            } else if (z25) {
                i17 = 0;
                rc2Var.g3 = i17;
            } else {
                rc2Var.g3 = (int) Math.ceil(r7 - rc2Var.e3.getLineWidth(0));
            }
        }
        int L4 = min - gm.L(k47Var2.O3() ? 28.0f : 8.0f);
        float f5 = f2;
        if (rc2Var.j6) {
            z9 = z5;
        } else {
            TextPaint textPaint = (z5 || z6) ? cmb.H2 : cmb.E2;
            if (z24) {
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo2 = (TLRPC.TL_messageMediaToDo) n1;
                ellipsize = (rc2Var.Q5.O3() || rc2Var.Q5.A0() < 0 || tL_messageMediaToDo2.todo.others_can_complete) ? jb6.J(tL_messageMediaToDo2.todo.list.size(), "TodoCompleted", Integer.valueOf(k47.z0(tL_messageMediaToDo2))) : jb6.J(tL_messageMediaToDo2.todo.list.size(), "TodoCompletedBy", Integer.valueOf(k47.z0(tL_messageMediaToDo2)), pg3.k(z8c.t0, rc2Var.Q5.Z0()));
            } else if (z7) {
                ellipsize = TextUtils.ellipsize(i == 0 ? jb6.L0(2131747863) : jb6.G(i, "Answer", new Object[0]), textPaint, L4, truncateAt);
            } else {
                ellipsize = TextUtils.ellipsize(i == 0 ? jb6.L0(2131747864) : jb6.G(i, "Vote", new Object[0]), textPaint, L4, truncateAt);
            }
            if (!rc2Var.X4 && z2) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll2 = (TLRPC.TL_messageMediaPoll) n1;
                int i24 = tL_messageMediaPoll2.poll.close_date;
                if (i24 > 0 && (currentTime = i24 - ConnectionsManager.getInstance(i20).getCurrentTime()) > 0) {
                    TLRPC.Poll poll3 = tL_messageMediaPoll2.poll;
                    boolean z26 = poll3.hide_results_until_close && !poll3.creator;
                    ry2 ry2Var = this.j;
                    if (ry2Var == null) {
                        ry2Var = new ry2(new s51((byte) 3, this, z26));
                        this.j = ry2Var;
                    }
                    z9 = z5;
                    ry2Var.a(currentTime);
                    ho hoVar2 = rc2Var.z3;
                    if (hoVar2 == null) {
                        ho hoVar3 = new ho(false, true, true);
                        rc2Var.z3 = hoVar3;
                        hoVar3.setCallback(rc2Var);
                        hoVar2 = rc2Var.z3;
                        hoVar2.b = 17;
                        hoVar2.N = gm.q.x;
                    }
                    hoVar2.w(gm.L(11.0f));
                    rc2Var.z3.u(((z9 || z6) ? cmb.H2 : cmb.E2).getColor());
                    rc2Var.z3.t(jb6.M(currentTime, z26), !z, true);
                    hoVar = rc2Var.y3;
                    if (hoVar == null) {
                        ho hoVar4 = new ho(false, true, true);
                        rc2Var.y3 = hoVar4;
                        hoVar4.setCallback(rc2Var);
                        hoVar = rc2Var.y3;
                        hoVar.b = 17;
                        hoVar.N = gm.q.x;
                    }
                    hoVar.w(gm.L(13.0f));
                    rc2Var.y3.u(((!z9 || z6) ? cmb.H2 : cmb.E2).getColor());
                    rc2Var.y3.t(ellipsize, !z, true);
                    rc2Var.x3 = null;
                }
            }
            z9 = z5;
            ry2 ry2Var2 = this.j;
            if (ry2Var2 != null) {
                ry2Var2.b();
            }
            rc2Var.z3 = null;
            hoVar = rc2Var.y3;
            if (hoVar == null) {
            }
            hoVar.w(gm.L(13.0f));
            rc2Var.y3.u(((!z9 || z6) ? cmb.H2 : cmb.E2).getColor());
            rc2Var.y3.t(ellipsize, !z, true);
            rc2Var.x3 = null;
        }
        rc2Var.Z2(k47Var2);
        e(z24 ? 30 : oc7.r1(i20).l4.K.f());
        if (!z2 || (pollResults = ((TLRPC.TL_messageMediaPoll) n1).results) == null) {
            jd0 jd0Var = this.I;
            if (jd0Var != null) {
                jd0Var.d(null, false);
            }
        } else {
            jd0 jd0Var2 = this.I;
            if (jd0Var2 != null) {
                jd0Var2.d(pollResults.recent_voters, !z);
            }
        }
        if (!this.B && rc2Var.Z4 && rc2Var.a5) {
            try {
                rc2Var.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
        boolean z27 = rc2Var.O0 && (rc2Var.Z4 || rc2Var.b5);
        this.B = z27;
        this.C = z27 && z2;
        ArrayList arrayList7 = rc2Var.P4;
        ArrayList arrayList8 = new ArrayList();
        if (arrayList5.isEmpty()) {
            arrayList = arrayList7;
            arrayList2 = null;
        } else {
            arrayList2 = new ArrayList(arrayList5);
            int size = arrayList5.size();
            int i25 = 0;
            while (i25 < size) {
                Object obj5 = arrayList5.get(i25);
                i25++;
                qc2 qc2Var3 = (qc2) obj5;
                qc2Var3.b();
                rc2 rc2Var2 = qc2Var3.E;
                gn.release(rc2Var2, qc2Var3.r);
                qc2Var3.r = null;
                gn.release(rc2Var2, qc2Var3.B);
                qc2Var3.B = null;
            }
            arrayList5.clear();
            if (!this.B) {
                this.B = rc2Var.O0 && (rc2Var.W4 || rc2Var.X4 || rc2Var.Y4);
            }
            float f6 = this.r;
            if (f6 > f5 && f6 < f4) {
                int size2 = arrayList2.size();
                for (int i26 = 0; i26 < size2; i26++) {
                    qc2 qc2Var4 = (qc2) arrayList2.get(i26);
                    int i27 = qc2Var4.f;
                    qc2Var4.d = (int) Math.ceil(((qc2Var4.d - i27) * this.r) + i27);
                    float f7 = qc2Var4.h;
                    qc2Var4.g = ((qc2Var4.g - f7) * this.r) + f7;
                }
            }
            arrayList = arrayList2;
        }
        this.r = this.B ? f5 : f4;
        if (this.C) {
            bArr = null;
        } else {
            rc2Var.Z4 = false;
            rc2Var.d5 = -1;
            a6a B = a6a.B(i20);
            k47 k47Var3 = rc2Var.Q5;
            bArr = k47Var3 == null ? null : (byte[]) B.w.get("poll_" + k47Var3.D1());
        }
        int i28 = k47Var2.L0 ? this.g : 0;
        StaticLayout staticLayout4 = rc2Var.o2;
        int height = i28 + (staticLayout4 != null ? staticLayout4.getHeight() : 0);
        int i29 = 100;
        if (z2) {
            rc2Var.w1 = true;
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll3 = (TLRPC.TL_messageMediaPoll) n1;
            if (tL_messageMediaPoll3.attached_media != null) {
                if (this.m == null) {
                    ag8 ag8Var2 = new ag8(i20, rc2Var, rc2Var.cc, false);
                    this.m = ag8Var2;
                    ag8Var2.b.s0(rc2Var.T0);
                }
                int L5 = ((rc2Var.b7 - gm.L(13.0f)) - gm.L(2.0f)) - gm.L(2.0f);
                l39Var = l39Var3;
                i2 = min;
                arrayList3 = arrayList2;
                obj3 = gn.class;
                obj4 = dw3.class;
                this.m.o(k47Var2, tL_messageMediaPoll3.attached_media, k47Var, L5, wf8.c(-2, k47Var2.k), !z);
                ag8 ag8Var3 = this.m;
                if (ag8Var3.T) {
                    this.o = L5;
                    int g = ag8Var3.g(L5);
                    this.p = g;
                    int L6 = gm.L(4.0f) + gm.L(4.0f) + g;
                    this.q = L6;
                    height += L6;
                }
                if (rc2Var.O0) {
                    this.m.a();
                }
            } else {
                arrayList3 = arrayList2;
                l39Var = l39Var3;
                i2 = min;
                obj3 = gn.class;
                obj4 = dw3.class;
            }
            brb.b(tL_messageMediaPoll3.poll, z8c.h(i20).e());
            TLRPC.Poll poll4 = tL_messageMediaPoll3.poll;
            ArrayList<TLRPC.PollAnswer> arrayList9 = poll4.shuffled_answers;
            if (arrayList9 == null) {
                arrayList9 = poll4.answers;
            }
            ArrayList<TLRPC.PollAnswer> arrayList10 = arrayList9;
            int size3 = poll4.answers.size();
            int i30 = 0;
            while (true) {
                if (i30 >= size3) {
                    break;
                }
                if (tL_messageMediaPoll3.poll.answers.get(i30).media != null) {
                    this.u = true;
                    break;
                }
                i30++;
            }
            int size4 = arrayList10.size();
            byte[] bArr3 = bArr;
            int i31 = 0;
            int i32 = 0;
            boolean z28 = false;
            int i33 = 0;
            while (i31 < size4) {
                TLRPC.PollAnswer pollAnswer2 = arrayList10.get(i31);
                int i34 = size4;
                k47 k47Var4 = rc2Var.Q5;
                int i35 = i31;
                if (!k47Var4.L2 || (message = k47Var4.k) == null || (y2cVar = message.translatedPoll) == null) {
                    i9 = i32;
                } else {
                    ArrayList arrayList11 = y2cVar.b;
                    int size5 = arrayList11.size();
                    i9 = i32;
                    int i36 = 0;
                    while (i36 < size5) {
                        Object obj6 = arrayList11.get(i36);
                        i36++;
                        ArrayList arrayList12 = arrayList11;
                        TLRPC.PollAnswer pollAnswer3 = (TLRPC.PollAnswer) obj6;
                        int i37 = size5;
                        if (Arrays.equals(pollAnswer3.option, pollAnswer2.option)) {
                            pollAnswer = pollAnswer3;
                            z11 = true;
                            break;
                        } else {
                            size5 = i37;
                            arrayList11 = arrayList12;
                        }
                    }
                }
                pollAnswer = pollAnswer2;
                z11 = false;
                int i38 = i33;
                CharSequence n = gw3.n(new SpannableStringBuilder(pollAnswer.text.text), cmb.N2.getFontMetricsInt(), false, null, 0, 1.0f, i38);
                ArrayList<TLRPC.MessageEntity> arrayList13 = pollAnswer.text.entities;
                if (arrayList13 != null) {
                    Spannable B5 = k47.B5(n, arrayList13, cmb.O2.getFontMetricsInt(), true, 1.2f, i38);
                    z12 = z11;
                    bArr2 = bArr3;
                    i10 = 0;
                    k47.a(B5, pollAnswer.text.entities, rc2Var.Q5.O3(), false, false);
                    charSequence4 = B5;
                } else {
                    z12 = z11;
                    charSequence4 = n;
                    bArr2 = bArr3;
                    i10 = 0;
                }
                if (charSequence4 instanceof Spannable) {
                    Spannable spannable = (Spannable) charSequence4;
                    charSequence5 = charSequence4;
                    i11 = ((gn[]) spannable.getSpans(i10, charSequence5.length(), obj3)).length + ((dw3[]) spannable.getSpans(i10, charSequence4.length(), obj4)).length;
                } else {
                    charSequence5 = charSequence4;
                    i11 = 0;
                }
                i33 = i38 + i11;
                if (arrayList != null) {
                    for (int i39 = 0; i39 < arrayList.size(); i39++) {
                        TLRPC.PollAnswer pollAnswer4 = ((qc2) arrayList.get(i39)).s;
                        if (pollAnswer4 == pollAnswer || (pollAnswer4 != null && Arrays.equals(((qc2) arrayList.get(i39)).s.option, pollAnswer.option))) {
                            qc2Var2 = (qc2) arrayList.get(i39);
                            break;
                        }
                    }
                }
                qc2Var2 = null;
                qc2 qc2Var5 = new qc2(rc2Var);
                if (qc2Var2 != null) {
                    qc2Var5.v = qc2Var2.v;
                    qc2Var5.w = qc2Var2.w;
                    qc2Var5.x = qc2Var2.x;
                    qc2Var2.x = null;
                } else {
                    int a2 = rc2Var.a2(cmb.h6);
                    qc2Var5.v = a2;
                    qc2Var5.w = cmb.Y(a2, 0, 0);
                }
                if (qc2Var5.x == null) {
                    qc2Var5.x = new yf8(i20, rc2Var);
                }
                String c = wf8.c(pollAnswer.unshuffled_index, k47Var2.k);
                yf8 yf8Var = qc2Var5.x;
                yf8Var.f = this.u;
                qc2 qc2Var6 = qc2Var2;
                TLRPC.PollAnswer pollAnswer5 = pollAnswer;
                byte[] bArr4 = bArr2;
                ArrayList arrayList14 = arrayList;
                ArrayList<TLRPC.PollAnswer> arrayList15 = arrayList10;
                int i40 = i9;
                Object obj7 = obj3;
                int i41 = height;
                int i42 = i20;
                boolean z29 = z12;
                Object obj8 = obj4;
                k47Var2 = k47Var;
                yf8Var.g(k47Var2, pollAnswer.media, k47Var, c, !z);
                if (rc2Var.O0) {
                    qc2Var5.a();
                }
                qc2Var5.w.setCallback(rc2Var);
                qc2Var5.s = pollAnswer5;
                StaticLayout staticLayout5 = new StaticLayout(charSequence5, cmb.O2, i2 - gm.L((this.u ? 48 : 0) + 48), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                qc2Var5.p = staticLayout5;
                qc2Var5.o = false;
                qc2Var5.r = gn.update(0, (View) rc2Var, false, qc2Var5.r, staticLayout5);
                qc2Var5.b = gm.L(52.0f) + i41;
                qc2Var5.c = qc2Var5.p.getHeight();
                qc2Var5.u = z29;
                if (qc2Var6 != null && qc2Var6.u != z29) {
                    StaticLayout staticLayout6 = qc2Var6.p;
                    qc2Var5.A = staticLayout6;
                    qc2Var5.B = gn.update(0, (View) rc2Var, false, qc2Var5.B, staticLayout6);
                    qc2Var5.C = qc2Var6.b;
                    qc2Var5.D = qc2Var6.c;
                }
                arrayList5.add(qc2Var5);
                arrayList8.add(qc2Var5);
                int v = hg9.v(26.66f, qc2Var5.c, i41);
                int lineCount2 = qc2Var5.p.getLineCount();
                float lineWidth = lineCount2 > 0 ? qc2Var5.p.getLineWidth(lineCount2 - 1) : f5;
                boolean z30 = lineCount2 > 0 && qc2Var5.p.getParagraphDirection(0) == -1;
                float L7 = (r52 - gm.L(10.0f)) - lineWidth;
                if (!tL_messageMediaPoll3.results.results.isEmpty()) {
                    int size6 = tL_messageMediaPoll3.results.results.size();
                    int i43 = 0;
                    while (i43 < size6) {
                        TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll3.results.results.get(i43);
                        int i44 = v;
                        int i45 = size6;
                        if (Arrays.equals(qc2Var5.s.option, pollAnswerVoters.option)) {
                            yf8 yf8Var2 = qc2Var5.x;
                            if (yf8Var2 != null) {
                                boolean z31 = !rc2Var.j6 && (rc2Var.W4 || rc2Var.Y4 || rc2Var.X4 || (this.x && (!this.v || this.w)));
                                yf8Var2.E.a(z31, (qc2Var6 == null || z) ? false : true);
                                yf8 yf8Var3 = qc2Var5.x;
                                int i46 = pollAnswerVoters.voters;
                                if (qc2Var6 == null || z) {
                                    z15 = z31;
                                    z16 = false;
                                } else {
                                    z15 = z31;
                                    z16 = true;
                                }
                                yf8Var3.j(i46, z16);
                                qc2Var5.x.h(pollAnswerVoters.recent_voters, (qc2Var6 == null || z) ? false : true);
                                float e = qc2Var5.x.e();
                                boolean z32 = z30 && lineCount2 == 1 && L7 - ((float) gm.L(10.0f)) > e;
                                qc2Var5.o = z32;
                                if (!z15 || (e <= L7 && (!z30 || z32))) {
                                    i14 = i44;
                                } else {
                                    qc2Var5.c = gm.L(22.0f) + qc2Var5.c;
                                    i14 = gm.L(22.0f) + i44;
                                }
                                z14 = true;
                            } else {
                                i14 = i44;
                                z14 = false;
                            }
                            qc2Var5.i = pollAnswerVoters.chosen;
                            int i47 = pollAnswerVoters.voters;
                            qc2Var5.j = i47;
                            qc2Var5.l = pollAnswerVoters.correct;
                            if ((rc2Var.W4 || rc2Var.X4 || rc2Var.Y4 || (this.x && (!this.v || this.w))) && (i15 = tL_messageMediaPoll3.results.total_voters) > 0) {
                                f3 = f5;
                                float a = pqe.a(i47 / i15, f3, f4) * 100.0f;
                                i16 = (int) a;
                                qc2Var5.d = i16;
                                qc2Var5.e = a - i16;
                            } else {
                                f3 = f5;
                                qc2Var5.d = 0;
                                qc2Var5.e = f3;
                                i16 = 0;
                            }
                            if (i40 == 0) {
                                i40 = i16;
                            } else if (i16 != 0 && i40 != i16) {
                                z28 = true;
                            }
                            i29 -= i16;
                            i12 = i14;
                            z13 = z14;
                            i32 = i40;
                            if (!z13) {
                                qc2Var5.x.E.a(false, (qc2Var6 == null || z) ? false : true);
                            }
                            if (arrayList3 != null) {
                                int size7 = arrayList3.size();
                                int i48 = 0;
                                while (i48 < size7) {
                                    arrayList4 = arrayList3;
                                    qc2 qc2Var7 = (qc2) arrayList4.get(i48);
                                    if (Arrays.equals(qc2Var5.s.option, qc2Var7.s.option)) {
                                        qc2Var5.f = qc2Var7.d;
                                        qc2Var5.h = qc2Var7.g;
                                        qc2Var5.k = qc2Var7.i;
                                        break;
                                    }
                                    i48++;
                                    arrayList3 = arrayList4;
                                }
                            }
                            arrayList4 = arrayList3;
                            if (bArr4 != null) {
                                byte[] bArr5 = qc2Var5.s.option;
                                if (bArr5.length > 0) {
                                    bArr3 = bArr4;
                                    if (Arrays.binarySearch(bArr3, bArr5[0]) >= 0) {
                                        i13 = i35;
                                        rc2Var.d5 = i13;
                                        rc2Var.Z4 = true;
                                        rc2Var.a5 = true;
                                        bArr3 = null;
                                    } else {
                                        i13 = i35;
                                    }
                                    if (rc2Var.W4 || this.w || !this.v) {
                                        contains = rc2Var.Q5.x1.contains(qc2Var5.s);
                                        CheckBoxBase[] checkBoxBaseArr = rc2Var.f7;
                                        if (contains) {
                                            checkBoxBaseArr[i13].g(true, false);
                                        } else {
                                            checkBoxBaseArr[i13].g(false, false);
                                        }
                                    } else {
                                        rc2Var.f7[i13].g(qc2Var5.i, false);
                                    }
                                    rc2Var.f7[i13].e = 0.85f;
                                    i31 = i13 + 1;
                                    arrayList3 = arrayList4;
                                    f5 = f3;
                                    size4 = i34;
                                    i20 = i42;
                                    obj3 = obj7;
                                    obj4 = obj8;
                                    arrayList = arrayList14;
                                    height = i12;
                                    arrayList10 = arrayList15;
                                    f4 = 1.0f;
                                }
                            }
                            i13 = i35;
                            bArr3 = bArr4;
                            if (rc2Var.W4) {
                            }
                            contains = rc2Var.Q5.x1.contains(qc2Var5.s);
                            CheckBoxBase[] checkBoxBaseArr2 = rc2Var.f7;
                            if (contains) {
                            }
                            rc2Var.f7[i13].e = 0.85f;
                            i31 = i13 + 1;
                            arrayList3 = arrayList4;
                            f5 = f3;
                            size4 = i34;
                            i20 = i42;
                            obj3 = obj7;
                            obj4 = obj8;
                            arrayList = arrayList14;
                            height = i12;
                            arrayList10 = arrayList15;
                            f4 = 1.0f;
                        } else {
                            i43++;
                            v = i44;
                            size6 = i45;
                            f4 = 1.0f;
                        }
                    }
                }
                i12 = v;
                f3 = f5;
                z13 = false;
                i32 = i40;
                if (!z13) {
                }
                if (arrayList3 != null) {
                }
                arrayList4 = arrayList3;
                if (bArr4 != null) {
                }
                i13 = i35;
                bArr3 = bArr4;
                if (rc2Var.W4) {
                }
                contains = rc2Var.Q5.x1.contains(qc2Var5.s);
                CheckBoxBase[] checkBoxBaseArr22 = rc2Var.f7;
                if (contains) {
                }
                rc2Var.f7[i13].e = 0.85f;
                i31 = i13 + 1;
                arrayList3 = arrayList4;
                f5 = f3;
                size4 = i34;
                i20 = i42;
                obj3 = obj7;
                obj4 = obj8;
                arrayList = arrayList14;
                height = i12;
                arrayList10 = arrayList15;
                f4 = 1.0f;
            }
            int i49 = i20;
            ArrayList arrayList16 = arrayList;
            int i50 = height;
            mc2 mc2Var = rc2Var.eb;
            if (mc2Var == null || !mc2Var.Z() || !tL_messageMediaPoll3.poll.open_answers || rc2Var.X4 || k47Var2.r1 || k47Var2.j3() || tL_messageMediaPoll3.poll.answers.size() >= oc7.r1(i49).l4.K.f()) {
                height = i50;
            } else {
                if (this.l == null) {
                    kf8 kf8Var = new kf8(rc2Var.getContext(), rc2Var.cc);
                    this.l = kf8Var;
                    kf8Var.setCallback(rc2Var);
                    kf8Var.a.setCallback(rc2Var);
                }
                this.s = true;
                mc2 mc2Var2 = rc2Var.eb;
                int Q = mc2Var2 != null ? mc2Var2.Q(rc2Var) : 0;
                boolean z33 = Q > 0;
                this.t = z33;
                this.l.d(z33, !z);
                int max = Math.max(gm.L(44.33f), Q);
                rc2Var.Q1 = max;
                height = i50 + max;
            }
            int size8 = arrayList16.size();
            int i51 = 0;
            while (i51 < size8) {
                Object obj9 = arrayList16.get(i51);
                i51++;
                qc2 qc2Var8 = (qc2) obj9;
                qc2Var8.b();
                qc2Var8.x = null;
            }
            b(!z);
            z10 = z28;
            i3 = i29;
        } else {
            Object obj10 = gn.class;
            Object obj11 = dw3.class;
            l39Var = l39Var3;
            ArrayList arrayList17 = arrayList;
            i2 = min;
            if (n1 instanceof TLRPC.TL_messageMediaToDo) {
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo3 = (TLRPC.TL_messageMediaToDo) n1;
                int size9 = tL_messageMediaToDo3.todo.list.size();
                int i52 = height;
                int i53 = 0;
                int i54 = 0;
                while (i53 < size9) {
                    TLRPC.TodoItem todoItem = tL_messageMediaToDo3.todo.list.get(i53);
                    int i55 = i54;
                    CharSequence n2 = gw3.n(new SpannableStringBuilder(todoItem.title.text), cmb.N2.getFontMetricsInt(), false, null, 0, 1.0f, i55);
                    ArrayList<TLRPC.MessageEntity> arrayList18 = todoItem.title.entities;
                    if (arrayList18 != null) {
                        Spannable B52 = k47.B5(n2, arrayList18, cmb.O2.getFontMetricsInt(), true, 1.2f, i55);
                        i4 = 0;
                        k47.a(B52, todoItem.title.entities, rc2Var.Q5.O3(), false, false);
                        charSequence2 = B52;
                    } else {
                        i4 = 0;
                        charSequence2 = n2;
                    }
                    if (charSequence2 instanceof Spannable) {
                        Spannable spannable2 = (Spannable) charSequence2;
                        obj2 = obj11;
                        i5 = size9;
                        i6 = i53;
                        obj = obj10;
                        i7 = ((gn[]) spannable2.getSpans(i4, charSequence2.length(), obj)).length + ((dw3[]) spannable2.getSpans(i4, charSequence2.length(), obj2)).length;
                    } else {
                        i5 = size9;
                        i6 = i53;
                        obj = obj10;
                        obj2 = obj11;
                        i7 = 0;
                    }
                    i54 = i55 + i7;
                    if (arrayList17 != null) {
                        for (int i56 = 0; i56 < arrayList17.size(); i56++) {
                            qc2Var = (qc2) arrayList17.get(i56);
                            TLRPC.TodoItem todoItem2 = qc2Var.t;
                            if (todoItem2 == todoItem || (todoItem2 != null && todoItem2.id == todoItem.id)) {
                                break;
                            }
                        }
                    }
                    qc2Var = null;
                    Boolean E = a6a.B(i20).E(k47Var2, todoItem);
                    qc2 qc2Var9 = new qc2(rc2Var);
                    qc2Var9.q = qc2Var != null ? qc2Var.q : null;
                    if (qc2Var != null) {
                        qc2Var9.v = qc2Var.v;
                        Y = qc2Var.w;
                        qc2Var9.w = Y;
                        bool = E;
                    } else {
                        int a22 = rc2Var.a2(cmb.h6);
                        qc2Var9.v = a22;
                        bool = E;
                        Y = cmb.Y(a22, 0, 0);
                        qc2Var9.w = Y;
                    }
                    Y.setCallback(rc2Var);
                    if (qc2Var != null) {
                        qc2Var9.y = qc2Var.y;
                        qc2Var9.z = qc2Var.z;
                        qc2Var.y = null;
                        qc2Var.z = null;
                    }
                    if (qc2Var9.y == null) {
                        qc2Var9.y = new pc0();
                    }
                    if (qc2Var9.z == null) {
                        ImageReceiver imageReceiver = new ImageReceiver(rc2Var);
                        qc2Var9.z = imageReceiver;
                        imageReceiver.q0(gm.L(20.0f));
                    }
                    if (rc2Var.O0) {
                        qc2Var9.a();
                    }
                    qc2Var9.i = false;
                    if (tL_messageMediaToDo3.completions.isEmpty()) {
                        obj10 = obj;
                    } else {
                        ArrayList<TLRPC.TodoCompletion> arrayList19 = tL_messageMediaToDo3.completions;
                        int size10 = arrayList19.size();
                        obj10 = obj;
                        int i57 = 0;
                        while (i57 < size10) {
                            TLRPC.TodoCompletion todoCompletion = arrayList19.get(i57);
                            int i58 = i57 + 1;
                            ArrayList<TLRPC.TodoCompletion> arrayList20 = arrayList19;
                            TLRPC.TodoCompletion todoCompletion2 = todoCompletion;
                            int i59 = size10;
                            if (todoCompletion2.id == todoItem.id) {
                                qc2Var9.i = true;
                                obj11 = obj2;
                                tL_messageMediaToDo = tL_messageMediaToDo3;
                                TLObject a23 = oc7.r1(i20).a2(pg3.n(todoCompletion2.completed_by));
                                qc2Var9.y.k(a23);
                                qc2Var9.z.U(a23, qc2Var9.y, null);
                                qc2Var9.q = new uib(pg3.l(a23), 12.0f);
                                break;
                            }
                            i57 = i58;
                            arrayList19 = arrayList20;
                            size10 = i59;
                        }
                    }
                    obj11 = obj2;
                    tL_messageMediaToDo = tL_messageMediaToDo3;
                    if (bool != null) {
                        qc2Var9.i = bool.booleanValue();
                    }
                    if (!qc2Var9.i || k47Var2.q()) {
                        charSequence3 = charSequence2;
                    } else {
                        boolean z34 = charSequence2 instanceof SpannableStringBuilder;
                        CharSequence charSequence7 = charSequence2;
                        if (!z34) {
                            charSequence7 = new SpannableStringBuilder(charSequence2);
                        }
                        ((SpannableStringBuilder) charSequence7).setSpan(new StrikethroughSpan(), 0, charSequence7.length(), 33);
                        charSequence3 = charSequence7;
                    }
                    qc2Var9.t = todoItem;
                    StaticLayout staticLayout7 = new StaticLayout(charSequence3, cmb.O2, i2 - gm.L(46.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    qc2Var9.p = staticLayout7;
                    qc2Var9.r = gn.update(0, (View) rc2Var, false, qc2Var9.r, staticLayout7);
                    qc2Var9.b = gm.L(52.0f) + i52;
                    qc2Var9.c = qc2Var9.p.getHeight();
                    qc2Var9.u = false;
                    if (qc2Var != null && qc2Var.u) {
                        StaticLayout staticLayout8 = qc2Var.p;
                        qc2Var9.A = staticLayout8;
                        qc2Var9.B = gn.update(0, (View) rc2Var, false, qc2Var9.B, staticLayout8);
                        qc2Var9.C = qc2Var.b;
                        qc2Var9.D = qc2Var.c;
                    }
                    arrayList5.add(qc2Var9);
                    arrayList8.add(qc2Var9);
                    i52 = hg9.v(26.66f, qc2Var9.c, i52);
                    rc2Var.f7[i6].g(qc2Var9.i, !z);
                    rc2Var.f7[i6].e = 1.0f;
                    i53 = i6 + 1;
                    tL_messageMediaToDo3 = tL_messageMediaToDo;
                    size9 = i5;
                }
                int size11 = arrayList17.size();
                int i60 = 0;
                while (i60 < size11) {
                    Object obj12 = arrayList17.get(i60);
                    i60++;
                    qc2 qc2Var10 = (qc2) obj12;
                    ImageReceiver imageReceiver2 = qc2Var10.z;
                    if (imageReceiver2 != null) {
                        imageReceiver2.K();
                        qc2Var10.z = null;
                    }
                }
                height = i52;
            }
            i3 = 100;
            z10 = false;
        }
        g(i3, arrayList8, z10);
        int L8 = rc2Var.b7 - gm.L(76.0f);
        int size12 = arrayList5.size();
        for (int i61 = 0; i61 < size12; i61++) {
            ((qc2) arrayList5.get(i61)).g = Math.max(gm.L(5.0f) / L8, r6.d / 100.0f);
        }
        rc2Var.setMessageObjectInternal(k47Var2);
        this.b = false;
        if (!rc2Var.j6 || rc2Var.u2) {
            this.b = true;
            L = gm.L(13.0f) + height;
        } else {
            L = height - gm.L(10.0f);
        }
        int L9 = gm.L(73.0f);
        int i62 = rc2Var.gb;
        rc2Var.v0 = L9 + i62 + L;
        if (rc2Var.J) {
            rc2Var.gb = i62 - gm.L(1.0f);
        }
        rc2Var.E2 = false;
        if (z9 || z6) {
            int i63 = 0;
            int i64 = 0;
            i8 = 3;
            while (i63 < 3) {
                i64 = Math.max(i64, (int) Math.ceil(cmb.L2.measureText(i63 == 0 ? jb6.L0(2131746843) : i63 == 1 ? jb6.L0(2131746889) : jb6.L0(2131747864))));
                i63++;
            }
            int extraTimeX = rc2Var.getExtraTimeX() + rc2Var.M9 + (k47Var2.O3() ? gm.L(20.0f) : 0);
            l39Var.getClass();
            l39Var2 = l39Var;
            if (l39Var2.p && !rc2Var.y2() && extraTimeX >= ((rc2Var.b7 - gm.L(76.0f)) - i64) / 2) {
                rc2Var.v0 = gm.L(18.0f) + rc2Var.v0;
                rc2Var.E2 = true;
            }
        } else {
            l39Var2 = l39Var;
            i8 = 3;
        }
        l39Var2.getClass();
        if (l39Var2.p) {
            return;
        }
        l39Var2.o(i2, i8);
        rc2Var.v0 = hg9.v(12.0f, l39Var2.m, rc2Var.v0);
        int extraTimeX2 = rc2Var.getExtraTimeX() + rc2Var.M9 + (k47Var2.O3() ? gm.L(20.0f) : 0);
        if (rc2Var.y2() || extraTimeX2 < (rc2Var.b7 - gm.L(24.0f)) - l39Var2.r) {
            return;
        }
        rc2Var.v0 = gm.L(16.0f) + rc2Var.v0;
        l39Var2.k -= gm.L(16.0f);
    }

    public final void j(long j) {
        jd0 jd0Var;
        k47 k47Var;
        rc2 rc2Var = this.a;
        ArrayList arrayList = rc2Var.Q4;
        if (rc2Var.Z4) {
            this.E = (((360 * j) / 2000.0f) + this.E) - (((int) (r6 / 360.0f)) * 360);
            float f = rc2Var.h5 + j;
            rc2Var.h5 = f;
            if (f >= 500.0f) {
                rc2Var.h5 = 500.0f;
                f = 500.0f;
            }
            if (rc2Var.g5) {
                rc2Var.e5 = (gm.G.getInterpolation(f / 500.0f) * 266.0f) + 4.0f;
            } else {
                rc2Var.e5 = 4.0f - ((1.0f - gm.F.getInterpolation(f / 500.0f)) * (rc2Var.f5 ? 360 : nm7.s4));
            }
            if (rc2Var.h5 == 500.0f) {
                boolean z = rc2Var.g5;
                if (z) {
                    this.E += 270.0f;
                    rc2Var.e5 = -266.0f;
                }
                rc2Var.g5 = !z;
                if (rc2Var.f5) {
                    rc2Var.f5 = false;
                }
                rc2Var.h5 = 0.0f;
            }
            rc2Var.invalidate();
        }
        if (!rc2Var.r5 || ((k47Var = rc2Var.Q5) != null && k47Var.L0)) {
            float f2 = rc2Var.s5;
            if (f2 > 0.0f) {
                float f3 = f2 - (j / 180.0f);
                rc2Var.s5 = f3;
                if (f3 < 0.0f) {
                    rc2Var.s5 = 0.0f;
                }
                rc2Var.invalidate();
            }
        } else {
            float f4 = rc2Var.s5;
            if (f4 < 1.0f) {
                float f5 = (j / 180.0f) + f4;
                rc2Var.s5 = f5;
                if (f5 > 1.0f) {
                    rc2Var.s5 = 1.0f;
                }
                rc2Var.invalidate();
            }
        }
        if (this.B) {
            float f6 = rc2Var.R4 + j;
            rc2Var.R4 = f6;
            if (f6 >= 300.0f) {
                rc2Var.R4 = 300.0f;
                f6 = 300.0f;
            }
            float interpolation = gm.F.getInterpolation(f6 / 300.0f);
            this.r = interpolation;
            if (interpolation >= 1.0f) {
                this.r = 1.0f;
                this.B = false;
                this.C = false;
                rc2Var.Z4 = false;
                if (rc2Var.b5 && rc2Var.c5 && (jd0Var = this.I) != null) {
                    jd0Var.d(null, false);
                }
                rc2Var.b5 = false;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((qc2) arrayList.get(i)).k = false;
                }
            }
            rc2Var.invalidate();
        }
    }
}
