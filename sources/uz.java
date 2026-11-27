// default package

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class uz extends ContentObserver {
    public final ContentResolver a;
    public final Uri b;
    public final /* synthetic */ vz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uz(vz vzVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.c = vzVar;
        this.a = contentResolver;
        this.b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.c.l();
    }
}
