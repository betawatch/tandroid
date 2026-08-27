package u3;

import android.graphics.Typeface;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import yf.g0;
import zf.n2;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements o8.e, t2.g, com.google.android.exoplayer2.upstream.l, g0, z8.e, y9.a, z8.d, OnFailureListener {
    public final /* synthetic */ int a;

    public /* synthetic */ k(int i10) {
        this.a = i10;
    }

    @Override // yf.g0
    public Typeface a() {
        switch (this.a) {
            case 9:
                return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM);
            case 10:
                return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM_ITALIC);
            case 11:
                return Typeface.create("serif", 1);
            case 12:
                return AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf");
            case 13:
                return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO);
            default:
                return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD);
        }
    }

    @Override // o8.e
    public Object apply(Object obj) {
        return (p) obj;
    }

    @Override // z8.e
    public List c(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // com.google.android.exoplayer2.upstream.l
    public com.google.android.exoplayer2.upstream.m createDataSource() {
        return new com.google.android.exoplayer2.upstream.c(ApplicationLoader.applicationContext);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        int i10 = n2.n0;
    }

    @Override // z8.d
    public Object u0(af.h hVar) {
        z9.d lambda$getComponents$0;
        lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(hVar);
        return lambda$getComponents$0;
    }

    @Override // y9.a
    public void b(y9.b bVar) {
    }

    @Override // t2.g
    public void d(Exception exc) {
    }
}
