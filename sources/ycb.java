// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.TextUtils;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ycb {
    public final int a;
    public final cm1 b;
    public final ylb c;
    public final p09 d;
    public TL_account.TL_birthday e;
    public uib f;
    public uib[] g;
    public uib[] h;
    public boolean i;
    public uib j;
    public final RectF k = new RectF();
    public final Paint l = new Paint(1);
    public final u51 m;

    public ycb(int i, cm1 cm1Var, ylb ylbVar) {
        this.a = i;
        this.b = cm1Var;
        this.c = ylbVar;
        p09 p09Var = new p09(R.raw.cake, gm.L(66.0f), gm.L(66.0f), true, null);
        this.d = p09Var;
        p09Var.C(false);
        this.m = new u51(cm1Var);
    }

    public final void a(Canvas canvas) {
        int L = gm.L(66.0f);
        cm1 cm1Var = this.b;
        int width = (cm1Var.getWidth() - L) / 2;
        int L2 = gm.L(13.0f) + L;
        p09 p09Var = this.d;
        p09Var.setBounds(width, gm.L(13.0f), width + L, L2);
        p09Var.draw(canvas);
        this.f.c((cm1Var.getWidth() - this.f.j()) / 2.0f, gm.L(19.0f) + L, 1.0f, -1, canvas);
        int h = (int) (this.f.h() + gm.L(19.0f) + L + gm.L(17.0f));
        int i = 0;
        for (int i2 = 0; i2 < this.g.length; i2++) {
            i = (int) (Math.max(this.g[i2].j(), this.h[i2].j()) + gm.L(9.0f) + gm.L(9.0f) + i);
        }
        int width2 = (cm1Var.getWidth() - i) / 2;
        int i3 = 0;
        while (i3 < this.g.length) {
            float max = Math.max(this.g[i3].j(), this.h[i3].j()) + gm.L(9.0f) + gm.L(9.0f);
            float f = width2;
            float f2 = (max / 2.0f) + f;
            int i4 = (int) (f + max);
            uib uibVar = this.g[i3];
            uibVar.c(f2 - (uibVar.j() / 2.0f), h, 0.75f, -1, canvas);
            uib uibVar2 = this.h[i3];
            uibVar2.c(f2 - (uibVar2.j() / 2.0f), gm.L(16.0f) + h, 1.0f, -1, canvas);
            i3++;
            width2 = i4;
        }
        if (this.i) {
            int L3 = gm.L(38.0f) + h;
            canvas.save();
            float j = this.j.j() + gm.L(26.0f);
            float L4 = gm.L(30.0f);
            float f3 = L3;
            RectF rectF = this.k;
            rectF.set((cm1Var.getWidth() - j) / 2.0f, f3, (cm1Var.getWidth() + j) / 2.0f, f3 + L4);
            float a = this.m.a(0.1f);
            canvas.scale(a, a, rectF.centerX(), rectF.centerY());
            float f4 = L4 / 2.0f;
            canvas.drawRoundRect(rectF, f4, f4, this.l);
            this.j.c(gm.L(13.0f) + rectF.left, rectF.centerY(), 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final void b() {
        ik.l(this.b.getContext(), jb6.M0(2131751609, null), jb6.M0(2131751608, null), this.e, new eg9(this, (byte) 19), null, true, false, this.c).h1();
    }

    public final void c(k47 k47Var) {
        TLRPC.TL_messageActionSuggestBirthday tL_messageActionSuggestBirthday = (TLRPC.TL_messageActionSuggestBirthday) k47Var.k.action;
        this.e = tL_messageActionSuggestBirthday.birthday;
        uib uibVar = new uib(TextUtils.concat(k47Var.v, ":"), 13.0f, null);
        uibVar.l(6);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        uibVar.a();
        uibVar.o(gm.L(174.0f) - gm.L(32.0f));
        this.f = uibVar;
        int i = (tL_messageActionSuggestBirthday.birthday.flags & 1) != 0 ? 3 : 2;
        uib[] uibVarArr = new uib[i];
        this.g = uibVarArr;
        this.h = new uib[i];
        uibVarArr[0] = new uib(jb6.M0(2131751611, null), 11.0f, null);
        this.h[0] = new uib(String.valueOf(tL_messageActionSuggestBirthday.birthday.day), 11.0f, gm.o());
        this.g[1] = new uib(jb6.M0(2131751610, null), 11.0f, null);
        uib[] uibVarArr2 = this.h;
        int i2 = tL_messageActionSuggestBirthday.birthday.month - 1;
        uibVarArr2[1] = new uib((i2 < 0 || i2 >= 12) ? String.valueOf(i2) : jb6.M0(new int[]{2131748843, 2131750766, 2131748440, 2131754138, 2131748419, 2131748821, 2131748823, 2131753860, 2131745299, 2131747563, 2131747568, 2131751542}[i2], null), 11.0f, gm.o());
        if ((tL_messageActionSuggestBirthday.birthday.flags & 1) != 0) {
            this.g[2] = new uib(jb6.M0(2131751606, null), 11.0f, null);
            this.h[2] = new uib(String.valueOf(tL_messageActionSuggestBirthday.birthday.year), 11.0f, gm.o());
        }
        this.i = !k47Var.O3();
        ylb ylbVar = this.c;
        this.l.setColor(cmb.p1(0.12f, ylbVar != null ? ylbVar.a() : cmb.I.o() ? -1 : -16777216));
        this.j = new uib(jb6.M0(2131744080, null), 14.0f, gm.o());
    }
}
