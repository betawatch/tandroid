// default package

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class pa2 extends AccessibilityNodeProvider {
    public final gb2 a;
    public final Path b = new Path();
    public final RectF c = new RectF();
    public final Rect d = new Rect();

    public pa2(gb2 gb2Var) {
        this.a = gb2Var;
    }

    public final ClickableSpan a(int i, boolean z) {
        if (i == 5000) {
            return null;
        }
        gb2 gb2Var = this.a;
        if (z) {
            int i2 = i - 3000;
            CharSequence charSequence = gb2Var.Q5.z;
            if (!(charSequence instanceof Spannable) || i2 < 0) {
                return null;
            }
            Spannable spannable = (Spannable) charSequence;
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(0, spannable.length(), ClickableSpan.class);
            if (clickableSpanArr.length > i2) {
                return clickableSpanArr[i2];
            }
            return null;
        }
        int i3 = i - 2000;
        CharSequence charSequence2 = gb2Var.Q5.v;
        if (!(charSequence2 instanceof Spannable) || i3 < 0) {
            return null;
        }
        Spannable spannable2 = (Spannable) charSequence2;
        ClickableSpan[] clickableSpanArr2 = (ClickableSpan[]) spannable2.getSpans(0, spannable2.length(), ClickableSpan.class);
        if (clickableSpanArr2.length > i3) {
            return clickableSpanArr2[i3];
        }
        return null;
    }

    public final mg9 b(int[] iArr, int i) {
        rh9 rh9Var;
        k27 k27Var = this.a.Q5;
        if (k27Var == null || (rh9Var = k27Var.y2) == null) {
            return null;
        }
        ArrayList arrayList = rh9Var.g;
        int i2 = i - 6000;
        if (i2 < 0) {
            return null;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            mg9 mg9Var = (mg9) arrayList.get(i4);
            if (mg9Var.S()) {
                int C = mg9Var.C() + (mg9Var.r == null ? 0 : 1) + i3;
                if (i2 < C) {
                    iArr[0] = i2 - i3;
                    return mg9Var;
                }
                i3 = C;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x085a A[LOOP:3: B:101:0x0858->B:102:0x085a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0872  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x088c A[LOOP:4: B:112:0x088a->B:113:0x088c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x08a4  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x08b5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x08e0  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0937  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0941  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x094d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0956  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0964  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0994  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x09b2  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0676 A[LOOP:11: B:405:0x0674->B:406:0x0676, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x076a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0788  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x07b7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x07dc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x07e9  */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        boolean z;
        boolean z2;
        String str;
        int i2;
        String S;
        ArrayList arrayList;
        String str2;
        int i3;
        boolean z3;
        int[] iArr;
        boolean z4;
        int[] iArr2;
        char c;
        boolean z5;
        long j;
        SpannableStringBuilder spannableStringBuilder;
        ArrayList arrayList2;
        StaticLayout[] staticLayoutArr;
        ArrayList arrayList3;
        AccessibilityNodeInfo accessibilityNodeInfo;
        ArrayList arrayList4;
        long j2;
        TLRPC.Document document;
        rh9 rh9Var;
        TLRPC.TL_messageReactions tL_messageReactions;
        int i4;
        ArrayList<TLRPC.ReactionCount> arrayList5;
        boolean z6;
        TLRPC.MessagePeerReaction messagePeerReaction;
        String str3;
        int i5;
        String M0;
        byte b;
        String str4;
        int i6;
        StaticLayout staticLayout;
        String s;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        ArrayList arrayList6;
        int size;
        int i7;
        int size2;
        int i8;
        hb2 hb2Var;
        byte b2;
        k27 k27Var;
        rh9 rh9Var2;
        int i9;
        RectF rectF;
        ArrayList arrayList7;
        int size3;
        int i10;
        int[] iArr3 = {0, 0};
        gb2 gb2Var = this.a;
        gb2Var.getLocationOnScreen(iArr3);
        ArrayList arrayList8 = gb2Var.Q4;
        ArrayList arrayList9 = gb2Var.I5;
        StaticLayout[] staticLayoutArr2 = gb2Var.C9;
        SparseArray sparseArray = gb2Var.Jb;
        if (i != -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
            obtain.setSource(gb2Var, i);
            obtain.setParent(gb2Var);
            obtain.setPackageName(gb2Var.getContext().getPackageName());
            Rect rect = this.d;
            if (i == 5000) {
                TLRPC.User user = gb2Var.va;
                if (user != null) {
                    obtain.setText(l7c.q(user));
                    float f = gb2Var.t9;
                    int i11 = (int) f;
                    float f2 = gb2Var.u9;
                    rect.set(i11, (int) f2, (int) (f + gb2Var.r9), (int) (f2 + (gb2Var.h9 != null ? r4.getHeight() : 10)));
                    obtain.setBoundsInParent(rect);
                    if (sparseArray.get(i) == null) {
                        sparseArray.put(i, new Rect(rect));
                    }
                    rect.offset(iArr3[0], iArr3[1]);
                    obtain.setBoundsInScreen(rect);
                    obtain.setClassName("android.widget.TextView");
                    obtain.setEnabled(true);
                    obtain.setClickable(true);
                    obtain.setLongClickable(true);
                    obtain.addAction(16);
                    obtain.addAction(32);
                    z2 = true;
                }
                return null;
            }
            if (i >= 6000) {
                int[] iArr4 = {0};
                mg9 b3 = b(iArr4, i);
                if (b3 != null) {
                    obtain.setText(b3.x(iArr4[0]));
                    b3.w(iArr4[0], rect);
                    rect.offset(gb2Var.o0, gb2Var.u0);
                    obtain.setBoundsInParent(rect);
                    if (sparseArray.get(i) == null) {
                        sparseArray.put(i, new Rect(rect));
                    }
                    rect.offset(iArr3[0], iArr3[1]);
                    obtain.setBoundsInScreen(rect);
                    int i12 = iArr4[0];
                    boolean z7 = b3.r != null && i12 == 0;
                    if (z7) {
                        obtain.setClassName("android.widget.CheckBox");
                    } else if (b3.P(i12)) {
                        obtain.setClassName("android.widget.TextView");
                    } else {
                        obtain.setClassName("android.widget.ImageView");
                    }
                    obtain.setEnabled(true);
                    if (z7) {
                        obtain.setCheckable(true);
                        c = 0;
                        obtain.setChecked(b3.M(iArr4[0]));
                    } else {
                        c = 0;
                    }
                    boolean O = b3.O(iArr4[c]);
                    obtain.setClickable(O);
                    if (O) {
                        obtain.addAction(16);
                    }
                    z2 = true;
                }
                return null;
            }
            RectF rectF2 = this.c;
            Path path = this.b;
            if (i >= 3000) {
                CharSequence charSequence = gb2Var.Q5.z;
                if ((charSequence instanceof Spannable) && gb2Var.m3 != null) {
                    Spannable spannable = (Spannable) charSequence;
                    ClickableSpan a = a(i, false);
                    if (a != null) {
                        int[] Z1 = gb2.Z1(spannable, a);
                        obtain.setText(spannable.subSequence(Z1[0], Z1[1]).toString());
                        ArrayList arrayList10 = gb2Var.m3.e;
                        int size4 = arrayList10.size();
                        int i13 = 0;
                        while (true) {
                            if (i13 >= size4) {
                                z4 = true;
                                break;
                            }
                            Object obj = arrayList10.get(i13);
                            i13++;
                            h27 h27Var = (h27) obj;
                            int length = h27Var.e.getText().length();
                            int i14 = h27Var.n;
                            int i15 = Z1[0];
                            if (i14 <= i15) {
                                int i16 = length + i14;
                                iArr2 = Z1;
                                int i17 = iArr2[1];
                                if (i16 >= i17) {
                                    h27Var.e.getSelectionPath(i15 - i14, i17 - i14, path);
                                    path.computeBounds(rectF2, true);
                                    rect.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                                    rect.offset(0, (int) h27Var.p(gb2Var.m3.e, gb2Var.ub));
                                    rect.offset(gb2Var.o0, gb2Var.u0);
                                    obtain.setBoundsInParent(rect);
                                    if (sparseArray.get(i) == null) {
                                        sparseArray.put(i, new Rect(rect));
                                    }
                                    z4 = true;
                                    rect.offset(iArr3[0], iArr3[1]);
                                    obtain.setBoundsInScreen(rect);
                                }
                            } else {
                                iArr2 = Z1;
                            }
                            Z1 = iArr2;
                        }
                        obtain.setClassName("android.widget.TextView");
                        obtain.setEnabled(z4);
                        obtain.setClickable(z4);
                        obtain.setLongClickable(z4);
                        obtain.addAction(16);
                        obtain.addAction(32);
                        z2 = true;
                    }
                }
                return null;
            }
            if (i >= 2000) {
                CharSequence charSequence2 = gb2Var.Q5.v;
                if (charSequence2 instanceof Spannable) {
                    Spannable spannable2 = (Spannable) charSequence2;
                    ClickableSpan a2 = a(i, false);
                    if (a2 != null) {
                        int[] Z12 = gb2.Z1(spannable2, a2);
                        obtain.setText(spannable2.subSequence(Z12[0], Z12[1]).toString());
                        ArrayList arrayList11 = gb2Var.Q5.B2;
                        int size5 = arrayList11.size();
                        int i18 = 0;
                        while (true) {
                            if (i18 >= size5) {
                                z3 = true;
                                break;
                            }
                            Object obj2 = arrayList11.get(i18);
                            i18++;
                            h27 h27Var2 = (h27) obj2;
                            int length2 = h27Var2.e.getText().length();
                            int i19 = h27Var2.n;
                            int i20 = Z12[0];
                            if (i19 <= i20) {
                                int i21 = length2 + i19;
                                iArr = Z12;
                                int i22 = iArr[1];
                                if (i21 >= i22) {
                                    h27Var2.e.getSelectionPath(i20 - i19, i22 - i19, path);
                                    path.computeBounds(rectF2, true);
                                    rect.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                                    rect.offset(0, (int) h27Var2.p(gb2Var.Q5.B2, gb2Var.ub));
                                    rect.offset(gb2Var.o0, gb2Var.u0);
                                    obtain.setBoundsInParent(rect);
                                    if (sparseArray.get(i) == null) {
                                        sparseArray.put(i, new Rect(rect));
                                    }
                                    z3 = true;
                                    rect.offset(iArr3[0], iArr3[1]);
                                    obtain.setBoundsInScreen(rect);
                                }
                            } else {
                                iArr = Z12;
                            }
                            Z12 = iArr;
                        }
                        obtain.setClassName("android.widget.TextView");
                        obtain.setEnabled(z3);
                        obtain.setClickable(z3);
                        obtain.setLongClickable(z3);
                        obtain.addAction(16);
                        obtain.addAction(32);
                        z2 = true;
                    }
                }
                return null;
            }
            if (i >= 1000) {
                int i23 = i - 1000;
                if (i23 < arrayList9.size()) {
                    wo0 wo0Var = (wo0) arrayList9.get(i23);
                    if (!wo0Var.b) {
                        obtain.setText(wo0Var.h.i());
                        obtain.setClassName("android.widget.Button");
                        obtain.setEnabled(true);
                        obtain.setClickable(true);
                        obtain.addAction(16);
                        float f3 = wo0Var.c;
                        float f4 = gb2Var.K5;
                        int i24 = wo0Var.d;
                        rect.set((int) (f3 * f4), i24, (int) ((f3 + wo0Var.e) * f4), wo0Var.f + i24);
                        rect.offset(gb2Var.Q5.O3() ? (gb2Var.getMeasuredWidth() - gb2Var.getWidthForButtons()) - gl.L(10.0f) : gb2Var.N6 + gl.L(gb2Var.C6 ? 1.0f : 7.0f), gb2Var.e7);
                        obtain.setBoundsInParent(rect);
                        if (sparseArray.get(i) == null) {
                            sparseArray.put(i, new Rect(rect));
                        }
                        rect.offset(iArr3[0], iArr3[1]);
                        obtain.setBoundsInScreen(rect);
                        z2 = true;
                    }
                }
                return null;
            }
            if (i >= 500) {
                int i25 = i - 500;
                if (i25 < arrayList8.size()) {
                    fb2 fb2Var = (fb2) arrayList8.get(i25);
                    StringBuilder sb = new StringBuilder(fb2Var.p.getText());
                    if (gb2Var.W4) {
                        obtain.setSelected(fb2Var.i);
                        sb.append(", ");
                        sb.append(fb2Var.d);
                        sb.append("%");
                        TLRPC.Poll poll = gb2Var.j5;
                        if (poll != null && poll.quiz && (fb2Var.i || fb2Var.l)) {
                            sb.append(", ");
                            if (fb2Var.l) {
                                str2 = "AccDescrQuizCorrectAnswer";
                                i3 = 2131754795;
                            } else {
                                str2 = "AccDescrQuizIncorrectAnswer";
                                i3 = 2131754793;
                            }
                            sb.append(k96.M0(i3, str2));
                        }
                    } else {
                        obtain.setClassName("android.widget.Button");
                    }
                    obtain.setText(sb);
                    obtain.setEnabled(true);
                    obtain.addAction(16);
                    int i26 = fb2Var.b + gb2Var.gb;
                    int L = gb2Var.b7 - gl.L(76.0f);
                    int i27 = fb2Var.a;
                    rect.set(i27, i26, L + i27, fb2Var.c + i26);
                    obtain.setBoundsInParent(rect);
                    if (sparseArray.get(i) == null) {
                        sparseArray.put(i, new Rect(rect));
                    }
                    z = true;
                    rect.offset(iArr3[0], iArr3[1]);
                    obtain.setBoundsInScreen(rect);
                    obtain.setClickable(true);
                }
                return null;
            }
            z = true;
            if (i == 495) {
                obtain.setClassName("android.widget.Button");
                obtain.setEnabled(true);
                obtain.setText(k96.L0(2131754794));
                obtain.addAction(16);
                rect.set(gb2Var.o5 - gl.L(8.0f), gb2Var.p5 - gl.L(8.0f), gl.L(32.0f) + gb2Var.o5, gl.L(32.0f) + gb2Var.p5);
                obtain.setBoundsInParent(rect);
                if (sparseArray.get(i) == null || !((Rect) sparseArray.get(i)).equals(rect)) {
                    sparseArray.put(i, new Rect(rect));
                }
                z = true;
                rect.offset(iArr3[0], iArr3[1]);
                obtain.setBoundsInScreen(rect);
                obtain.setClickable(true);
            } else if (i == 499) {
                obtain.setClassName("android.widget.Button");
                obtain.setEnabled(true);
                StaticLayout staticLayout2 = gb2Var.r2;
                if (staticLayout2 != null) {
                    obtain.setText(staticLayout2.getText());
                }
                obtain.addAction(16);
                gb2Var.M2.round(rect);
                obtain.setBoundsInParent(rect);
                if (sparseArray.get(i) == null || !((Rect) sparseArray.get(i)).equals(rect)) {
                    sparseArray.put(i, new Rect(rect));
                }
                z = true;
                rect.offset(iArr3[0], iArr3[1]);
                obtain.setBoundsInScreen(rect);
                obtain.setClickable(true);
            } else if (i == 492) {
                obtain.setClassName("android.widget.Button");
                obtain.setEnabled(true);
                StaticLayout staticLayout3 = gb2Var.o2;
                if (staticLayout3 != null) {
                    obtain.setText(staticLayout3.getText());
                }
                obtain.addAction(16);
                gb2Var.v2.round(rect);
                hb2 hb2Var2 = gb2Var.w2;
                if (hb2Var2 != null && (arrayList = hb2Var2.g) != null && arrayList.size() > 1) {
                    db2 db2Var = (db2) gb2Var.w2.g.get(0);
                    if (!db2Var.e.isEmpty()) {
                        rect.set(rect.left, rect.top, rect.right, (int) (rect.bottom - db2Var.e.height()));
                    }
                }
                obtain.setBoundsInParent(rect);
                if (sparseArray.get(i) == null || !((Rect) sparseArray.get(i)).equals(rect)) {
                    sparseArray.put(i, new Rect(rect));
                }
                z = true;
                rect.offset(iArr3[0], iArr3[1]);
                obtain.setBoundsInScreen(rect);
                obtain.setClickable(true);
            } else {
                int i28 = 491;
                if (i != 491) {
                    if (i == 490 || i == 489) {
                        i28 = 491;
                    } else if (i == 498) {
                        obtain.setClassName("android.widget.ImageButton");
                        obtain.setEnabled(true);
                        if (gb2Var.I2(gb2Var.Q5)) {
                            obtain.setContentDescription(k96.M0(2131754818, "AccDescrOpenChat"));
                        } else {
                            obtain.setContentDescription(k96.M0(2131745267, "ShareFile"));
                        }
                        obtain.addAction(16);
                        int i29 = (int) gb2Var.d9;
                        rect.set(i29, (int) gb2Var.e9, gl.L(40.0f) + i29, gl.L(32.0f) + ((int) gb2Var.e9));
                        obtain.setBoundsInParent(rect);
                        if (sparseArray.get(i) == null || !((Rect) sparseArray.get(i)).equals(rect)) {
                            sparseArray.put(i, new Rect(rect));
                        }
                        z = true;
                        rect.offset(iArr3[0], iArr3[1]);
                        obtain.setBoundsInScreen(rect);
                        obtain.setClickable(true);
                    } else if (i == 497) {
                        obtain.setEnabled(true);
                        StringBuilder sb2 = new StringBuilder(k96.M0(2131746070, "Reply"));
                        sb2.append(", ");
                        StaticLayout staticLayout4 = gb2Var.Q7;
                        if (staticLayout4 != null) {
                            sb2.append(staticLayout4.getText());
                            sb2.append(", ");
                        }
                        StaticLayout staticLayout5 = gb2Var.R7;
                        if (staticLayout5 != null) {
                            sb2.append(staticLayout5.getText());
                        }
                        obtain.setContentDescription(sb2.toString());
                        obtain.addAction(16);
                        int i30 = gb2Var.U7;
                        rect.set(i30, gb2Var.V7, Math.max(gb2Var.X7, gb2Var.Z7) + i30, gb2Var.V7 + ((int) gb2Var.W7));
                        obtain.setBoundsInParent(rect);
                        if (sparseArray.get(i) == null || !((Rect) sparseArray.get(i)).equals(rect)) {
                            sparseArray.put(i, new Rect(rect));
                        }
                        z = true;
                        rect.offset(iArr3[0], iArr3[1]);
                        obtain.setBoundsInScreen(rect);
                        obtain.setClickable(true);
                    } else if (i == 494) {
                        obtain.setEnabled(true);
                        StringBuilder sb3 = new StringBuilder();
                        if (staticLayoutArr2[0] != null && staticLayoutArr2[1] != null) {
                            int i31 = 0;
                            while (i31 < 2) {
                                sb3.append(staticLayoutArr2[i31].getText());
                                sb3.append(i31 == 0 ? " " : "\n");
                                i31++;
                            }
                        }
                        obtain.setContentDescription(sb3.toString());
                        obtain.addAction(16);
                        float f5 = gb2Var.F9;
                        float[] fArr = gb2Var.I9;
                        int min = (int) Math.min(f5 - fArr[0], f5 - fArr[1]);
                        int i32 = gb2Var.G9;
                        rect.set(min, i32, gb2Var.D9 + min, gb2Var.H9 + i32);
                        obtain.setBoundsInParent(rect);
                        if (sparseArray.get(i) == null || !((Rect) sparseArray.get(i)).equals(rect)) {
                            sparseArray.put(i, new Rect(rect));
                        }
                        z = true;
                        rect.offset(iArr3[0], iArr3[1]);
                        obtain.setBoundsInScreen(rect);
                        obtain.setClickable(true);
                    } else if (i == 496) {
                        obtain.setClassName("android.widget.Button");
                        obtain.setEnabled(true);
                        int repliesCount = gb2Var.getRepliesCount();
                        k27 k27Var2 = gb2Var.Q5;
                        if (k27Var2 == null || k27Var2.O5() || gb2Var.Q5.G2()) {
                            S = (gb2Var.u6 || repliesCount <= 0) ? null : k96.S(null, repliesCount);
                        } else if (gb2Var.u6) {
                            S = k96.M0(2131743310, "ViewInChat");
                        } else {
                            S = repliesCount == 0 ? k96.M0(2131748816, "LeaveAComment") : k96.G(repliesCount, "CommentsCount", new Object[0]);
                        }
                        if (S != null) {
                            obtain.setText(S);
                        }
                        obtain.addAction(16);
                        rect.set(gb2Var.y7);
                        obtain.setBoundsInParent(rect);
                        if (sparseArray.get(i) == null || !((Rect) sparseArray.get(i)).equals(rect)) {
                            sparseArray.put(i, new Rect(rect));
                        }
                        z = true;
                        rect.offset(iArr3[0], iArr3[1]);
                        obtain.setBoundsInScreen(rect);
                        obtain.setClickable(true);
                    } else if (i == 493) {
                        obtain.setClassName("android.widget.Button");
                        obtain.setEnabled(true);
                        if (gb2Var.Q5.S4()) {
                            str = "AccActionCloseTranscription";
                            i2 = 2131754939;
                        } else {
                            str = "AccActionOpenTranscription";
                            i2 = 2131754931;
                        }
                        obtain.setText(k96.M0(i2, str));
                        obtain.addAction(16);
                        if (gb2Var.J4 != null) {
                            rect.set((int) gb2Var.F1().b, (int) gb2Var.F1().c, (int) (gb2Var.F1().b + gb2Var.J4.B()), (int) (gb2Var.F1().c + gb2Var.J4.h()));
                        }
                        obtain.setBoundsInParent(rect);
                        z = true;
                        rect.offset(iArr3[0], iArr3[1]);
                        obtain.setBoundsInScreen(rect);
                        obtain.setClickable(true);
                    }
                }
                byte b4 = i == i28 ? (byte) 5 : i == 490 ? (byte) 31 : (byte) 30;
                int i33 = 0;
                while (true) {
                    hb2 hb2Var3 = gb2Var.w2;
                    if (hb2Var3 == null || i33 >= hb2Var3.g.size()) {
                        break;
                    }
                    db2 db2Var2 = (db2) gb2Var.w2.g.get(i33);
                    if (db2Var2.a == b4) {
                        obtain.setClassName("android.widget.Button");
                        obtain.setEnabled(true);
                        StaticLayout staticLayout6 = db2Var2.d;
                        if (staticLayout6 != null) {
                            obtain.setText(staticLayout6.getText());
                        }
                        obtain.addAction(16);
                        db2Var2.e.round(rect);
                        obtain.setBoundsInParent(rect);
                        if (sparseArray.get(i) == null || !((Rect) sparseArray.get(i)).equals(rect)) {
                            sparseArray.put(i, new Rect(rect));
                        }
                        z2 = true;
                        rect.offset(iArr3[0], iArr3[1]);
                        obtain.setBoundsInScreen(rect);
                        obtain.setClickable(true);
                    } else {
                        i33++;
                    }
                }
                z2 = true;
            }
            z2 = z;
            obtain.setFocusable(z2);
            obtain.setVisibleToUser(z2);
            return obtain;
        }
        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain(gb2Var);
        gb2Var.onInitializeAccessibilityNodeInfo(obtain2);
        k27 k27Var3 = gb2Var.Q5;
        if (k27Var3 != null && k27Var3.N3()) {
            k27 k27Var4 = gb2Var.Q5;
            if (!k27Var4.r1 && k27Var4.E4()) {
                z5 = true;
                k27 k27Var5 = gb2Var.Q5;
                boolean z8 = k27Var5 == null && k27Var5.R2();
                k27 k27Var6 = gb2Var.Q5;
                j = k27Var6 == null ? k27Var6.H0 : 0L;
                spannableStringBuilder = gb2Var.P2;
                if (spannableStringBuilder == null) {
                    staticLayoutArr = staticLayoutArr2;
                    if (gb2Var.Q2 == z5 && gb2Var.R2 == z8) {
                        arrayList3 = arrayList8;
                        arrayList2 = arrayList9;
                        if (gb2Var.S2 == j) {
                            accessibilityNodeInfo = obtain2;
                            arrayList4 = arrayList3;
                            if (Build.VERSION.SDK_INT < 24) {
                                accessibilityNodeInfo2 = accessibilityNodeInfo;
                                accessibilityNodeInfo2.setContentDescription(spannableStringBuilder.toString());
                            } else {
                                accessibilityNodeInfo2 = accessibilityNodeInfo;
                                accessibilityNodeInfo2.setText(spannableStringBuilder);
                            }
                            accessibilityNodeInfo2.setEnabled(true);
                            collectionItemInfo = accessibilityNodeInfo2.getCollectionItemInfo();
                            if (collectionItemInfo != null) {
                                accessibilityNodeInfo2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(collectionItemInfo.getRowIndex(), 1, 0, 1, false));
                            }
                            accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_msg_options, k96.M0(2131754936, "AccActionMessageOptions")));
                            int iconForCurrentState = gb2Var.getIconForCurrentState();
                            accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, iconForCurrentState != 0 ? iconForCurrentState != 1 ? iconForCurrentState != 2 ? iconForCurrentState != 3 ? iconForCurrentState != 5 ? gb2Var.Q5.D == 16 ? k96.M0(2131752621, "CallAgain") : null : k96.M0(2131754933, "AccActionOpenFile") : k96.M0(2131754941, "AccActionCancelDownload") : k96.M0(2131754938, "AccActionDownload") : k96.M0(2131754930, "AccActionPause") : k96.M0(2131754929, "AccActionPlay")));
                            accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, k96.M0(2131754937, "AccActionEnterSelectionMode")));
                            if (gb2Var.getMiniIconForCurrentState() == 2) {
                                accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_small_button, k96.M0(2131754938, "AccActionDownload")));
                            }
                            if (!gb2Var.V8 || gb2Var.s8) {
                                accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_summarize, k96.M0(2131744087, "SummaryTitle")));
                            }
                            arrayList6 = gb2Var.Q5.B2;
                            if (arrayList6 != null) {
                                int size6 = arrayList6.size();
                                int i34 = 0;
                                while (true) {
                                    if (i34 >= size6) {
                                        break;
                                    }
                                    Object obj3 = arrayList6.get(i34);
                                    i34++;
                                    if (((h27) obj3).O) {
                                        accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_copy_code, k96.M0(2131751753, "CopyCode")));
                                        break;
                                    }
                                }
                            }
                            if ((!gb2Var.Q5.O4() || gb2Var.Q5.g4() || gb2Var.Q5.I3()) && MediaController.w().D(gb2Var.Q5)) {
                                gb2Var.F4.f(accessibilityNodeInfo2);
                            }
                            if (gb2Var.I4 && gb2Var.J4 != null) {
                                accessibilityNodeInfo2.addChild(gb2Var, 493);
                            }
                            if (Build.VERSION.SDK_INT < 24) {
                                if (gb2Var.f6 && gb2Var.va != null && !gb2Var.Q5.N3()) {
                                    accessibilityNodeInfo2.addChild(gb2Var, 5000);
                                }
                                CharSequence charSequence3 = gb2Var.Q5.v;
                                if (charSequence3 instanceof Spannable) {
                                    Spannable spannable3 = (Spannable) charSequence3;
                                    int i35 = 0;
                                    for (CharacterStyle characterStyle : (CharacterStyle[]) spannable3.getSpans(0, spannable3.length(), ClickableSpan.class)) {
                                        accessibilityNodeInfo2.addChild(gb2Var, i35 + 2000);
                                        i35++;
                                    }
                                }
                                CharSequence charSequence4 = gb2Var.Q5.z;
                                if ((charSequence4 instanceof Spannable) && gb2Var.m3 != null) {
                                    Spannable spannable4 = (Spannable) charSequence4;
                                    int i36 = 0;
                                    for (CharacterStyle characterStyle2 : (CharacterStyle[]) spannable4.getSpans(0, spannable4.length(), ClickableSpan.class)) {
                                        accessibilityNodeInfo2.addChild(gb2Var, i36 + 3000);
                                        i36++;
                                    }
                                }
                            }
                            size = arrayList2.size();
                            int i37 = 0;
                            i7 = 0;
                            while (i7 < size) {
                                Object obj4 = arrayList2.get(i7);
                                i7++;
                                accessibilityNodeInfo2.addChild(gb2Var, i37 + 1000);
                                i37++;
                            }
                            if (gb2Var.r5 && gb2Var.o5 != -1 && gb2Var.Q5.S3()) {
                                accessibilityNodeInfo2.addChild(gb2Var, 495);
                            }
                            size2 = arrayList4.size();
                            int i38 = 0;
                            i8 = 0;
                            while (i8 < size2) {
                                Object obj5 = arrayList4.get(i8);
                                i8++;
                                accessibilityNodeInfo2.addChild(gb2Var, i38 + 500);
                                i38++;
                            }
                            if (gb2Var.u2 && !gb2Var.M2.isEmpty()) {
                                accessibilityNodeInfo2.addChild(gb2Var, 499);
                            }
                            hb2Var = gb2Var.w2;
                            if (hb2Var != null && hb2Var.b && (rectF = gb2Var.v2) != null && !rectF.isEmpty()) {
                                accessibilityNodeInfo2.addChild(gb2Var, 492);
                                arrayList7 = gb2Var.w2.g;
                                if (arrayList7 != null && arrayList7.size() > 1) {
                                    ArrayList arrayList12 = gb2Var.w2.g;
                                    size3 = arrayList12.size();
                                    i10 = 0;
                                    while (i10 < size3) {
                                        Object obj6 = arrayList12.get(i10);
                                        i10++;
                                        db2 db2Var3 = (db2) obj6;
                                        if (gb2Var.w2.d && db2Var3.a == 5 && !db2Var3.e.isEmpty()) {
                                            accessibilityNodeInfo2.addChild(gb2Var, 491);
                                        }
                                        if (gb2Var.w2.e && db2Var3.a == 31 && !db2Var3.e.isEmpty()) {
                                            accessibilityNodeInfo2.addChild(gb2Var, 490);
                                        }
                                        if (gb2Var.w2.c && db2Var3.a == 30 && !db2Var3.e.isEmpty()) {
                                            accessibilityNodeInfo2.addChild(gb2Var, 489);
                                        }
                                    }
                                }
                            }
                            if (gb2Var.n7 != null) {
                                accessibilityNodeInfo2.addChild(gb2Var, 496);
                            }
                            b2 = gb2Var.R8;
                            if (b2 != 1 || b2 == 2) {
                                accessibilityNodeInfo2.addChild(gb2Var, 498);
                            }
                            if (gb2Var.Q7 != null) {
                                accessibilityNodeInfo2.addChild(gb2Var, 497);
                            }
                            k27Var = gb2Var.Q5;
                            if (k27Var != null && (rh9Var2 = k27Var.y2) != null) {
                                int i39 = 0;
                                for (i9 = 0; i9 < rh9Var2.g.size(); i9++) {
                                    mg9 mg9Var = (mg9) rh9Var2.g.get(i9);
                                    if (mg9Var.S()) {
                                        int C = mg9Var.C() + (mg9Var.r == null ? 0 : 1);
                                        for (int i40 = 0; i40 < C; i40++) {
                                            accessibilityNodeInfo2.addChild(gb2Var, i39 + 6000 + i40);
                                        }
                                        i39 += C;
                                    }
                                }
                            }
                            if (staticLayoutArr[0] != null && staticLayoutArr[1] != null) {
                                accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_open_forwarded_origin, k96.M0(2131754932, "AccActionOpenForwardedOrigin")));
                            }
                            if (gb2Var.k1 && gb2Var.getBackground() == null) {
                                return accessibilityNodeInfo2;
                            }
                            accessibilityNodeInfo2.setSelected(true);
                            return accessibilityNodeInfo2;
                        }
                    } else {
                        arrayList3 = arrayList8;
                        arrayList2 = arrayList9;
                    }
                } else {
                    arrayList2 = arrayList9;
                    staticLayoutArr = staticLayoutArr2;
                    arrayList3 = arrayList8;
                }
                spannableStringBuilder = new SpannableStringBuilder();
                if (gb2Var.f6 || gb2Var.va == null || gb2Var.Q5.N3()) {
                    accessibilityNodeInfo = obtain2;
                    arrayList4 = arrayList3;
                    j2 = j;
                } else {
                    spannableStringBuilder.append((CharSequence) l7c.q(gb2Var.va));
                    accessibilityNodeInfo = obtain2;
                    arrayList4 = arrayList3;
                    spannableStringBuilder.setSpan(new oa2(this, gb2Var.va), 0, spannableStringBuilder.length(), 33);
                    CharSequence adminAccessibilityText = gb2Var.getAdminAccessibilityText();
                    if (TextUtils.isEmpty(adminAccessibilityText)) {
                        j2 = j;
                    } else if (gb2Var.l9) {
                        j2 = j;
                        spannableStringBuilder.append(' ').append((CharSequence) k96.Z(gb2Var.j9 ? 2131754726 : 2131754725, adminAccessibilityText));
                    } else {
                        j2 = j;
                        spannableStringBuilder.append((CharSequence) ", ").append(adminAccessibilityText);
                    }
                    spannableStringBuilder.append('\n');
                }
                if (gb2Var.E9) {
                    int i41 = 0;
                    while (i41 < 2) {
                        StaticLayout staticLayout7 = staticLayoutArr[i41];
                        if (staticLayout7 != null && staticLayout7.getText() != null) {
                            spannableStringBuilder.append(staticLayoutArr[i41].getText());
                            spannableStringBuilder.append(i41 == 0 ? " " : "\n");
                        }
                        i41++;
                    }
                }
                document = gb2Var.N1;
                if (document != null && gb2Var.M1 == 1) {
                    s = ba4.s(document);
                    if (s.indexOf(46) != -1) {
                        spannableStringBuilder.append((CharSequence) k96.Z(2131754889, s.substring(s.lastIndexOf(46) + 1).toUpperCase(Locale.ROOT)));
                    }
                }
                rh9Var = gb2Var.Q5.y2;
                if (rh9Var == null && !rh9Var.g.isEmpty()) {
                    ArrayList arrayList13 = gb2Var.Q5.y2.g;
                    int size7 = arrayList13.size();
                    int i42 = 0;
                    while (i42 < size7) {
                        Object obj7 = arrayList13.get(i42);
                        i42++;
                        mg9 mg9Var2 = (mg9) obj7;
                        if (mg9Var2.S()) {
                            int length3 = spannableStringBuilder.length();
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                            mg9Var2.k(spannableStringBuilder2);
                            ArrayList arrayList14 = arrayList13;
                            CharSequence y = mg9Var2.y();
                            int i43 = size7;
                            CharSequence text = (!mg9Var2.x || (staticLayout = mg9Var2.d) == null) ? null : staticLayout.getText();
                            if (!TextUtils.isEmpty(text)) {
                                spannableStringBuilder.append(text);
                                if (!TextUtils.isEmpty(y) || spannableStringBuilder2.length() > 0) {
                                    spannableStringBuilder.append(' ');
                                }
                            }
                            if (!TextUtils.isEmpty(y)) {
                                spannableStringBuilder.append(y);
                                if (spannableStringBuilder2.length() > 0) {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                            }
                            spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                            if (spannableStringBuilder.length() > length3 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
                                spannableStringBuilder.append('\n');
                            }
                            arrayList13 = arrayList14;
                            size7 = i43;
                        }
                    }
                } else if (!TextUtils.isEmpty(gb2Var.Q5.v)) {
                    CharSequence charSequence5 = gb2Var.Q5.v;
                    if (charSequence5 instanceof Spanned) {
                        Spanned spanned = (Spanned) charSequence5;
                        nj2[] nj2VarArr = (nj2[]) spanned.getSpans(0, spanned.length(), nj2.class);
                        if (nj2VarArr != null && nj2VarArr.length > 0) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(charSequence5);
                            Arrays.sort(nj2VarArr, new na2(spanned, (byte) 0));
                            int length4 = nj2VarArr.length;
                            int i44 = 0;
                            while (i44 < length4) {
                                nj2 nj2Var = nj2VarArr[i44];
                                int i45 = length4;
                                int spanStart = spanned.getSpanStart(nj2Var);
                                Spanned spanned2 = spanned;
                                if (spanStart >= 0) {
                                    spannableStringBuilder3.insert(spanStart, (CharSequence) (((Object) (TextUtils.isEmpty(nj2Var.a) ? k96.L0(2131754897) : k96.Z(2131754896, h27.b(nj2Var.a)))) + ". "));
                                }
                                i44++;
                                length4 = i45;
                                spanned = spanned2;
                            }
                            charSequence5 = spannableStringBuilder3;
                        }
                    }
                    spannableStringBuilder.append(charSequence5);
                }
                if (gb2Var.N1 != null && (((b = gb2Var.M1) == 1 || b == 2 || b == 4) && gb2Var.O3 == 1 && gb2Var.A3 != null)) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    if (gb2Var.Q5.n4()) {
                        str4 = "AccDescrDownloadProgress";
                        i6 = 2131754888;
                    } else {
                        str4 = "AccDescrUploadProgress";
                        i6 = 2131754741;
                    }
                    spannableStringBuilder.append((CharSequence) k96.Y(i6, str4, gl.i0(gb2Var.Q5.H0, false, false), gl.i0(gb2Var.A1, false, false)));
                }
                if (!gb2Var.Q5.I3()) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    spannableStringBuilder.append((CharSequence) k96.Y(2131754831, "AccDescrMusicInfo", gb2Var.Q5.w1(true), gb2Var.Q5.y1(true)));
                    spannableStringBuilder.append((CharSequence) ", ");
                    spannableStringBuilder.append((CharSequence) k96.z((int) gb2Var.Q5.L0()));
                } else if (gb2Var.Q5.O4() || gb2Var.Kb) {
                    spannableStringBuilder.append((CharSequence) ", ");
                    spannableStringBuilder.append((CharSequence) k96.z((int) gb2Var.Q5.L0()));
                    spannableStringBuilder.append((CharSequence) ", ");
                    if (gb2Var.Q5.R2()) {
                        spannableStringBuilder.append((CharSequence) k96.M0(2131754837, "AccDescrMsgNotPlayed"));
                    } else {
                        spannableStringBuilder.append((CharSequence) k96.M0(2131754836, "AccDescrMsgPlayed"));
                    }
                }
                if (gb2Var.j5 != null) {
                    spannableStringBuilder.append((CharSequence) ", ");
                    spannableStringBuilder.append((CharSequence) gb2Var.j5.question.text);
                    spannableStringBuilder.append((CharSequence) ", ");
                    if (gb2Var.X4) {
                        M0 = k96.M0(2131750678, "FinalResults");
                    } else {
                        TLRPC.Poll poll2 = gb2Var.j5;
                        boolean z9 = poll2.quiz;
                        boolean z10 = poll2.public_voters;
                        M0 = z9 ? z10 ? k96.M0(2131746252, "QuizPoll") : k96.M0(2131754245, "AnonymousQuizPoll") : z10 ? k96.M0(2131746395, "PublicPoll") : k96.M0(2131754246, "AnonymousPoll");
                    }
                    spannableStringBuilder.append((CharSequence) M0);
                }
                if (gb2Var.N1 != null) {
                    if (gb2Var.M1 == 4) {
                        spannableStringBuilder.append((CharSequence) ", ");
                        spannableStringBuilder.append((CharSequence) k96.z((int) gb2Var.Q5.L0()));
                    }
                    if (gb2Var.O3 == 0 || gb2Var.M1 == 1) {
                        spannableStringBuilder.append((CharSequence) ", ");
                        spannableStringBuilder.append((CharSequence) gl.i0(gb2Var.N1.size, false, false));
                    }
                }
                if (!gb2Var.Q5.S4()) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    spannableStringBuilder.append(gb2Var.Q5.i2());
                } else if (k27.n1(gb2Var.Q5.k) != null && !TextUtils.isEmpty(gb2Var.Q5.z)) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    spannableStringBuilder.append(gb2Var.Q5.z);
                }
                if (gb2Var.Q5.N3()) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    spannableStringBuilder.append((CharSequence) k96.Y(2131754788, "AccDescrReceivedDate", k96.M0(2131743871, "TodayAt") + " " + ((Object) gb2Var.Q9)));
                } else if (gb2Var.Q5.p4()) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    if (gb2Var.Q5.r1) {
                        spannableStringBuilder.append((CharSequence) k96.Y(2131754780, "AccDescrScheduledDate", gb2Var.Q9));
                    } else {
                        spannableStringBuilder.append((CharSequence) k96.Y(2131754764, "AccDescrSentDate", k96.M0(2131743871, "TodayAt") + " " + ((Object) gb2Var.Q9)));
                        spannableStringBuilder.append((CharSequence) ", ");
                        if (gb2Var.Q5.E4()) {
                            str3 = "AccDescrMsgUnread";
                            i5 = 2131754832;
                        } else {
                            str3 = "AccDescrMsgRead";
                            i5 = 2131754835;
                        }
                        spannableStringBuilder.append((CharSequence) k96.M0(i5, str3));
                    }
                } else if (gb2Var.Q5.n4()) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    spannableStringBuilder.append((CharSequence) k96.M0(2131754834, "AccDescrMsgSending"));
                    RadialProgress2 radialProgress2 = gb2Var.Q0;
                    float f6 = (radialProgress2.c ? radialProgress2.j : radialProgress2.i).w;
                    if (f6 > 0.0f) {
                        spannableStringBuilder.append((CharSequence) Integer.toString(Math.round(f6 * 100.0f))).append((CharSequence) "%");
                    }
                } else if (gb2Var.Q5.m4()) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    spannableStringBuilder.append((CharSequence) k96.M0(2131754833, "AccDescrMsgSendingError"));
                }
                if (gb2Var.getRepliesCount() > 0 && !gb2Var.x7) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    spannableStringBuilder.append((CharSequence) k96.G(gb2Var.getRepliesCount(), "AccDescrNumberOfReplies", new Object[0]));
                }
                tL_messageReactions = gb2Var.Q5.k.reactions;
                if (tL_messageReactions != null && (arrayList5 = tL_messageReactions.results) != null) {
                    String str5 = "";
                    if (arrayList5.size() != 1) {
                        TLRPC.ReactionCount reactionCount = gb2Var.Q5.k.reactions.results.get(0);
                        TLRPC.Reaction reaction = reactionCount.reaction;
                        String str6 = reaction instanceof TLRPC.TL_reactionEmoji ? ((TLRPC.TL_reactionEmoji) reaction).emoticon : "";
                        int i46 = reactionCount.count;
                        if (i46 == 1) {
                            spannableStringBuilder.append((CharSequence) "\n");
                            ArrayList<TLRPC.MessagePeerReaction> arrayList15 = gb2Var.Q5.k.reactions.recent_reactions;
                            if (arrayList15 == null || arrayList15.size() != 1 || (messagePeerReaction = gb2Var.Q5.k.reactions.recent_reactions.get(0)) == null) {
                                z6 = false;
                            } else {
                                TLRPC.User V1 = na7.q1(gb2Var.a6).V1(Long.valueOf(k27.B1(messagePeerReaction.peer_id)));
                                z6 = l7c.C(V1);
                                if (V1 != null) {
                                    str5 = l7c.j(V1);
                                }
                            }
                            if (z6) {
                                spannableStringBuilder.append((CharSequence) k96.Y(2131754724, "AccDescrYouReactedWith", str6));
                            } else {
                                spannableStringBuilder.append((CharSequence) k96.Y(2131754790, "AccDescrReactedWith", str5, str6));
                            }
                        } else if (i46 > 1) {
                            spannableStringBuilder.append((CharSequence) "\n");
                            spannableStringBuilder.append((CharSequence) k96.G(reactionCount.count, "AccDescrNumberOfPeopleReactions", str6));
                        }
                    } else {
                        spannableStringBuilder.append((CharSequence) k96.M0(2131746194, "Reactions")).append((CharSequence) ": ");
                        int size8 = gb2Var.Q5.k.reactions.results.size();
                        int i47 = 0;
                        while (i47 < size8) {
                            TLRPC.ReactionCount reactionCount2 = gb2Var.Q5.k.reactions.results.get(i47);
                            TLRPC.Reaction reaction2 = reactionCount2.reaction;
                            spannableStringBuilder.append((CharSequence) (reaction2 instanceof TLRPC.TL_reactionEmoji ? ((TLRPC.TL_reactionEmoji) reaction2).emoticon : "")).append((CharSequence) " ").append((CharSequence) (reactionCount2.count + ""));
                            i47++;
                            if (i47 < size8) {
                                spannableStringBuilder.append((CharSequence) ", ");
                            }
                        }
                        spannableStringBuilder.append((CharSequence) "\n");
                    }
                }
                if ((gb2Var.Q5.k.flags & 1024) == 0) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    i4 = 0;
                    spannableStringBuilder.append((CharSequence) k96.G(gb2Var.Q5.k.views, "AccDescrNumberOfViews", new Object[0]));
                } else {
                    i4 = 0;
                }
                spannableStringBuilder.append((CharSequence) "\n");
                for (CharacterStyle characterStyle3 : (CharacterStyle[]) spannableStringBuilder.getSpans(i4, spannableStringBuilder.length(), ClickableSpan.class)) {
                    int spanStart2 = spannableStringBuilder.getSpanStart(characterStyle3);
                    int spanEnd = spannableStringBuilder.getSpanEnd(characterStyle3);
                    spannableStringBuilder.removeSpan(characterStyle3);
                    spannableStringBuilder.setSpan(new q1((Object) this, (Object) characterStyle3, (byte) 5), spanStart2, spanEnd, 33);
                }
                gb2Var.P2 = spannableStringBuilder;
                gb2Var.Q2 = z5;
                gb2Var.R2 = z8;
                gb2Var.S2 = j2;
                if (Build.VERSION.SDK_INT < 24) {
                }
                accessibilityNodeInfo2.setEnabled(true);
                collectionItemInfo = accessibilityNodeInfo2.getCollectionItemInfo();
                if (collectionItemInfo != null) {
                }
                accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_msg_options, k96.M0(2131754936, "AccActionMessageOptions")));
                int iconForCurrentState2 = gb2Var.getIconForCurrentState();
                accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, iconForCurrentState2 != 0 ? iconForCurrentState2 != 1 ? iconForCurrentState2 != 2 ? iconForCurrentState2 != 3 ? iconForCurrentState2 != 5 ? gb2Var.Q5.D == 16 ? k96.M0(2131752621, "CallAgain") : null : k96.M0(2131754933, "AccActionOpenFile") : k96.M0(2131754941, "AccActionCancelDownload") : k96.M0(2131754938, "AccActionDownload") : k96.M0(2131754930, "AccActionPause") : k96.M0(2131754929, "AccActionPlay")));
                accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, k96.M0(2131754937, "AccActionEnterSelectionMode")));
                if (gb2Var.getMiniIconForCurrentState() == 2) {
                }
                if (!gb2Var.V8) {
                }
                accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_summarize, k96.M0(2131744087, "SummaryTitle")));
                arrayList6 = gb2Var.Q5.B2;
                if (arrayList6 != null) {
                }
                if (!gb2Var.Q5.O4()) {
                }
                gb2Var.F4.f(accessibilityNodeInfo2);
                if (gb2Var.I4) {
                    accessibilityNodeInfo2.addChild(gb2Var, 493);
                }
                if (Build.VERSION.SDK_INT < 24) {
                }
                size = arrayList2.size();
                int i372 = 0;
                i7 = 0;
                while (i7 < size) {
                }
                if (gb2Var.r5) {
                    accessibilityNodeInfo2.addChild(gb2Var, 495);
                }
                size2 = arrayList4.size();
                int i382 = 0;
                i8 = 0;
                while (i8 < size2) {
                }
                if (gb2Var.u2) {
                    accessibilityNodeInfo2.addChild(gb2Var, 499);
                }
                hb2Var = gb2Var.w2;
                if (hb2Var != null) {
                    accessibilityNodeInfo2.addChild(gb2Var, 492);
                    arrayList7 = gb2Var.w2.g;
                    if (arrayList7 != null) {
                        ArrayList arrayList122 = gb2Var.w2.g;
                        size3 = arrayList122.size();
                        i10 = 0;
                        while (i10 < size3) {
                        }
                    }
                }
                if (gb2Var.n7 != null) {
                }
                b2 = gb2Var.R8;
                if (b2 != 1) {
                }
                accessibilityNodeInfo2.addChild(gb2Var, 498);
                if (gb2Var.Q7 != null) {
                }
                k27Var = gb2Var.Q5;
                if (k27Var != null) {
                    int i392 = 0;
                    while (i9 < rh9Var2.g.size()) {
                    }
                }
                if (staticLayoutArr[0] != null) {
                    accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_open_forwarded_origin, k96.M0(2131754932, "AccActionOpenForwardedOrigin")));
                }
                if (gb2Var.k1) {
                }
                accessibilityNodeInfo2.setSelected(true);
                return accessibilityNodeInfo2;
            }
        }
        z5 = false;
        k27 k27Var52 = gb2Var.Q5;
        if (k27Var52 == null) {
        }
        k27 k27Var62 = gb2Var.Q5;
        if (k27Var62 == null) {
        }
        spannableStringBuilder = gb2Var.P2;
        if (spannableStringBuilder == null) {
        }
        spannableStringBuilder = new SpannableStringBuilder();
        if (gb2Var.f6) {
        }
        accessibilityNodeInfo = obtain2;
        arrayList4 = arrayList3;
        j2 = j;
        if (gb2Var.E9) {
        }
        document = gb2Var.N1;
        if (document != null) {
            s = ba4.s(document);
            if (s.indexOf(46) != -1) {
            }
        }
        rh9Var = gb2Var.Q5.y2;
        if (rh9Var == null) {
        }
        if (!TextUtils.isEmpty(gb2Var.Q5.v)) {
        }
        if (gb2Var.N1 != null) {
            spannableStringBuilder.append((CharSequence) "\n");
            if (gb2Var.Q5.n4()) {
            }
            spannableStringBuilder.append((CharSequence) k96.Y(i6, str4, gl.i0(gb2Var.Q5.H0, false, false), gl.i0(gb2Var.A1, false, false)));
        }
        if (!gb2Var.Q5.I3()) {
        }
        if (gb2Var.j5 != null) {
        }
        if (gb2Var.N1 != null) {
        }
        if (!gb2Var.Q5.S4()) {
        }
        if (gb2Var.Q5.N3()) {
        }
        if (gb2Var.getRepliesCount() > 0) {
            spannableStringBuilder.append((CharSequence) "\n");
            spannableStringBuilder.append((CharSequence) k96.G(gb2Var.getRepliesCount(), "AccDescrNumberOfReplies", new Object[0]));
        }
        tL_messageReactions = gb2Var.Q5.k.reactions;
        if (tL_messageReactions != null) {
            String str52 = "";
            if (arrayList5.size() != 1) {
            }
        }
        if ((gb2Var.Q5.k.flags & 1024) == 0) {
        }
        spannableStringBuilder.append((CharSequence) "\n");
        while (r6 < r5) {
        }
        gb2Var.P2 = spannableStringBuilder;
        gb2Var.Q2 = z5;
        gb2Var.R2 = z8;
        gb2Var.S2 = j2;
        if (Build.VERSION.SDK_INT < 24) {
        }
        accessibilityNodeInfo2.setEnabled(true);
        collectionItemInfo = accessibilityNodeInfo2.getCollectionItemInfo();
        if (collectionItemInfo != null) {
        }
        accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_msg_options, k96.M0(2131754936, "AccActionMessageOptions")));
        int iconForCurrentState22 = gb2Var.getIconForCurrentState();
        accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, iconForCurrentState22 != 0 ? iconForCurrentState22 != 1 ? iconForCurrentState22 != 2 ? iconForCurrentState22 != 3 ? iconForCurrentState22 != 5 ? gb2Var.Q5.D == 16 ? k96.M0(2131752621, "CallAgain") : null : k96.M0(2131754933, "AccActionOpenFile") : k96.M0(2131754941, "AccActionCancelDownload") : k96.M0(2131754938, "AccActionDownload") : k96.M0(2131754930, "AccActionPause") : k96.M0(2131754929, "AccActionPlay")));
        accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, k96.M0(2131754937, "AccActionEnterSelectionMode")));
        if (gb2Var.getMiniIconForCurrentState() == 2) {
        }
        if (!gb2Var.V8) {
        }
        accessibilityNodeInfo2.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_summarize, k96.M0(2131744087, "SummaryTitle")));
        arrayList6 = gb2Var.Q5.B2;
        if (arrayList6 != null) {
        }
        if (!gb2Var.Q5.O4()) {
        }
        gb2Var.F4.f(accessibilityNodeInfo2);
        if (gb2Var.I4) {
        }
        if (Build.VERSION.SDK_INT < 24) {
        }
        size = arrayList2.size();
        int i3722 = 0;
        i7 = 0;
        while (i7 < size) {
        }
        if (gb2Var.r5) {
        }
        size2 = arrayList4.size();
        int i3822 = 0;
        i8 = 0;
        while (i8 < size2) {
        }
        if (gb2Var.u2) {
        }
        hb2Var = gb2Var.w2;
        if (hb2Var != null) {
        }
        if (gb2Var.n7 != null) {
        }
        b2 = gb2Var.R8;
        if (b2 != 1) {
        }
        accessibilityNodeInfo2.addChild(gb2Var, 498);
        if (gb2Var.Q7 != null) {
        }
        k27Var = gb2Var.Q5;
        if (k27Var != null) {
        }
        if (staticLayoutArr[0] != null) {
        }
        if (gb2Var.k1) {
        }
        accessibilityNodeInfo2.setSelected(true);
        return accessibilityNodeInfo2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x0177, code lost:
    
        if ((r9 != null ? r9.reply_to_top_id : 0) != 0) goto L134;
     */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean performAction(int i, int i2, Bundle bundle) {
        bb2 bb2Var;
        qa2 qa2Var;
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        boolean U;
        CharSequence D;
        gb2 gb2Var = this.a;
        if (i == -1) {
            gb2Var.performAccessibilityAction(i2, bundle);
            return true;
        }
        if (i2 == 64) {
            gb2Var.l3(i, 32768, null);
            return true;
        }
        if (i2 == 16) {
            if (i == 5000) {
                bb2 bb2Var2 = gb2Var.eb;
                if (bb2Var2 != null) {
                    bb2Var2.b0(gb2Var, gb2Var.va, 0.0f, 0.0f);
                    return true;
                }
            } else if (i >= 6000) {
                int[] iArr = {0};
                mg9 b = b(iArr, i);
                if (b != null) {
                    int i3 = iArr[0];
                    CheckBoxBase checkBoxBase = b.r;
                    if (checkBoxBase == null || i3 != 0) {
                        U = b.U(i3 - (checkBoxBase == null ? 0 : 1), gb2Var);
                    } else if (b.o()) {
                        b.e0();
                        U = true;
                    } else {
                        U = false;
                    }
                    if (U) {
                        gb2Var.l3(i, 1, null);
                        int i4 = iArr[0];
                        if (b.r == null || i4 != 0) {
                            D = b.D();
                        } else {
                            D = k96.M0(b.G() ? 2131754902 : 2131754829, null);
                        }
                        gl.g2(D);
                        return true;
                    }
                }
            } else if (i >= 3000) {
                ClickableSpan a = a(i, true);
                if (a != null) {
                    gb2Var.eb.O(gb2Var, a, false);
                    gb2Var.l3(i, 1, null);
                    return true;
                }
            } else {
                if (i < 2000) {
                    if (i >= 1000) {
                        int i5 = i - 1000;
                        if (i5 < gb2Var.I5.size()) {
                            wo0 wo0Var = (wo0) gb2Var.I5.get(i5);
                            bb2 bb2Var3 = gb2Var.eb;
                            if (bb2Var3 != null && !wo0Var.m) {
                                iq0 iq0Var = wo0Var.j;
                                if (iq0Var != null) {
                                    bb2Var3.O1(gb2Var, iq0Var);
                                } else {
                                    TL_keyboard.KeyboardInlineButton keyboardInlineButton = wo0Var.i;
                                    if (keyboardInlineButton != null) {
                                        bb2Var3.V0(gb2Var, keyboardInlineButton);
                                    }
                                }
                            }
                            gb2Var.l3(i, 1, null);
                            return true;
                        }
                    } else if (i >= 500) {
                        int i6 = i - 500;
                        if (i6 < gb2Var.Q4.size()) {
                            fb2 fb2Var = (fb2) gb2Var.Q4.get(i6);
                            if (gb2Var.eb != null) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(fb2Var.s);
                                gb2Var.eb.r1(gb2Var, arrayList, -1, 0, 0);
                            }
                            gb2Var.l3(i, 1, null);
                            return true;
                        }
                    } else {
                        if (i == 495) {
                            gb2Var.G0();
                            return true;
                        }
                        if (i == 499) {
                            bb2 bb2Var4 = gb2Var.eb;
                            if (bb2Var4 != null) {
                                bb2Var4.F1(gb2Var, gb2Var.y2);
                                return true;
                            }
                        } else if (i == 492) {
                            bb2 bb2Var5 = gb2Var.eb;
                            if (bb2Var5 != null) {
                                bb2Var5.F1(gb2Var, 5);
                                return true;
                            }
                        } else if (i == 491) {
                            bb2 bb2Var6 = gb2Var.eb;
                            if (bb2Var6 != null) {
                                bb2Var6.F1(gb2Var, 5);
                                return true;
                            }
                        } else if (i == 490) {
                            bb2 bb2Var7 = gb2Var.eb;
                            if (bb2Var7 != null) {
                                bb2Var7.F1(gb2Var, 31);
                                return true;
                            }
                        } else if (i == 489) {
                            bb2 bb2Var8 = gb2Var.eb;
                            if (bb2Var8 != null) {
                                bb2Var8.F1(gb2Var, 30);
                                return true;
                            }
                        } else if (i == 498) {
                            bb2 bb2Var9 = gb2Var.eb;
                            if (bb2Var9 != null) {
                                bb2Var9.q1(gb2Var);
                                return true;
                            }
                        } else if (i == 497) {
                            if (gb2Var.eb != null) {
                                if (gb2Var.o6 && !gb2Var.m6) {
                                    TLRPC.MessageReplyHeader messageReplyHeader2 = gb2Var.Q5.k.reply_to;
                                }
                                if (gb2Var.Q5.B2() || gb2Var.M7 || ((message = gb2Var.Q5.k) != null && (messageReplyHeader = message.reply_to) != null && messageReplyHeader.reply_from != null)) {
                                    gb2Var.eb.M(gb2Var, gb2Var.Q5.N1(), 0.0f, 0.0f, false);
                                    return true;
                                }
                            }
                        } else if (i == 494) {
                            bb2 bb2Var10 = gb2Var.eb;
                            if (bb2Var10 != null) {
                                TLRPC.Chat chat = gb2Var.Ga;
                                if (chat != null) {
                                    bb2Var10.i2(gb2Var, chat, gb2Var.Q5.k.fwd_from.channel_post, gb2Var.h1, gb2Var.i1, false);
                                    return true;
                                }
                                TLRPC.User user = gb2Var.Ea;
                                if (user != null) {
                                    bb2Var10.b0(gb2Var, user, gb2Var.h1, gb2Var.i1);
                                    return true;
                                }
                                if (gb2Var.Ha != null) {
                                    bb2Var10.c1(gb2Var);
                                    return true;
                                }
                            }
                        } else if (i == 496) {
                            bb2 bb2Var11 = gb2Var.eb;
                            if (bb2Var11 != null) {
                                if (gb2Var.u6) {
                                    bb2Var11.q1(gb2Var);
                                    return true;
                                }
                                bb2Var11.N0(gb2Var);
                                return true;
                            }
                        } else if (i == 493 && (qa2Var = gb2Var.J4) != null) {
                            qa2Var.p();
                            return true;
                        }
                    }
                    return false;
                }
                ClickableSpan a2 = a(i, false);
                if (a2 != null) {
                    gb2Var.eb.O(gb2Var, a2, false);
                    gb2Var.l3(i, 1, null);
                    return true;
                }
            }
        } else if (i2 == 32) {
            ClickableSpan a3 = a(i, i >= 3000);
            if (a3 != null && (bb2Var = gb2Var.eb) != null) {
                bb2Var.O(gb2Var, a3, true);
                gb2Var.l3(i, 2, null);
            }
        }
        return true;
    }
}
