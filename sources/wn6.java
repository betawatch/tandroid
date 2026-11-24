// default package

import org.telegram.messenger.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class wn6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ float c;

    public /* synthetic */ wn6(String str, float f, byte b) {
        this.a = b;
        this.b = str;
        this.c = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a.b.getSharedPreferences("media_saved_pos", 0).edit().putFloat(this.b, this.c).commit();
                break;
            default:
                a.b.getSharedPreferences("media_saved_pos", 0).edit().putFloat(this.b, this.c).commit();
                break;
        }
    }
}
