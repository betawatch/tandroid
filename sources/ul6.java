// default package

import org.telegram.messenger.a;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ul6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ float c;

    public /* synthetic */ ul6(String str, float f, byte b) {
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
