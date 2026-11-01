package xh;

import android.location.Location;
import android.view.View;
import java.util.ArrayList;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.e20;
import org.telegram.messenger.f8;
import org.telegram.messenger.i5;
import org.telegram.messenger.is;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.wb;
import org.telegram.ui.un;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class e3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e3(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11 = 0;
        switch (this.a) {
            case 0:
                j3 j3Var = (j3) this.b;
                wb Q = new cc(j3Var.b.c, j3Var.a).Q(R.raw.contact_check, 36, org.telegram.messenger.i0.W2((String) this.c));
                Q.j = 5000;
                Q.k(true);
                break;
            case 1:
                yh.p pVar = (yh.p) this.b;
                zh.f fVar = (zh.f) this.c;
                pVar.getClass();
                pVar.presentFragment(un.ma(fVar.b.id));
                break;
            case 2:
                ((yh.z) this.b).q1.presentFragment(un.ma(((zh.f) this.c).b.id));
                break;
            case 3:
                zf.c cVar = (zf.c) this.b;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.c);
                int i12 = cVar.G;
                wp.r1(i12).V3(tL_contacts_resolvedPeer.users, false);
                wp.r1(i12).P3(tL_contacts_resolvedPeer.chats, false);
                is.a0(i12).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                Location location = cVar.w;
                cVar.w = null;
                cVar.H(cVar.x, location, false);
                break;
            case 4:
                zf.z zVar = (zf.z) this.b;
                View view = (View) this.c;
                zVar.m0 = false;
                zVar.o0 = null;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 5:
                zf.z zVar2 = (zf.z) this.b;
                TLObject tLObject = (TLObject) this.c;
                int i13 = zVar2.s0;
                ArrayList arrayList = zVar2.K;
                zVar2.S = 0;
                if (tLObject instanceof TLRPC.TL_contacts_sponsoredPeersEmpty) {
                    if (!arrayList.isEmpty()) {
                        arrayList.clear();
                        zVar2.f();
                        break;
                    }
                } else if (tLObject instanceof TLRPC.TL_contacts_sponsoredPeers) {
                    TLRPC.TL_contacts_sponsoredPeers tL_contacts_sponsoredPeers = (TLRPC.TL_contacts_sponsoredPeers) tLObject;
                    wp.r1(i13).V3(tL_contacts_sponsoredPeers.users, true);
                    wp.r1(i13).P3(tL_contacts_sponsoredPeers.chats, true);
                    arrayList.addAll(tL_contacts_sponsoredPeers.peers);
                    zVar2.f();
                    break;
                }
                break;
            case 6:
                zf.z zVar3 = (zf.z) this.b;
                StringBuilder sb2 = (StringBuilder) this.c;
                zVar3.getClass();
                try {
                    sb2.insert(0, "DELETE FROM search_recent WHERE ");
                    is.a0(zVar3.s0).b.executeFast(sb2.toString()).stepThis().dispose();
                    break;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            case 7:
                zf.f1 f1Var = (zf.f1) this.b;
                String str = (String) this.c;
                f1Var.I = str;
                if (f1Var.r) {
                    f1Var.f.g(str, true, false, f1Var.s, f1Var.w, f1Var.y, f1Var.x, -1, 1);
                }
                int i14 = e20.s0;
                ArrayList arrayList2 = new ArrayList(i5.r(i14).e0);
                f1Var.D = true;
                int i15 = f1Var.F;
                f1Var.F = i15 + 1;
                f1Var.E = i15;
                f1Var.f();
                Utilities.g.c(new bi.u0(f1Var, str, i15, arrayList2, i14, 10));
                break;
            default:
                zf.m1 m1Var = (zf.m1) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                int i16 = m1Var.m;
                try {
                    is.a0(i16).b.beginTransaction();
                    SQLitePreparedStatement executeFast = is.a0(i16).b.executeFast("REPLACE INTO hashtag_recent_v2 VALUES(?, ?)");
                    while (true) {
                        if (i11 < arrayList3.size() && i11 != 100) {
                            zf.k1 k1Var = (zf.k1) arrayList3.get(i11);
                            executeFast.requery();
                            executeFast.bindString(1, k1Var.a);
                            executeFast.bindInteger(2, k1Var.b);
                            executeFast.step();
                            i11++;
                        }
                    }
                    executeFast.dispose();
                    if (arrayList3.size() > 100) {
                        SQLitePreparedStatement executeFast2 = is.a0(i16).b.executeFast("DELETE FROM hashtag_recent_v2 WHERE id = ?");
                        for (i10 = 100; i10 < arrayList3.size(); i10++) {
                            executeFast2.requery();
                            executeFast2.bindString(1, ((zf.k1) arrayList3.get(i10)).a);
                            executeFast2.step();
                        }
                        executeFast2.dispose();
                    }
                    is.a0(i16).b.commitTransaction();
                    break;
                } catch (Exception e7) {
                    f8.g(e7, true);
                }
        }
    }
}
