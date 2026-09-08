package org.telegram.ui;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class sl implements jq0 {
    public final /* synthetic */ co a;

    public sl(co coVar) {
        this.a = coVar;
    }

    @Override // org.telegram.ui.jq0
    public final void b() {
        try {
            Intent intent = new Intent();
            intent.setType("video/*");
            intent.setAction("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.sizeLimit", FileLoader.DEFAULT_MAX_FILE_SIZE);
            Intent intent2 = new Intent("android.intent.action.PICK");
            intent2.setType("image/*");
            Intent createChooser = Intent.createChooser(intent2, null);
            createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent});
            this.a.startActivityForResult(createChooser, 1);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override // org.telegram.ui.jq0
    public final void a(ArrayList arrayList) {
    }
}
