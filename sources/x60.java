// default package

import android.animation.TimeInterpolator;
import android.content.Context;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class x60 extends e implements fn7 {
    public w60 a;
    public w60 b;
    public w60 c;
    public w60 d;
    public w60 e;
    public LinearLayout f;
    public final ArrayList h;
    public int n;
    public ny9 r;

    public x60() {
        super(null);
        this.h = new ArrayList();
        this.n = 0;
    }

    public final int Y() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i >= arrayList.size()) {
                return this.n;
            }
            if (((w60) arrayList.get(i)).b.f) {
                return ((w60) arrayList.get(i)).e;
            }
            i++;
        }
    }

    public final void Z(int i, boolean z) {
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        Fade fade = new Fade(1);
        fade.setDuration(150L);
        transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(changeBounds).addTransition(fade);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) k43.f);
        TransitionManager.beginDelayedTransition(this.f, transitionSet);
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i2 >= arrayList.size()) {
                int i3 = 0;
                while (i3 < arrayList.size()) {
                    if (((w60) arrayList.get(i3)).d) {
                        this.f.removeView((View) arrayList.get(i3));
                        arrayList.remove(i3);
                        i3--;
                    }
                    i3++;
                }
                int size = arrayList.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= arrayList.size()) {
                        break;
                    }
                    if (i < ((w60) arrayList.get(i4)).e) {
                        size = i4 + 1;
                        break;
                    }
                    i4++;
                }
                w60 w60Var = new w60(getParentActivity(), null);
                w60Var.d = true;
                w60Var.e = i;
                w60Var.c(ob6.a0("AutoDeleteAfterShort", null, 2131753865, ob6.c0(i * 60)), false, true);
                arrayList.add(size, w60Var);
                this.f.addView(w60Var, size);
                b0();
                a0(w60Var, z);
                return;
            }
            if (((w60) arrayList.get(i2)).e == i) {
                a0((View) arrayList.get(i2), z);
                return;
            }
            i2++;
        }
    }

    public final void a0(View view, boolean z) {
        int i;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i2 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i2) == view) {
                ((w60) arrayList.get(i2)).a(true, this.fragmentBeginToShow);
            } else {
                ((w60) arrayList.get(i2)).a(false, this.fragmentBeginToShow);
            }
            i2++;
        }
        if (!z || (i = ((w60) view).e) <= 0) {
            return;
        }
        c00.v(ob6.a0("AutoDeleteGlobalTimerEnabled", null, 2131753850, ob6.c0(i * 60)), d31.b0(this), R.raw.fire_on, 36);
    }

    public final void b0() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i >= arrayList.size()) {
                return;
            }
            View view = (View) arrayList.get(i);
            int i2 = aob.d6;
            int w0 = aob.w0(null, i2, false);
            int i3 = aob.i6;
            yob.R(view, aob.g0(w0, aob.w0(null, i3, false)), yob.M(i2), yob.M(i3), null);
            ((w60) arrayList.get(i)).setOnClickListener(new k1(this, (byte) 13));
            i++;
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(ob6.M0(2131753843, null));
        byte b = 5;
        this.simpleActionBar.setActionBarMenuOnItemClick(new s8(this, b));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        u1 u1Var = new u1(getParentActivity(), (byte) 9);
        ny9 ny9Var = new ny9(getParentActivity(), u1Var, this.resourceProvider, true);
        this.r = ny9Var;
        ny9Var.setDrawBackground(true);
        this.r.setOverScrollMode(0);
        u1Var.setOrientation(1);
        this.r.addView(u1Var);
        frameLayout.addView(this.r);
        FrameLayout frameLayout2 = new FrameLayout(context);
        a3b a3bVar = new a3b(context, this.currentAccount);
        a3bVar.setStickerNum(10);
        frameLayout2.addView(a3bVar, tre.e(jn7.N1, jn7.N1, 17));
        frameLayout2.setTag(-33024);
        u1Var.addView(frameLayout2, tre.o(-1, jn7.z2));
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f = linearLayout;
        linearLayout.setOrientation(1);
        yob.h(aob.d6, null, this.f);
        u1Var.addView(this.f, tre.o(-1, -2));
        mf5 mf5Var = new mf5(getParentActivity());
        mf5Var.setText(ob6.M0(2131748341, null));
        this.f.addView(mf5Var);
        w60 w60Var = new w60(getParentActivity(), null);
        this.a = w60Var;
        w60Var.c(ob6.M0(2131745089, null), false, true);
        w60 w60Var2 = this.a;
        w60Var2.e = 0;
        this.f.addView(w60Var2);
        w60 w60Var3 = new w60(getParentActivity(), null);
        this.b = w60Var3;
        w60Var3.c(ob6.M0(2131753868, null), false, true);
        w60 w60Var4 = this.b;
        w60Var4.e = 1440;
        this.f.addView(w60Var4);
        w60 w60Var5 = new w60(getParentActivity(), null);
        this.c = w60Var5;
        w60Var5.c(ob6.M0(2131753866, null), false, true);
        w60 w60Var6 = this.c;
        w60Var6.e = 10080;
        this.f.addView(w60Var6);
        w60 w60Var7 = new w60(getParentActivity(), null);
        this.d = w60Var7;
        w60Var7.c(ob6.M0(2131753867, null), false, true);
        w60 w60Var8 = this.d;
        w60Var8.e = 44640;
        this.f.addView(w60Var8);
        w60 w60Var9 = new w60(getParentActivity(), null);
        this.e = w60Var9;
        w60Var9.c(ob6.M0(2131745262, null), false, false);
        this.e.b.setVisibility(8);
        this.f.addView(this.e);
        w60 w60Var10 = this.a;
        ArrayList arrayList = this.h;
        arrayList.add(w60Var10);
        arrayList.add(this.b);
        arrayList.add(this.c);
        arrayList.add(this.d);
        arrayList.add(this.e);
        b0();
        ilb ilbVar = new ilb(12, this.resourceProvider, context);
        ilbVar.setText(hl.N2(ob6.M0(2131749307, null), -1, 0, new p1(this, b), null));
        u1Var.addView(ilbVar, tre.o(-1, -2));
        Z(this.n, false);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final ny9 getScrollViewForSimpleGlass() {
        return this.r;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        int i = getUserConfig().q0;
        this.n = i;
        if (i < 0) {
            this.n = 0;
        }
        getUserConfig().s();
        getNotificationCenter().b(this, jn7.v5);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, jn7.v5);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onPause() {
        super.onPause();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i >= arrayList.size()) {
                return;
            }
            if (((w60) arrayList.get(i)).b.f) {
                if (((w60) arrayList.get(i)).e != this.n) {
                    this.n = ((w60) arrayList.get(i)).e;
                    TLRPC.TL_messages_setDefaultHistoryTTL tL_messages_setDefaultHistoryTTL = new TLRPC.TL_messages_setDefaultHistoryTTL();
                    tL_messages_setDefaultHistoryTTL.period = ((w60) arrayList.get(i)).e * 60;
                    getConnectionsManager().sendRequest(tL_messages_setDefaultHistoryTTL, new v60());
                    getUserConfig().q0 = this.n;
                    jn7.f(this.currentAccount).k(jn7.v5, new Object[0]);
                    return;
                }
                return;
            }
            i++;
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
    }
}
