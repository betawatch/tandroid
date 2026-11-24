// default package

import java.io.File;
import java.util.Comparator;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.Size;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class sa implements Comparator {
    public final /* synthetic */ byte a;

    public /* synthetic */ sa(byte b) {
        this.a = b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        int i2;
        int lambda$initCamera$0;
        int i3;
        int i4;
        switch (this.a) {
            case 0:
                return (int) (((db) obj2).c - ((db) obj).c);
            case 1:
                return (int) (((db) obj2).c - ((db) obj).c);
            case 2:
                dm dmVar = (dm) obj;
                dm dmVar2 = (dm) obj2;
                int i5 = dmVar.b;
                int i6 = dmVar2.b;
                if (i5 >= i6) {
                    if (i5 > i6 || (i = dmVar.c) < (i2 = dmVar2.c)) {
                        return 1;
                    }
                    if (i <= i2) {
                        return 0;
                    }
                }
                return -1;
            case 3:
                return Integer.bitCount(((Integer) obj2).intValue()) - Integer.bitCount(((Integer) obj).intValue());
            case 4:
                long j = ((r70) obj2).e;
                long j2 = ((r70) obj).e;
                if (j > j2) {
                    return -1;
                }
                return j < j2 ? 1 : 0;
            case 5:
                return ((ce0) obj2).b - ((ce0) obj).b;
            case 6:
                return ((ce0) obj2).b - ((ce0) obj).b;
            case 7:
                return Integer.compare(((go4) obj2).k, ((go4) obj).k);
            case 8:
                wh0 wh0Var = (wh0) obj;
                wh0 wh0Var2 = (wh0) obj2;
                int compare = Integer.compare(wh0Var.c, wh0Var2.c);
                return compare == 0 ? wh0Var.b.compareTo(wh0Var2.b) : compare;
            case 9:
                return ((String) obj).compareTo((String) obj2);
            case 10:
                return Integer.compare(((t01) obj2).b, ((t01) obj).b);
            case 11:
                return Long.compare(((x61) obj).c, ((x61) obj2).c);
            case 12:
                long j3 = ((s71) obj2).c;
                long j4 = ((s71) obj).c;
                if (j3 > j4) {
                    return 1;
                }
                return j3 < j4 ? -1 : 0;
            case 13:
                return Long.compare(((u71) obj2).g, ((u71) obj).g);
            case 14:
                long j5 = ((b81) obj2).c;
                long j6 = ((b81) obj).c;
                if (j5 > j6) {
                    return 1;
                }
                return j5 < j6 ? -1 : 0;
            case 15:
                return Integer.compare(((ja1) obj2).b, ((ja1) obj).b);
            case 16:
                return Integer.compare(((ja1) obj).c, ((ja1) obj2).c);
            case 17:
                lambda$initCamera$0 = CameraController.lambda$initCamera$0((Size) obj, (Size) obj2);
                return lambda$initCamera$0;
            case 18:
                return Integer.compare(((we1) obj2).b, ((we1) obj).b);
            case 19:
                return ((k47) obj).e1() - ((k47) obj2).e1();
            case 20:
                return ((k47) obj2).e1() - ((k47) obj).e1();
            case 21:
                return ((Integer) obj2).compareTo((Integer) obj);
            case 22:
                return ((k47) obj2).e1() - ((k47) obj).e1();
            case 23:
                return ((u69) obj2).a.getTop() - ((u69) obj).a.getTop();
            case 24:
                qc2 qc2Var = (qc2) obj;
                qc2 qc2Var2 = (qc2) obj2;
                float f = qc2Var.e;
                float f2 = qc2Var2.e;
                if (f <= f2) {
                    if (f < f2 || (i3 = qc2Var.d) > (i4 = qc2Var2.d)) {
                        return 1;
                    }
                    if (i3 >= i4) {
                        return 0;
                    }
                }
                return -1;
            case 25:
                return gm.A(((TL_update.TL_updateGroupCallParticipants) obj).version, ((TL_update.TL_updateGroupCallParticipants) obj2).version);
            case 26:
                TLObject tLObject = (TLObject) obj;
                TLObject tLObject2 = (TLObject) obj2;
                int k0 = wg2.k0(tLObject);
                int k02 = wg2.k0(tLObject2);
                if (k0 > k02) {
                    return 1;
                }
                if (k0 < k02) {
                    return -1;
                }
                if ((tLObject instanceof TLRPC.ChannelParticipant) && (tLObject2 instanceof TLRPC.ChannelParticipant)) {
                    return (int) (k47.B1(((TLRPC.ChannelParticipant) tLObject).peer) - k47.B1(((TLRPC.ChannelParticipant) tLObject2).peer));
                }
                return 0;
            case 27:
                int k03 = wg2.k0((TLObject) obj);
                int k04 = wg2.k0((TLObject) obj2);
                if (k03 > k04) {
                    return 1;
                }
                return k03 < k04 ? -1 : 0;
            case 28:
                long j7 = ((TLRPC.TL_contact) obj).user_id;
                long j8 = ((TLRPC.TL_contact) obj2).user_id;
                if (j7 > j8) {
                    return 1;
                }
                return j7 < j8 ? -1 : 0;
            default:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
        }
    }
}
