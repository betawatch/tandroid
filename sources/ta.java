// default package

import java.io.File;
import java.util.Comparator;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.Size;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ta implements Comparator {
    public final /* synthetic */ byte a;

    public /* synthetic */ ta(byte b) {
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
                return (int) (((eb) obj2).c - ((eb) obj).c);
            case 1:
                return (int) (((eb) obj2).c - ((eb) obj).c);
            case 2:
                el elVar = (el) obj;
                el elVar2 = (el) obj2;
                int i5 = elVar.b;
                int i6 = elVar2.b;
                if (i5 >= i6) {
                    if (i5 > i6 || (i = elVar.c) < (i2 = elVar2.c)) {
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
                long j = ((t60) obj2).e;
                long j2 = ((t60) obj).e;
                if (j > j2) {
                    return -1;
                }
                return j < j2 ? 1 : 0;
            case 5:
                return ((ed0) obj2).b - ((ed0) obj).b;
            case 6:
                return ((ed0) obj2).b - ((ed0) obj).b;
            case 7:
                return Integer.compare(((ko4) obj2).k, ((ko4) obj).k);
            case 8:
                xg0 xg0Var = (xg0) obj;
                xg0 xg0Var2 = (xg0) obj2;
                int compare = Integer.compare(xg0Var.c, xg0Var2.c);
                return compare == 0 ? xg0Var.b.compareTo(xg0Var2.b) : compare;
            case 9:
                return ((String) obj).compareTo((String) obj2);
            case 10:
                return Integer.compare(((uz0) obj2).b, ((uz0) obj).b);
            case 11:
                return Long.compare(((y51) obj).c, ((y51) obj2).c);
            case 12:
                long j3 = ((t61) obj2).c;
                long j4 = ((t61) obj).c;
                if (j3 > j4) {
                    return 1;
                }
                return j3 < j4 ? -1 : 0;
            case 13:
                return Long.compare(((v61) obj2).g, ((v61) obj).g);
            case 14:
                long j5 = ((c71) obj2).c;
                long j6 = ((c71) obj).c;
                if (j5 > j6) {
                    return 1;
                }
                return j5 < j6 ? -1 : 0;
            case 15:
                return Integer.compare(((j91) obj2).b, ((j91) obj).b);
            case 16:
                return Integer.compare(((j91) obj).c, ((j91) obj2).c);
            case 17:
                lambda$initCamera$0 = CameraController.lambda$initCamera$0((Size) obj, (Size) obj2);
                return lambda$initCamera$0;
            case 18:
                return Integer.compare(((xd1) obj2).b, ((xd1) obj).b);
            case 19:
                return ((Integer) obj2).compareTo((Integer) obj);
            case 20:
                return ((r47) obj).e1() - ((r47) obj2).e1();
            case 21:
                return ((r47) obj2).e1() - ((r47) obj).e1();
            case 22:
                return ((r47) obj2).e1() - ((r47) obj).e1();
            case 23:
                return ((f89) obj2).a.getTop() - ((f89) obj).a.getTop();
            case 24:
                vb2 vb2Var = (vb2) obj;
                vb2 vb2Var2 = (vb2) obj2;
                float f = vb2Var.e;
                float f2 = vb2Var2.e;
                if (f <= f2) {
                    if (f < f2 || (i3 = vb2Var.d) > (i4 = vb2Var2.d)) {
                        return 1;
                    }
                    if (i3 >= i4) {
                        return 0;
                    }
                }
                return -1;
            case 25:
                return hl.A(((TL_update.TL_updateGroupCallParticipants) obj).version, ((TL_update.TL_updateGroupCallParticipants) obj2).version);
            case 26:
                TLObject tLObject = (TLObject) obj;
                TLObject tLObject2 = (TLObject) obj2;
                int j0 = bg2.j0(tLObject);
                int j02 = bg2.j0(tLObject2);
                if (j0 > j02) {
                    return 1;
                }
                if (j0 < j02) {
                    return -1;
                }
                if ((tLObject instanceof TLRPC.ChannelParticipant) && (tLObject2 instanceof TLRPC.ChannelParticipant)) {
                    return (int) (r47.B1(((TLRPC.ChannelParticipant) tLObject).peer) - r47.B1(((TLRPC.ChannelParticipant) tLObject2).peer));
                }
                return 0;
            case 27:
                int j03 = bg2.j0((TLObject) obj);
                int j04 = bg2.j0((TLObject) obj2);
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
