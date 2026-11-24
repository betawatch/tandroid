// default package

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
