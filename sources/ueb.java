// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.TextUtils;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ueb {
    public final int a;
    public final dl1 b;
    public final vnb c;
    public final b29 d;
    public TL_account.TL_birthday e;
    public pkb f;
    public pkb[] g;
    public pkb[] h;
    public boolean i;
    public pkb j;
    public final RectF k = new RectF();
    public final Paint l = new Paint(1);
    public final v41 m;

    public ueb(int i, dl1 dl1Var, vnb vnbVar) {
        this.a = i;
        this.b = dl1Var;
        this.c = vnbVar;
        b29 b29Var = new b29(R.raw.cake, hl.L(66.0f), hl.L(66.0f), true, null);
        this.d = b29Var;
        b29Var.C(false);
        this.m = new v41(dl1Var);
    }

    public final void a(Canvas canvas) {
        int L = hl.L(66.0f);
        dl1 dl1Var = this.b;
        int width = (dl1Var.getWidth() - L) / 2;
        int L2 = hl.L(13.0f) + L;
        b29 b29Var = this.d;
        b29Var.setBounds(width, hl.L(13.0f), width + L, L2);
        b29Var.draw(canvas);
        this.f.c((dl1Var.getWidth() - this.f.j()) / 2.0f, hl.L(19.0f) + L, 1.0f, -1, canvas);
        int h = (int) (this.f.h() + hl.L(19.0f) + L + hl.L(17.0f));
        int i = 0;
        for (int i2 = 0; i2 < this.g.length; i2++) {
            i = (int) (Math.max(this.g[i2].j(), this.h[i2].j()) + hl.L(9.0f) + hl.L(9.0f) + i);
        }
        int width2 = (dl1Var.getWidth() - i) / 2;
        int i3 = 0;
        while (i3 < this.g.length) {
            float max = Math.max(this.g[i3].j(), this.h[i3].j()) + hl.L(9.0f) + hl.L(9.0f);
            float f = width2;
            float f2 = (max / 2.0f) + f;
            int i4 = (int) (f + max);
            pkb pkbVar = this.g[i3];
            pkbVar.c(f2 - (pkbVar.j() / 2.0f), h, 0.75f, -1, canvas);
            pkb pkbVar2 = this.h[i3];
            pkbVar2.c(f2 - (pkbVar2.j() / 2.0f), hl.L(16.0f) + h, 1.0f, -1, canvas);
            i3++;
            width2 = i4;
        }
        if (this.i) {
            int L3 = hl.L(38.0f) + h;
            canvas.save();
            float j = this.j.j() + hl.L(26.0f);
            float L4 = hl.L(30.0f);
            float f3 = L3;
            RectF rectF = this.k;
            rectF.set((dl1Var.getWidth() - j) / 2.0f, f3, (dl1Var.getWidth() + j) / 2.0f, f3 + L4);
            float a = this.m.a(0.1f);
            canvas.scale(a, a, rectF.centerX(), rectF.centerY());
            float f4 = L4 / 2.0f;
            canvas.drawRoundRect(rectF, f4, f4, this.l);
            this.j.c(hl.L(13.0f) + rectF.left, rectF.centerY(), 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final void b() {
        jj.l(this.b.getContext(), ob6.M0(2131751637, null), ob6.M0(2131751636, null), this.e, new sh9(this, (byte) 19), null, true, false, this.c).o1();
    }

    public final void c(r47 r47Var) {
        TLRPC.TL_messageActionSuggestBirthday tL_messageActionSuggestBirthday = (TLRPC.TL_messageActionSuggestBirthday) r47Var.k.action;
        this.e = tL_messageActionSuggestBirthday.birthday;
        pkb pkbVar = new pkb(TextUtils.concat(r47Var.v, ":"), 13.0f, null);
        pkbVar.l(6);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        pkbVar.a();
        pkbVar.o(hl.L(174.0f) - hl.L(32.0f));
        this.f = pkbVar;
        int i = (tL_messageActionSuggestBirthday.birthday.flags & 1) != 0 ? 3 : 2;
        pkb[] pkbVarArr = new pkb[i];
        this.g = pkbVarArr;
        this.h = new pkb[i];
        pkbVarArr[0] = new pkb(ob6.M0(2131751639, null), 11.0f, null);
        this.h[0] = new pkb(String.valueOf(tL_messageActionSuggestBirthday.birthday.day), 11.0f, hl.o());
        this.g[1] = new pkb(ob6.M0(2131751638, null), 11.0f, null);
        pkb[] pkbVarArr2 = this.h;
        int i2 = tL_messageActionSuggestBirthday.birthday.month - 1;
        pkbVarArr2[1] = new pkb((i2 < 0 || i2 >= 12) ? String.valueOf(i2) : ob6.M0(new int[]{2131748840, 2131750794, 2131748437, 2131754166, 2131748416, 2131748818, 2131748820, 2131753888, 2131745293, 2131747557, 2131747562, 2131751570}[i2], null), 11.0f, hl.o());
        if ((tL_messageActionSuggestBirthday.birthday.flags & 1) != 0) {
            this.g[2] = new pkb(ob6.M0(2131751634, null), 11.0f, null);
            this.h[2] = new pkb(String.valueOf(tL_messageActionSuggestBirthday.birthday.year), 11.0f, hl.o());
        }
        this.i = !r47Var.O3();
        vnb vnbVar = this.c;
        this.l.setColor(aob.p1(0.12f, vnbVar != null ? vnbVar.a() : aob.I.o() ? -1 : -16777216));
        this.j = new pkb(ob6.M0(2131744048, null), 14.0f, hl.o());
    }
}
