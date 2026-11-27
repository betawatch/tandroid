// default package

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class xp8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ TLRPC.User b;

    public /* synthetic */ xp8(TLRPC.User user, byte b) {
        this.a = b;
        this.b = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.User user = this.b;
        switch (b) {
            case 0:
                RectF rectF = ProfileActivity.Z6;
                hl.g("@" + lbc.p(user));
                break;
            case 1:
                zl8.h1(new ArrayList(Arrays.asList(user)));
                break;
            case 2:
                zl8.h1(new ArrayList(Arrays.asList(user)));
                break;
            default:
                zl8.h1(new ArrayList(Arrays.asList(user)));
                break;
        }
    }
}
