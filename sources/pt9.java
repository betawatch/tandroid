// default package

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import org.telegram.messenger.GoogleVoiceClientService;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class pt9 extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, (Class<?>) GoogleVoiceClientService.class);
        intent.putExtra("SearchActionVerificationClientExtraIntent", getIntent());
        if (Build.VERSION.SDK_INT >= 26) {
            startForegroundService(intent);
        } else {
            startService(intent);
        }
        finish();
    }
}
