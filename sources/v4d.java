// default package

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class v4d implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Intent b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v4d(Intent intent, Object obj, byte b) {
        this.a = b;
        this.b = intent;
        this.c = obj;
    }

    public final void a() {
        byte b = this.a;
        Object obj = this.c;
        Intent intent = this.b;
        switch (b) {
            case 0:
                if (intent != null) {
                    ((GoogleApiActivity) obj).startActivityForResult(intent, 2);
                    break;
                }
                break;
            default:
                if (intent != null) {
                    ((c36) obj).startActivityForResult(intent, 2);
                    break;
                }
                break;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException e) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
