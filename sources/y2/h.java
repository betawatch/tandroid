package y2;

import android.view.View;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements e2.h {
    public final /* synthetic */ int a;

    public /* synthetic */ h(int i10) {
        this.a = i10;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((ExecutorService) obj).shutdown();
                break;
            case 1:
                View view = (View) obj;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                break;
            case 2:
                ((View) obj).setTranslationY(0.0f);
                break;
            default:
                ((zh.k) ((View) obj)).invalidate();
                break;
        }
    }
}
