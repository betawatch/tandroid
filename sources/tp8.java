// default package

import android.graphics.RectF;
import j$.util.function.Consumer$-CC;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class tp8 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tp8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void x(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                RectF rectF = ProfileActivity.Z6;
                HashSet hashSet = profileActivity.n5;
                ArrayList arrayList = new ArrayList((HashSet) obj);
                int i = 0;
                while (i < arrayList.size()) {
                    if (profileActivity.getMessagesController().g4.f(profileActivity.f1, ((Integer) arrayList.get(i)).intValue()) == null) {
                        arrayList.remove(i);
                        i--;
                    }
                    i++;
                }
                hashSet.clear();
                hashSet.addAll(arrayList);
                profileActivity.b4(true);
                break;
            default:
                hl.c3(new z3b((q5b) obj2, (List) obj, (byte) 4));
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        byte b = this.a;
        return Consumer$-CC.$default$andThen(this, consumer);
    }
}
