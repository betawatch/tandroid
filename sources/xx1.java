// default package

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class xx1 implements TextWatcher {
    public boolean a;
    public boolean b;
    public String c;
    public boolean d;
    public boolean e;
    public final /* synthetic */ ChatActivityEnterView f;

    public xx1(ChatActivityEnterView chatActivityEnterView) {
        this.f = chatActivityEnterView;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a0  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void afterTextChanged(Editable editable) {
        boolean z;
        qx1 qx1Var;
        bx1 bx1Var;
        int i = ChatActivityEnterView.X7;
        ChatActivityEnterView chatActivityEnterView = this.f;
        chatActivityEnterView.K();
        if (this.d) {
            return;
        }
        if (this.c != null) {
            this.d = true;
            editable.replace(0, editable.length(), this.c);
            this.c = null;
            this.d = false;
            return;
        }
        if (chatActivityEnterView.H3 == 0) {
            if (this.b) {
                chatActivityEnterView.E1();
                this.b = false;
            }
            if (this.a) {
                for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                    editable.removeSpan(imageSpan);
                }
                pv3.m(editable, chatActivityEnterView.F0.getPaint().getFontMetricsInt(), false, null, 0);
                this.a = false;
            }
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        chatActivityEnterView.e0 = codePointCount;
        int i2 = chatActivityEnterView.d0;
        if (i2 > 0) {
            int i3 = i2 - codePointCount;
            if (i3 <= (chatActivityEnterView.T7 ? 5 : 100)) {
                if (i3 < -9999) {
                    i3 = -9999;
                }
                chatActivityEnterView.X();
                NumberTextView numberTextView = chatActivityEnterView.c0;
                numberTextView.a(i3, numberTextView.getVisibility() == 0);
                if (chatActivityEnterView.c0.getVisibility() != 0) {
                    chatActivityEnterView.c0.setVisibility(0);
                    chatActivityEnterView.c0.setAlpha(0.0f);
                    chatActivityEnterView.c0.setScaleX(0.5f);
                    chatActivityEnterView.c0.setScaleY(0.5f);
                }
                chatActivityEnterView.c0.animate().setListener(null).cancel();
                chatActivityEnterView.c0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                NumberTextView numberTextView2 = chatActivityEnterView.c0;
                if (i3 >= 0) {
                    numberTextView2.setTextColor(chatActivityEnterView.J0(aob.y6));
                    z = true;
                    if (chatActivityEnterView.f4 != z) {
                        chatActivityEnterView.f4 = z;
                        bx1Var.invalidate();
                    }
                    qx1Var = chatActivityEnterView.n0;
                    if (qx1Var != null) {
                    }
                    chatActivityEnterView.I();
                    if (chatActivityEnterView.P2) {
                        chatActivityEnterView.p0 = true;
                        if (this.e) {
                        }
                    }
                    chatActivityEnterView.d2(chatActivityEnterView.U <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
                    chatActivityEnterView.M(true);
                    chatActivityEnterView.k2(chatActivityEnterView.U <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
                }
                numberTextView2.setTextColor(chatActivityEnterView.J0(aob.p7));
                z = false;
                if (chatActivityEnterView.f4 != z && (bx1Var = chatActivityEnterView.u2) != null) {
                    chatActivityEnterView.f4 = z;
                    bx1Var.invalidate();
                }
                qx1Var = chatActivityEnterView.n0;
                if (qx1Var != null) {
                    qx1Var.c();
                }
                chatActivityEnterView.I();
                if (chatActivityEnterView.P2 && !chatActivityEnterView.p0 && !uc7.s1(chatActivityEnterView.R).M3() && !yac.h(chatActivityEnterView.R).p() && chatActivityEnterView.e0 > uc7.s1(chatActivityEnterView.R).k4.o1.f() && chatActivityEnterView.e0 < uc7.s1(chatActivityEnterView.R).k4.p1.f()) {
                    chatActivityEnterView.p0 = true;
                    if (this.e) {
                        chatActivityEnterView.f2();
                    } else {
                        hl.d3(new go1(this, (byte) 14), 300L);
                    }
                }
                chatActivityEnterView.d2(chatActivityEnterView.U <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
                chatActivityEnterView.M(true);
                chatActivityEnterView.k2(chatActivityEnterView.U <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
            }
        }
        NumberTextView numberTextView3 = chatActivityEnterView.c0;
        if (numberTextView3 != null) {
            numberTextView3.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new jb1(this, (byte) 9));
        }
        z = true;
        if (chatActivityEnterView.f4 != z) {
        }
        qx1Var = chatActivityEnterView.n0;
        if (qx1Var != null) {
        }
        chatActivityEnterView.I();
        if (chatActivityEnterView.P2) {
        }
        chatActivityEnterView.d2(chatActivityEnterView.U <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
        chatActivityEnterView.M(true);
        chatActivityEnterView.k2(chatActivityEnterView.U <= 2 && !TextUtils.isEmpty(editable.toString().trim()));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.d) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f;
        if (!chatActivityEnterView.u3 || chatActivityEnterView.r0()) {
            return;
        }
        this.c = charSequence.toString();
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.d) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f;
        my1 my1Var = chatActivityEnterView.V0;
        boolean z = (my1Var == null ? uc7.d1().getInt("selected_page", 0) : my1Var.getCurrentPage()) != 0 && (chatActivityEnterView.y3 || chatActivityEnterView.z3);
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        if (i2 != 0 ? isEmpty : !isEmpty) {
            if (z) {
                chatActivityEnterView.O1(false, true);
            }
        }
        if (chatActivityEnterView.U != chatActivityEnterView.F0.getLineCount()) {
            this.e = (chatActivityEnterView.F0.getLineCount() >= 4) != (chatActivityEnterView.U >= 4);
            if (!chatActivityEnterView.T && chatActivityEnterView.F0.getMeasuredWidth() > 0) {
                chatActivityEnterView.h1(chatActivityEnterView.U, chatActivityEnterView.F0.getLineCount());
            }
            int lineCount = chatActivityEnterView.F0.getLineCount();
            chatActivityEnterView.U = lineCount;
            chatActivityEnterView.d2((lineCount <= 2 || charSequence == null || TextUtils.isEmpty(charSequence.toString().trim())) ? false : true);
            chatActivityEnterView.k2((chatActivityEnterView.U <= 2 || charSequence == null || TextUtils.isEmpty(charSequence.toString().trim())) ? false : true);
        } else {
            this.e = false;
        }
        if (chatActivityEnterView.H3 == 1) {
            return;
        }
        if (chatActivityEnterView.q3 && !chatActivityEnterView.D0 && !chatActivityEnterView.E0 && !chatActivityEnterView.G3 && !chatActivityEnterView.M2 && chatActivityEnterView.O2 == null && i3 > i2 && charSequence.length() > 0 && charSequence.length() == i + i3 && charSequence.charAt(charSequence.length() - 1) == '\n') {
            this.b = true;
        }
        chatActivityEnterView.M2 = false;
        chatActivityEnterView.P(true);
        CharSequence m1 = hl.m1(charSequence.toString());
        if (chatActivityEnterView.O3 != null && !chatActivityEnterView.G3) {
            int i4 = i3 + 1;
            if (i2 > i4 || i3 - i2 > 2 || TextUtils.isEmpty(charSequence)) {
                chatActivityEnterView.N3 = true;
            }
            chatActivityEnterView.O3.R0(charSequence, i2 > i4 || i3 - i2 > 2, false);
        }
        if (chatActivityEnterView.H3 != 2 && i3 - i2 > 1) {
            this.a = true;
        }
        if (chatActivityEnterView.O2 == null && !chatActivityEnterView.W2 && m1.length() != 0 && chatActivityEnterView.r3 < System.currentTimeMillis() - 5000 && !chatActivityEnterView.G3) {
            chatActivityEnterView.r3 = System.currentTimeMillis();
            xy1 xy1Var = chatActivityEnterView.O3;
            if (xy1Var != null) {
                xy1Var.p1();
            }
        }
        chatActivityEnterView.K2();
    }
}
