package wg;

import android.os.Bundle;
import android.view.View;
import bi.dd;
import bi.v9;
import hi.d4;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.t10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.Components.gp0;
import org.telegram.ui.Components.k60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cn;
import wg.a0;
import wg.b0;
import zh.f3;
import zh.k3;
import zh.l3;
import zh.m3;
import zh.n3;
import zh.o3;
import zh.r2;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a1(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TL_stars.SavedStarGift savedStarGift;
        int i7 = this.a;
        final int i10 = 0;
        final int i11 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i7) {
            case 0:
                final f1 f1Var = (f1) obj2;
                final TLRPC.User user = (TLRPC.User) obj;
                k60 F = k60.F(f1Var.c, f1Var.I0, (View) view.getParent());
                F.c(R.drawable.profile_discuss, id.M0(2131745601, null), new Runnable() { // from class: wg.b1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                TLRPC.User user2 = user;
                                if (user2 != null) {
                                    f2 f2Var = f1Var.r1;
                                    if (f2Var != null) {
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("user_id", user2.id);
                                        f2Var.presentFragment(new cn(bundle));
                                        break;
                                    } else {
                                        f2 T = LaunchActivity.T();
                                        d2 d2Var = new d2();
                                        d2Var.a = true;
                                        if (T != null) {
                                            Bundle bundle2 = new Bundle();
                                            bundle2.putLong("user_id", user2.id);
                                            T.showAsSheet(new cn(bundle2), d2Var);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                TLRPC.User user3 = user;
                                if (user3 != null) {
                                    f2 f2Var2 = f1Var.r1;
                                    if (f2Var2 != null) {
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("user_id", user3.id);
                                        f2Var2.presentFragment(new ProfileActivity(bundle3, null));
                                        break;
                                    } else {
                                        f2 T2 = LaunchActivity.T();
                                        if (T2 != null) {
                                            d2 d2Var2 = new d2();
                                            d2Var2.a = true;
                                            Bundle bundle4 = new Bundle();
                                            bundle4.putLong("user_id", user3.id);
                                            T2.showAsSheet(new ProfileActivity(bundle4, null), d2Var2);
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                }, false);
                F.c(R.drawable.msg_openprofile, id.M0(2131747786, null), new Runnable() { // from class: wg.b1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                TLRPC.User user2 = user;
                                if (user2 != null) {
                                    f2 f2Var = f1Var.r1;
                                    if (f2Var != null) {
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("user_id", user2.id);
                                        f2Var.presentFragment(new cn(bundle));
                                        break;
                                    } else {
                                        f2 T = LaunchActivity.T();
                                        d2 d2Var = new d2();
                                        d2Var.a = true;
                                        if (T != null) {
                                            Bundle bundle2 = new Bundle();
                                            bundle2.putLong("user_id", user2.id);
                                            T.showAsSheet(new cn(bundle2), d2Var);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                TLRPC.User user3 = user;
                                if (user3 != null) {
                                    f2 f2Var2 = f1Var.r1;
                                    if (f2Var2 != null) {
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("user_id", user3.id);
                                        f2Var2.presentFragment(new ProfileActivity(bundle3, null));
                                        break;
                                    } else {
                                        f2 T2 = LaunchActivity.T();
                                        if (T2 != null) {
                                            d2 d2Var2 = new d2();
                                            d2Var2.a = true;
                                            Bundle bundle4 = new Bundle();
                                            bundle4.putLong("user_id", user3.id);
                                            T2.showAsSheet(new ProfileActivity(bundle4, null), d2Var2);
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                }, false);
                F.Z();
                break;
            case 1:
                final xg.f fVar = (xg.f) obj2;
                final yg.a aVar = (yg.a) obj;
                if (!fVar.d) {
                    ((b0) fVar).r.dismiss();
                    break;
                } else if (!aVar.a.Q) {
                    aVar.b(true);
                    String str = fVar.h;
                    c20 c20Var = new c20() { // from class: xg.e
                        @Override // org.telegram.messenger.c20
                        public final void a(Object obj3) {
                            switch (i10) {
                                case 0:
                                    aVar.b(false);
                                    b0 b0Var = (b0) fVar;
                                    g0.i3(new a0(b0Var, 0), 200L);
                                    b0Var.r.dismiss();
                                    break;
                                default:
                                    aVar.b(false);
                                    f fVar2 = fVar;
                                    wg.h.c((TLRPC.TL_error) obj3, fVar2.n, fVar2.c, new d(fVar2, 1));
                                    break;
                            }
                        }
                    };
                    c20 c20Var2 = new c20() { // from class: xg.e
                        @Override // org.telegram.messenger.c20
                        public final void a(Object obj3) {
                            switch (i11) {
                                case 0:
                                    aVar.b(false);
                                    b0 b0Var = (b0) fVar;
                                    g0.i3(new a0(b0Var, 0), 200L);
                                    b0Var.r.dismiss();
                                    break;
                                default:
                                    aVar.b(false);
                                    f fVar2 = fVar;
                                    wg.h.c((TLRPC.TL_error) obj3, fVar2.n, fVar2.c, new d(fVar2, 1));
                                    break;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(p10.s0);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new n(c20Var2, c20Var, i10), 2);
                    break;
                }
                break;
            case 2:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                yg.f fVar2 = ((yg.g) obj2).w;
                if (fVar2 != null) {
                    z zVar = ((t) fVar2).a;
                    zVar.X1.remove(chat);
                    zVar.k1(true, true);
                    break;
                }
                break;
            case 3:
                ((xg.a) obj2).a((TLRPC.TL_payments_checkedGiftCode) obj);
                break;
            case 4:
                ((xg.a) obj2).a((TLRPC.Chat) obj);
                break;
            case 5:
                zh.d dVar = (zh.d) obj2;
                dVar.getClass();
                long o4 = m5.o(((TL_stars.TL_StarGiftAuctionAcquiredGift) obj).peer);
                dVar.dismiss();
                f2 T = LaunchActivity.T();
                if (T != null && !t10.A(o4)) {
                    Bundle bundle = new Bundle();
                    if (o4 > 0) {
                        bundle.putLong("user_id", o4);
                        if (o4 == p10.i(dVar.a).e()) {
                            bundle.putBoolean("my_profile", true);
                        }
                    } else {
                        bundle.putLong("chat_id", -o4);
                    }
                    bundle.putBoolean("open_gifts", true);
                    T.presentFragment(new ProfileActivity(bundle, null));
                    break;
                }
                break;
            case 6:
                m3 m3Var = (m3) obj2;
                m3Var.getClass();
                if (((r2) obj).n > 0) {
                    m3Var.presentFragment(new dd());
                    break;
                }
                break;
            case 7:
                l3 l3Var = (l3) obj2;
                k3 k3Var = (k3) obj;
                k60 F2 = k60.F(l3Var.c, l3Var.I0, l3Var.V1);
                F2.c(R.drawable.menu_sort_value, id.M0(2131746139, null), new f3(k3Var, 3), false);
                F2.c(R.drawable.menu_sort_date, id.M0(2131746143, null), new f3(k3Var, 4), false);
                F2.c(R.drawable.menu_sort_number, id.M0(2131746141, null), new f3(k3Var, 5), false);
                F2.t = false;
                F2.Y = true;
                F2.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                F2.Z();
                break;
            case 8:
                o3 o3Var = (o3) obj2;
                d4 d4Var = (d4) obj;
                HashSet hashSet = o3Var.U1;
                if (!hashSet.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        long longValue = ((Long) it.next()).longValue();
                        ArrayList arrayList2 = o3Var.T1.l;
                        int size = arrayList2.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 < size) {
                                Object obj3 = arrayList2.get(i12);
                                i12++;
                                savedStarGift = (TL_stars.SavedStarGift) obj3;
                                int i13 = savedStarGift.msg_id;
                                if ((i13 == 0 || i13 != longValue) && savedStarGift.saved_id != longValue) {
                                }
                            } else {
                                savedStarGift = null;
                            }
                        }
                        if (savedStarGift != null) {
                            arrayList.add(savedStarGift);
                        }
                    }
                    d4Var.a(arrayList);
                    o3Var.dismiss();
                    break;
                }
                break;
            default:
                v9 v9Var = ((n3) obj2).c.T1;
                v9Var.e = !v9Var.e;
                ((gp0) obj).run();
                v9Var.j(true);
                break;
        }
    }
}
