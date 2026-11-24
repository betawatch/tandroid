// default package

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class tz extends ContentObserver {
    public final ContentResolver a;
    public final Uri b;
    public final /* synthetic */ uz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tz(uz uzVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.c = uzVar;
        this.a = contentResolver;
        this.b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.c.c();
    }
}
