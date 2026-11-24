// default package

import java.io.File;
import java.util.Comparator;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.Size;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
                dl dlVar = (dl) obj;
                dl dlVar2 = (dl) obj2;
                int i5 = dlVar.b;
                int i6 = dlVar2.b;
                if (i5 >= i6) {
                    if (i5 > i6 || (i = dlVar.c) < (i2 = dlVar2.c)) {
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
                long j = ((r60) obj2).e;
                long j2 = ((r60) obj).e;
                if (j > j2) {
                    return -1;
                }
                return j < j2 ? 1 : 0;
            case 5:
                return ((cd0) obj2).b - ((cd0) obj).b;
            case 6:
                return ((cd0) obj2).b - ((cd0) obj).b;
            case 7:
                return Integer.compare(((fm4) obj2).k, ((fm4) obj).k);
            case 8:
                wg0 wg0Var = (wg0) obj;
                wg0 wg0Var2 = (wg0) obj2;
                int compare = Integer.compare(wg0Var.c, wg0Var2.c);
                return compare == 0 ? wg0Var.b.compareTo(wg0Var2.b) : compare;
            case 9:
                return ((String) obj).compareTo((String) obj2);
            case 10:
                return Integer.compare(((mz0) obj2).b, ((mz0) obj).b);
            case 11:
                return Long.compare(((q51) obj).c, ((q51) obj2).c);
            case 12:
                long j3 = ((l61) obj2).c;
                long j4 = ((l61) obj).c;
                if (j3 > j4) {
                    return 1;
                }
                return j3 < j4 ? -1 : 0;
            case 13:
                return Long.compare(((n61) obj2).g, ((n61) obj).g);
            case 14:
                long j5 = ((u61) obj2).c;
                long j6 = ((u61) obj).c;
                if (j5 > j6) {
                    return 1;
                }
                return j5 < j6 ? -1 : 0;
            case 15:
                return Integer.compare(((a91) obj2).b, ((a91) obj).b);
            case 16:
                return Integer.compare(((a91) obj).c, ((a91) obj2).c);
            case 17:
                lambda$initCamera$0 = CameraController.lambda$initCamera$0((Size) obj, (Size) obj2);
                return lambda$initCamera$0;
            case 18:
                return Integer.compare(((od1) obj2).b, ((od1) obj).b);
            case 19:
                return ((k27) obj).e1() - ((k27) obj2).e1();
            case 20:
                return ((k27) obj2).e1() - ((k27) obj).e1();
            case 21:
                return ((Integer) obj2).compareTo((Integer) obj);
            case 22:
                return ((k27) obj2).e1() - ((k27) obj).e1();
            case 23:
                return ((s49) obj2).a.getTop() - ((s49) obj).a.getTop();
            case 24:
                fb2 fb2Var = (fb2) obj;
                fb2 fb2Var2 = (fb2) obj2;
                float f = fb2Var.e;
                float f2 = fb2Var2.e;
                if (f <= f2) {
                    if (f < f2 || (i3 = fb2Var.d) > (i4 = fb2Var2.d)) {
                        return 1;
                    }
                    if (i3 >= i4) {
                        return 0;
                    }
                }
                return -1;
            case 25:
                return gl.A(((TL_update.TL_updateGroupCallParticipants) obj).version, ((TL_update.TL_updateGroupCallParticipants) obj2).version);
            case 26:
                TLObject tLObject = (TLObject) obj;
                TLObject tLObject2 = (TLObject) obj2;
                int j0 = kf2.j0(tLObject);
                int j02 = kf2.j0(tLObject2);
                if (j0 > j02) {
                    return 1;
                }
                if (j0 < j02) {
                    return -1;
                }
                if ((tLObject instanceof TLRPC.ChannelParticipant) && (tLObject2 instanceof TLRPC.ChannelParticipant)) {
                    return (int) (k27.B1(((TLRPC.ChannelParticipant) tLObject).peer) - k27.B1(((TLRPC.ChannelParticipant) tLObject2).peer));
                }
                return 0;
            case 27:
                int j03 = kf2.j0((TLObject) obj);
                int j04 = kf2.j0((TLObject) obj2);
                if (j03 > j04) {
                    return 1;
                }
                return j03 < j04 ? -1 : 0;
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
