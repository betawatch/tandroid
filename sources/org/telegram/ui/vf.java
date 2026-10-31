package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class vf implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ vf(int i10, org.telegram.ui.ActionBar.z2 z2Var, org.telegram.ui.ActionBar.p6 p6Var, LinearLayout linearLayout, long[] jArr, i2.g1 g1Var) {
        this.a = 5;
        this.b = i10;
        this.c = z2Var;
        this.e = p6Var;
        this.d = linearLayout;
        this.f = jArr;
        this.h = g1Var;
    }

    /* JADX WARN: Type inference failed for: r11v10, types: [java.io.Serializable, org.telegram.ui.ActionBar.z2[]] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long j10;
        int i10 = this.a;
        int i11 = 2;
        int i12 = this.b;
        int i13 = 1;
        Object obj = this.h;
        Object obj2 = this.f;
        Object obj3 = this.d;
        Object obj4 = this.e;
        Object obj5 = this.c;
        switch (i10) {
            case 0:
                z4.g gVar = (z4.g) obj5;
                LinearLayout linearLayout = (LinearLayout) obj3;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj4;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) obj2;
                org.telegram.ui.Components.wi0 wi0Var = (org.telegram.ui.Components.wi0) obj;
                int currentItem = gVar.getCurrentItem();
                if (i12 != currentItem) {
                    org.telegram.ui.Components.wi0 wi0Var2 = (org.telegram.ui.Components.wi0) linearLayout.getChildAt(currentItem);
                    atomicBoolean.set(true);
                    gVar.x(i12, true);
                    float scrollX = horizontalScrollView.getScrollX();
                    float x10 = wi0Var.getX() - ((horizontalScrollView.getWidth() - wi0Var.getWidth()) / 2.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(org.telegram.ui.Components.gr.f);
                    duration.addUpdateListener(new org.telegram.ui.Cells.b(horizontalScrollView, scrollX, x10, wi0Var2, wi0Var));
                    duration.start();
                    break;
                }
                break;
            case 1:
                org.telegram.ui.Components.ac0 ac0Var = (org.telegram.ui.Components.ac0) obj4;
                l2.f fVar = (l2.f) obj2;
                org.telegram.messenger.q20 q20Var = (org.telegram.messenger.q20) obj;
                TL_account.TL_birthday tL_birthday = new TL_account.TL_birthday();
                tL_birthday.day = ((org.telegram.ui.Components.ac0) obj5).getValue();
                tL_birthday.month = ((org.telegram.ui.Components.ac0) obj3).getValue() + 1;
                if (ac0Var.getValue() != i12) {
                    tL_birthday.flags |= 1;
                    tL_birthday.year = ac0Var.getValue();
                }
                ((org.telegram.ui.ActionBar.z2) fVar.b).x0.run();
                q20Var.a(tL_birthday);
                break;
            case 2:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, (Context) obj3, (th.b) obj4);
                String L0 = org.telegram.messenger.cd.L0(2131748808, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                x1Var.R = L0;
                x1Var.T = org.telegram.messenger.cd.L0(2131748809, null);
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131746041, null), new mg.i0((org.telegram.ui.Components.cr) obj5, (vh.d) obj2, (TL_phone.getGroupCallStreamRtmpUrl) obj, this.b, 3));
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                break;
            case 3:
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj3;
                TL_wallet.walletTransaction[] wallettransactionArr = (TL_wallet.walletTransaction[]) obj2;
                Context context = (Context) obj;
                org.telegram.ui.Components.z60 F = org.telegram.ui.Components.z60.F(((org.telegram.ui.Wallet.z2[]) obj5)[0].c, p6Var, (ImageView) obj4);
                if (!TextUtils.isEmpty(wallettransactionArr[0].tx_hash)) {
                    F.c(R.drawable.msg_search, org.telegram.messenger.cd.L0(2131742989, null), new org.telegram.ui.Wallet.x0(context, i12, wallettransactionArr, i11), false);
                }
                F.c(R.drawable.wallet_help, org.telegram.messenger.cd.L0(2131742987, null), new org.telegram.ui.Components.cs(i13, context, p6Var), false);
                F.a0(0.0f, -org.telegram.messenger.i0.L(48.0f));
                F.Z();
                break;
            case 4:
                vh.d dVar = (vh.d) obj5;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj3;
                ?? r11 = (org.telegram.ui.ActionBar.z2[]) obj4;
                TLObject tLObject = (TLObject) obj2;
                String str = (String) obj;
                if (!dVar.Q) {
                    dVar.setLoading(true);
                    TL_stars.TL_changeStarsSubscription tL_changeStarsSubscription = new TL_stars.TL_changeStarsSubscription();
                    tL_changeStarsSubscription.canceled = Boolean.FALSE;
                    tL_changeStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                    tL_changeStarsSubscription.subscription_id = starsSubscription.id;
                    int i14 = this.b;
                    ConnectionsManager.getInstance(i14).sendRequest(tL_changeStarsSubscription, new q8(dVar, (Serializable) r11, i14, tLObject, str, 12));
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) obj5;
                org.telegram.ui.ActionBar.p6 p6Var2 = (org.telegram.ui.ActionBar.p6) obj4;
                LinearLayout linearLayout2 = (LinearLayout) obj3;
                long[] jArr = (long[]) obj2;
                i2.g1 g1Var = (i2.g1) obj;
                rh.r g10 = rh.r.g(i12);
                g10.n();
                g10.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g10.j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g10.l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, org.telegram.messenger.d20.i(i12).f());
                org.telegram.ui.Components.z60 F2 = org.telegram.ui.Components.z60.F(z2Var.b, p6Var2, linearLayout2);
                int size = arrayList.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj6 = arrayList.get(i15);
                    i15++;
                    TLObject tLObject2 = (TLObject) obj6;
                    if (tLObject2 instanceof TLRPC.User) {
                        j10 = ((TLRPC.User) tLObject2).id;
                    } else if (tLObject2 instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                        if (org.telegram.messenger.w3.V(chat)) {
                            j10 = -chat.id;
                        }
                    }
                    long j11 = j10;
                    F2.g(tLObject2, j11 == jArr[0], new th.p5(jArr, j11, g1Var, 4));
                }
                F2.t = false;
                F2.s = 0;
                F2.V(5);
                F2.a0(org.telegram.messenger.i0.L(24.0f), 0.0f);
                F2.Z();
                break;
        }
    }

    public /* synthetic */ vf(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.h = obj5;
        this.b = i10;
    }

    public /* synthetic */ vf(org.telegram.ui.Components.ac0 ac0Var, org.telegram.ui.Components.ac0 ac0Var2, org.telegram.ui.Components.ac0 ac0Var3, int i10, l2.f fVar, org.telegram.messenger.q20 q20Var) {
        this.a = 1;
        this.c = ac0Var;
        this.d = ac0Var2;
        this.e = ac0Var3;
        this.b = i10;
        this.f = fVar;
        this.h = q20Var;
    }

    public /* synthetic */ vf(vh.d dVar, TL_stars.StarsSubscription starsSubscription, int i10, org.telegram.ui.ActionBar.z2[] z2VarArr, TLObject tLObject, String str) {
        this.a = 4;
        this.c = dVar;
        this.d = starsSubscription;
        this.b = i10;
        this.e = z2VarArr;
        this.f = tLObject;
        this.h = str;
    }

    public /* synthetic */ vf(z4.g gVar, int i10, LinearLayout linearLayout, AtomicBoolean atomicBoolean, HorizontalScrollView horizontalScrollView, org.telegram.ui.Components.wi0 wi0Var) {
        this.a = 0;
        this.c = gVar;
        this.b = i10;
        this.d = linearLayout;
        this.e = atomicBoolean;
        this.f = horizontalScrollView;
        this.h = wi0Var;
    }
}
