// default package

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class vfa implements if7, fd {
    public final /* synthetic */ eja a;
    public final /* synthetic */ TL_stories.StoryItem b;

    public /* synthetic */ vfa(eja ejaVar, TL_stories.StoryItem storyItem) {
        this.a = ejaVar;
        this.b = storyItem;
    }

    @Override // if7
    public final void a(String str) {
        this.a.y0(this.b, str);
    }

    @Override // fd
    public final void w(id idVar, int i) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.b);
        eja ejaVar = this.a;
        e eVar = ejaVar.y1;
        eVar.getMessagesController().O1().r(arrayList, ejaVar.m1);
        d31.b0(eVar).Q(R.raw.ic_delete, 36, ob6.G(1, "StoriesDeleted", new Object[0])).j();
        ejaVar.E(false);
    }
}
