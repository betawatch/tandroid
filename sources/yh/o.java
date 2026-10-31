package yh;

import android.location.Location;
import android.view.View;
import bi.u0;
import java.util.ArrayList;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.hs;
import org.telegram.messenger.i5;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.un;
import zf.f1;
import zf.k1;
import zf.m1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                q qVar = (q) this.c;
                zh.f fVar = (zh.f) this.b;
                qVar.getClass();
                qVar.presentFragment(un.ha(fVar.b.id));
                break;
            case 1:
                ((a0) this.c).q1.presentFragment(un.ha(((zh.f) this.b).b.id));
                break;
            case 2:
                zf.c cVar = (zf.c) this.c;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.b);
                int i11 = cVar.G;
                vp.r1(i11).V3(tL_contacts_resolvedPeer.users, false);
                vp.r1(i11).P3(tL_contacts_resolvedPeer.chats, false);
                hs.a0(i11).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                Location location = cVar.w;
                cVar.w = null;
                cVar.H(cVar.x, location, false);
                break;
            case 3:
                zf.z zVar = (zf.z) this.c;
                View view = (View) this.b;
                zVar.m0 = false;
                zVar.o0 = null;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 4:
                zf.z zVar2 = (zf.z) this.c;
                TLObject tLObject = (TLObject) this.b;
                int i12 = zVar2.s0;
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
                    vp.r1(i12).V3(tL_contacts_sponsoredPeers.users, true);
                    vp.r1(i12).P3(tL_contacts_sponsoredPeers.chats, true);
                    arrayList.addAll(tL_contacts_sponsoredPeers.peers);
                    zVar2.f();
                    break;
                }
                break;
            case 5:
                zf.z zVar3 = (zf.z) this.c;
                StringBuilder sb2 = (StringBuilder) this.b;
                zVar3.getClass();
                try {
                    sb2.insert(0, "DELETE FROM search_recent WHERE ");
                    hs.a0(zVar3.s0).b.executeFast(sb2.toString()).stepThis().dispose();
                    break;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            case 6:
                f1 f1Var = (f1) this.c;
                String str = (String) this.b;
                f1Var.I = str;
                if (f1Var.r) {
                    f1Var.f.g(str, true, false, f1Var.s, f1Var.w, f1Var.y, f1Var.x, -1, 1);
                }
                int i13 = d20.s0;
                ArrayList arrayList2 = new ArrayList(i5.r(i13).e0);
                f1Var.D = true;
                int i14 = f1Var.F;
                f1Var.F = i14 + 1;
                f1Var.E = i14;
                f1Var.f();
                Utilities.g.c(new u0(f1Var, str, i14, arrayList2, i13, 10));
                break;
            default:
                m1 m1Var = (m1) this.c;
                ArrayList arrayList3 = (ArrayList) this.b;
                int i15 = m1Var.m;
                try {
                    hs.a0(i15).b.beginTransaction();
                    SQLitePreparedStatement executeFast = hs.a0(i15).b.executeFast("REPLACE INTO hashtag_recent_v2 VALUES(?, ?)");
                    int i16 = 0;
                    while (true) {
                        if (i16 < arrayList3.size() && i16 != 100) {
                            k1 k1Var = (k1) arrayList3.get(i16);
                            executeFast.requery();
                            executeFast.bindString(1, k1Var.a);
                            executeFast.bindInteger(2, k1Var.b);
                            executeFast.step();
                            i16++;
                        }
                    }
                    executeFast.dispose();
                    if (arrayList3.size() > 100) {
                        SQLitePreparedStatement executeFast2 = hs.a0(i15).b.executeFast("DELETE FROM hashtag_recent_v2 WHERE id = ?");
                        for (i10 = 100; i10 < arrayList3.size(); i10++) {
                            executeFast2.requery();
                            executeFast2.bindString(1, ((k1) arrayList3.get(i10)).a);
                            executeFast2.step();
                        }
                        executeFast2.dispose();
                    }
                    hs.a0(i15).b.commitTransaction();
                    break;
                } catch (Exception e7) {
                    f8.g(e7, true);
                }
                break;
        }
    }
}
