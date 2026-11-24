// default package

import android.os.Bundle;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.webrtc.JniCommon;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class pz6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;

    public /* synthetic */ pz6(byte b, long j) {
        this.a = b;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.b;
        switch (b) {
            case 0:
                JniCommon.nativeReleaseRef(j);
                break;
            case 1:
                d S = LaunchActivity.S();
                if (S != null) {
                    S.presentFragment(yv1.ga(j));
                    break;
                }
                break;
            case 2:
                d S2 = LaunchActivity.S();
                if (S2 != null) {
                    S2.presentFragment(yv1.ga(j));
                    break;
                }
                break;
            case 3:
                jd8.d.remove(Long.valueOf(j));
                break;
            case 4:
                d S3 = LaunchActivity.S();
                if (S3 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", j);
                    bundle.putBoolean("my_profile", true);
                    bundle.putBoolean("open_gifts", true);
                    S3.presentFragment(new ProfileActivity(bundle, null));
                    break;
                }
                break;
            default:
                d S4 = LaunchActivity.S();
                if (S4 != null) {
                    S4.presentFragment(yv1.ga(j));
                    break;
                }
                break;
        }
    }
}
