// default package

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class y09 extends d implements gk7 {
    public o39 a;
    public u09 b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public wtc h;
    public w09 n;

    public y09() {
        super(null);
        this.d = -1;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setTitle(k96.M0(2131746194, null));
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setActionBarMenuOnItemClick(new kk8(this, (byte) 6));
        FrameLayout frameLayout = new FrameLayout(context);
        o39 o39Var = new o39(context, null);
        this.a = o39Var;
        o39Var.r1();
        this.a.setSectionsDrawBackground(true);
        ((gb3) this.a.getItemAnimator()).m = false;
        this.a.setLayoutManager(new t26());
        o39 o39Var2 = this.a;
        u09 u09Var = new u09(this, context);
        this.b = u09Var;
        o39Var2.setAdapter(u09Var);
        this.a.setOnItemClickListener(new f09(this, (byte) 1));
        frameLayout.addView(this.a, nme.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        this.b.f();
        g0();
        return frameLayout;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i2 == this.currentAccount) {
            if (i == kk7.X4) {
                this.b.f();
            } else if (i == kk7.h5) {
                g0();
                this.b.f();
            }
        }
    }

    public final void f0(View view) {
        int i;
        int i2;
        if (view instanceof va0) {
            va0 va0Var = (va0) view;
            if (va0Var.n && !getUserConfig().p()) {
                showDialog(new jh8((d) this, 4, true));
                return;
            } else {
                hq6.d0(this.currentAccount).c2(va0Var.f.reaction);
                this.a.getAdapter().l(0, this.a.getAdapter().b());
                return;
            }
        }
        if (view instanceof x09) {
            x09 x09Var = (x09) view;
            if (this.n == null) {
                kx9[] kx9VarArr = new kx9[1];
                tl tlVar = x09Var.a;
                if (tlVar != null) {
                    tlVar.f();
                    x09Var.b();
                    Rect rect = gl.Q;
                    rect.set(tlVar.getBounds());
                    i2 = (-(x09Var.getHeight() - rect.centerY())) - gl.L(16.0f);
                    float L = gl.L(324.0f);
                    i = rect.centerX() - ((gl.q.x - gl.L(12.0f)) - ((int) Math.min(L, r4.x * 0.95f)));
                } else {
                    i = 0;
                    i2 = 0;
                }
                v09 v09Var = new v09(this, this, getParentActivity(), Integer.valueOf(i), x09Var, kx9VarArr);
                String S = getMediaDataController().S();
                if (S != null && S.startsWith("animated_")) {
                    try {
                        v09Var.setSelected(Long.valueOf(Long.parseLong(S.substring(9))));
                    } catch (Exception unused) {
                    }
                }
                ArrayList arrayList = getMediaDataController().h;
                ArrayList arrayList2 = new ArrayList(20);
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    h19 h19Var = new h19();
                    h19Var.f = ((TLRPC.TL_availableReaction) arrayList.get(i3)).reaction;
                    arrayList2.add(h19Var);
                }
                v09Var.setRecentReactions(arrayList2);
                v09Var.setSaveState(3);
                v09Var.y(tlVar, x09Var);
                w09 w09Var = new w09(this, v09Var);
                this.n = w09Var;
                kx9VarArr[0] = w09Var;
                w09Var.showAsDropDown(x09Var, 0, i2, 53);
                kx9VarArr[0].a();
            }
        }
    }

    public final void g0() {
        this.f = 2;
        this.c = true;
        if (!y6c.h(this.currentAccount).p()) {
            this.e = -1;
            this.d = this.f;
        } else {
            this.d = -1;
            int i = this.f;
            this.f = i + 1;
            this.e = i;
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final o39 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        return hue.a(new t00(this, (byte) 16), bkb.c6, bkb.F6, bkb.y6, bkb.h6, bkb.Z6, bkb.A6, bkb.o7, bkb.e6, bkb.f6, bkb.N6, bkb.O6, bkb.P6, bkb.Q6);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        wtc wtcVar = this.h;
        if (wtcVar != null) {
            wtcVar.a();
            this.h = null;
        }
        kk7 notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        wtc wtcVar2 = new wtc(notificationCenter, this);
        wtcVar2.b(kk7.X4);
        wtcVar2.b(kk7.h5);
        this.h = wtcVar2;
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        wtc wtcVar = this.h;
        if (wtcVar != null) {
            wtcVar.a();
            this.h = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
