// default package

import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.o;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ov extends vu7 {
    public final /* synthetic */ qv c;

    public ov(qv qvVar) {
        this.c = qvVar;
    }

    @Override // vu7
    public final int b() {
        TL_iv.pageBlockSlideshow pageblockslideshow = this.c.e;
        if (pageblockslideshow == null) {
            return 0;
        }
        return pageblockslideshow.items.size();
    }

    @Override // vu7
    public final int c(Object obj) {
        return this.c.e.items.contains(((nv) obj).a) ? -1 : -2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vu7
    public final Object e(fic ficVar, int i) {
        yv yvVar;
        qv qvVar = this.c;
        ex exVar = qvVar.y;
        o oVar = qvVar.E;
        TL_iv.PageBlock pageBlock = qvVar.e.items.get(i);
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            dv dvVar = new dv(qvVar.getContext(), oVar, exVar, 1);
            dvVar.a((TL_iv.pageBlockPhoto) pageBlock, exVar.F.cached_page, false, true);
            yvVar = dvVar;
        } else {
            yv yvVar2 = new yv(qvVar.getContext(), oVar, exVar, 1);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            yvVar2.b(pageblockvideo, (zv) oVar.E.f(pageblockvideo.video_id), false, true);
            yvVar = yvVar2;
        }
        ficVar.addView(yvVar);
        nv nvVar = new nv();
        nvVar.b = yvVar;
        nvVar.a = pageBlock;
        return nvVar;
    }
}
