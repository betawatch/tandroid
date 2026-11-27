// default package

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class w72 extends f12 {
    public final b34 n;
    public final d79 r;
    public final byte s;
    public final kr w;
    public int x;

    /* JADX WARN: Multi-variable type inference failed */
    public w72(int i, n12 n12Var, vnb vnbVar, Context context) {
        super(n12Var, vnbVar, context);
        this.s = i;
        b34 b34Var = new b34(context, vnbVar);
        this.n = b34Var;
        b34Var.setText(ob6.M0(2131747911, null));
        b34Var.setOnTouchListener(null);
        b34Var.setTextSize(16);
        addView(b34Var, tre.c(-2.0f, -1));
        b34Var.a(R.raw.media_forbidden, jn7.f2, jn7.f2);
        TLRPC.Chat T0 = this.b.T0();
        byte b = 4;
        if (i == 1) {
            b34Var.setText(xc2.L(7, T0));
        } else if (i == 3) {
            b34Var.setText(xc2.L(18, T0));
        } else if (i == 4) {
            b34Var.setText(xc2.L(19, T0));
        } else {
            b34Var.setText(xc2.L(22, T0));
        }
        b34Var.c();
        d79 d79Var = new d79(context, vnbVar);
        this.r = d79Var;
        d79Var.setSectionsType(2);
        d79Var.setVerticalScrollBarEnabled(false);
        d79Var.setLayoutManager(new x46());
        d79Var.setClipToPadding(false);
        kr krVar = new kr(this, b);
        this.w = krVar;
        d79Var.setAdapter(krVar);
        d79Var.setPadding(0, 0, 0, hl.L(48.0f));
        d79Var.setOnScrollListener(new y(this, (byte) 23));
        addView(d79Var, tre.c(-1.0f, -1));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // f12
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(int i, int i2) {
        int i3;
        int i4;
        d79 d79Var;
        int max = Math.max(0, i2 - a.getCurrentActionBarHeight());
        if (this.x != max) {
            this.x = max;
            this.w.f();
        }
        if (!hl.O1()) {
            Point point = hl.q;
            if (point.x > point.y) {
                i3 = (int) (i2 / 3.5f);
                int L = i3 - hl.L(52.0f);
                i4 = L >= 0 ? L : 0;
                d79Var = this.r;
                if (d79Var.getPaddingTop() == i4) {
                    d79Var.setPadding(hl.L(6.0f), i4, hl.L(6.0f), hl.L(48.0f));
                    return;
                }
                return;
            }
        }
        i3 = (i2 / 5) << 1;
        int L2 = i3 - hl.L(52.0f);
        if (L2 >= 0) {
        }
        d79Var = this.r;
        if (d79Var.getPaddingTop() == i4) {
        }
    }

    @Override // f12
    public int getCurrentItemTop() {
        d79 d79Var = this.r;
        if (d79Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int i = 0;
        View childAt = d79Var.getChildAt(0);
        n69 n69Var = (n69) d79Var.H(childAt);
        int top = childAt.getTop() - hl.L(8.0f);
        if (top > 0 && n69Var != null && n69Var.b() == 0) {
            i = top;
        }
        if (top < 0 || n69Var == null || n69Var.b() != 0) {
            top = i;
        }
        int measuredHeight = (getMeasuredHeight() - top) - hl.L(50.0f);
        this.n.setTranslationY(((measuredHeight - r4.getMeasuredHeight()) / 2) + top);
        return hl.L(12.0f) + top;
    }

    @Override // f12
    public int getFirstOffset() {
        return hl.L(4.0f) + getListTopPadding();
    }

    @Override // f12
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.b.b.invalidate();
    }
}
