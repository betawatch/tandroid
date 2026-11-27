// default package

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class pp0 implements icc {
    public final /* synthetic */ byte a;

    public /* synthetic */ pp0(byte b) {
        this.a = b;
    }

    @Override // icc
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                ArrayList arrayList = (ArrayList) obj;
                ArrayList m = a5c.m();
                int size = m.size();
                int i = 0;
                while (i < size) {
                    Object obj3 = m.get(i);
                    i++;
                    int i2 = hr0.b;
                    b8c K = b8c.K(hr0.class);
                    K.H = (t4c) obj3;
                    arrayList.add(K);
                }
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                Boolean bool = (Boolean) obj;
                HashSet<Long> hashSet = (HashSet) obj2;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.convertToConferenceCall(bool.booleanValue(), hashSet);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ pp0(Object obj, byte b) {
        this.a = b;
    }
}
