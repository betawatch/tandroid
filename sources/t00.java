// default package

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class t00 extends ContentObserver {
    public final ContentResolver a;
    public final Uri b;
    public final /* synthetic */ u00 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t00(u00 u00Var, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.c = u00Var;
        this.a = contentResolver;
        this.b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.c.l();
    }
}
