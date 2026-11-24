// default package

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class x52 implements Comparator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ x52(ArrayList arrayList, byte b) {
        this.a = b;
        this.b = arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0069, code lost:
    
        if (r8.a != 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006e, code lost:
    
        if (r8.a != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008c, code lost:
    
        if (r8.a != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0091, code lost:
    
        if (r8.a != 0) goto L44;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        byte b = this.a;
        ArrayList arrayList = this.b;
        switch (b) {
            case 0:
                yn6 yn6Var = (yn6) obj;
                yn6 yn6Var2 = (yn6) obj2;
                boolean z = ChatAttachAlertPhotoLayout.r1;
                if (yn6Var.a != 0) {
                    break;
                } else {
                    break;
                }
                int indexOf = arrayList.indexOf(yn6Var);
                int indexOf2 = arrayList.indexOf(yn6Var2);
                if (indexOf <= indexOf2) {
                    if (indexOf >= indexOf2) {
                        return 0;
                    }
                    return -1;
                }
                return 1;
            case 1:
                yn6 yn6Var3 = (yn6) obj;
                yn6 yn6Var4 = (yn6) obj2;
                if (yn6Var3.a != 0) {
                    break;
                } else {
                    break;
                }
                int indexOf3 = arrayList.indexOf(yn6Var3);
                int indexOf4 = arrayList.indexOf(yn6Var4);
                if (indexOf3 <= indexOf4) {
                    if (indexOf3 >= indexOf4) {
                        return 0;
                    }
                    return -1;
                }
                return 1;
            case 2:
                int indexOf5 = arrayList.indexOf(Long.valueOf(((TLRPC.TL_messages_stickerSet) obj).set.id));
                int indexOf6 = arrayList.indexOf(Long.valueOf(((TLRPC.TL_messages_stickerSet) obj2).set.id));
                if (indexOf5 > indexOf6) {
                    return 1;
                }
                return indexOf5 < indexOf6 ? -1 : 0;
            default:
                ds6 ds6Var = (ds6) obj;
                ds6 ds6Var2 = (ds6) obj2;
                int indexOf7 = arrayList.indexOf(ds6Var.a);
                int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
                if (indexOf7 < 0) {
                    indexOf7 = Integer.MAX_VALUE;
                }
                int indexOf8 = arrayList.indexOf(ds6Var2.a);
                if (indexOf8 >= 0) {
                    i = indexOf8;
                }
                if (indexOf7 >= i) {
                    if (indexOf7 <= i) {
                        int length = ds6Var.b.length();
                        int length2 = ds6Var2.b.length();
                        if (length >= length2) {
                            if (length <= length2) {
                                return 0;
                            }
                        }
                    }
                    return 1;
                }
                return -1;
        }
    }
}
