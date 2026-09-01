package s2;

import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public interface b {
    void getBox(WritableByteChannel writableByteChannel);

    f getParent();

    long getSize();

    String getType();

    void setParent(f fVar);
}
