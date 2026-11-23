package org.telegram.utils.twidget;

import android.content.res.AssetManager;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class q implements y, x {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.utils.twidget.y
    public void a(byte[] bArr) {
        ((WidgetEngineBackend) this.b).lambda$selectableText$5(bArr);
    }

    public InputStream b(String str) {
        switch (this.a) {
            case 2:
                ZipFile zipFile = (ZipFile) this.b;
                String str2 = WidgetEngineService.b;
                ZipEntry entry = zipFile.getEntry("assets/WidgetSandbox/" + str);
                if (entry != null) {
                    return zipFile.getInputStream(entry);
                }
                throw new FileNotFoundException(str);
            default:
                AssetManager assetManager = (AssetManager) this.b;
                String str3 = WidgetEngineService.b;
                return assetManager.open("WidgetSandbox/" + str);
        }
    }

    @Override // org.telegram.utils.twidget.x
    public void run() {
        ((y) this.b).a(null);
    }
}
