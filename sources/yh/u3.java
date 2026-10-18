package yh;

import ai.y9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.f61;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u3 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        int i10 = this.a;
        int i11 = 0;
        Object obj3 = this.b;
        switch (i10) {
            case 0:
                g4.U((g4) obj3, (ArrayList) obj);
                break;
            case 1:
                l4 l4Var = (l4) obj3;
                ArrayList arrayList = (ArrayList) obj;
                y9 y9Var = l4Var.Y;
                if (y9Var != null) {
                    ArrayList arrayList2 = y9Var.l;
                    arrayList.add(f61.C(AndroidUtilities.dp(16.0f)));
                    if (y9Var.i && arrayList2.isEmpty()) {
                        f61 o10 = f61.o(1, 34);
                        o10.u = 1;
                        arrayList.add(o10);
                        f61 o11 = f61.o(2, 34);
                        o11.u = 1;
                        arrayList.add(o11);
                        f61 o12 = f61.o(3, 34);
                        o12.u = 1;
                        arrayList.add(o12);
                        f61 o13 = f61.o(4, 34);
                        o13.u = 1;
                        arrayList.add(o13);
                        f61 o14 = f61.o(5, 34);
                        o14.u = 1;
                        arrayList.add(o14);
                        f61 o15 = f61.o(6, 34);
                        o15.u = 1;
                        arrayList.add(o15);
                        f61 o16 = f61.o(7, 34);
                        o16.u = 1;
                        arrayList.add(o16);
                        f61 o17 = f61.o(8, 34);
                        o17.u = 1;
                        arrayList.add(o17);
                        f61 o18 = f61.o(9, 34);
                        o18.u = 1;
                        arrayList.add(o18);
                    } else {
                        int size = arrayList2.size();
                        int i12 = 0;
                        int i13 = 3;
                        while (i12 < size) {
                            Object obj4 = arrayList2.get(i12);
                            i12++;
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj4;
                            if (!savedStarGift.collection_id.contains(Integer.valueOf(l4Var.X))) {
                                int i14 = g1.a;
                                f61 J = f61.J(g1.class);
                                J.u = 1;
                                J.z = 0;
                                J.G = savedStarGift;
                                J.q = true;
                                J.f = true;
                                J.r = false;
                                HashSet hashSet = l4Var.Z;
                                int i15 = savedStarGift.msg_id;
                                J.K(hashSet.contains(Long.valueOf(i15 == 0 ? savedStarGift.saved_id : i15)));
                                J.u = 1;
                                arrayList.add(J);
                                i13--;
                                if (i13 == 0) {
                                    i13 = 3;
                                }
                            }
                        }
                        if (y9Var.i || !y9Var.j) {
                            while (true) {
                                if (i11 < (i13 <= 0 ? 3 : i13)) {
                                    i11++;
                                    f61 o19 = f61.o(i11, 34);
                                    o19.u = 1;
                                    arrayList.add(o19);
                                }
                            }
                        }
                    }
                    arrayList.add(f61.C(AndroidUtilities.dp(68.0f)));
                    break;
                }
                break;
            case 2:
                zh.d dVar = (zh.d) obj3;
                TLRPC.ShareThemeBackdrops shareThemeBackdrops = (TLRPC.ShareThemeBackdrops) obj;
                ArrayList arrayList3 = dVar.e;
                dVar.c = false;
                if (shareThemeBackdrops instanceof TLRPC.TL_shareThemeBackdrops) {
                    TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops = (TLRPC.TL_shareThemeBackdrops) shareThemeBackdrops;
                    dVar.b = tL_shareThemeBackdrops;
                    try {
                        SerializedData serializedData = new SerializedData(tL_shareThemeBackdrops.getObjectSize());
                        dVar.b.serializeToStream(serializedData);
                        MessagesController.getMainSettings(dVar.a).edit().putString("qrBackdrops", Utilities.bytesToHex(serializedData.toByteArray())).apply();
                        serializedData.cleanup();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                dVar.d = shareThemeBackdrops != null;
                ArrayList arrayList4 = new ArrayList(arrayList3);
                arrayList3.clear();
                int size2 = arrayList4.size();
                while (i11 < size2) {
                    Object obj5 = arrayList4.get(i11);
                    i11++;
                    ((Runnable) obj5).run();
                }
                break;
            default:
                zh.i0 i0Var = (zh.i0) obj3;
                TLRPC.ShareTheme shareTheme = (TLRPC.ShareTheme) obj;
                if (shareTheme != null && !i0Var.E && !i0Var.x) {
                    int i16 = i0Var.a;
                    zh.u0[] u0VarArr = zh.u0.d;
                    if (u0VarArr[i16] == null) {
                        u0VarArr[i16] = new zh.u0(i16);
                    }
                    u0VarArr[i16].a(i0Var.c.f, shareTheme);
                    TLRPC.ShareTheme shareTheme2 = i0Var.H;
                    if (shareTheme2 != null) {
                        byte[] b10 = zh.u0.b(shareTheme);
                        byte[] b11 = zh.u0.b(shareTheme2);
                        if (b10 != null && Arrays.equals(b10, b11)) {
                        }
                    } else if (shareTheme == shareTheme2) {
                    }
                    i0Var.a(shareTheme);
                    break;
                }
                break;
        }
    }
}
